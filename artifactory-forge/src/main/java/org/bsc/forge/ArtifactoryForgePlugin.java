package org.bsc.forge;

import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.bsc.ArtifactoryApi;
import org.bsc.ArtifactoryUtils;
import org.bsc.functional.F2;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.jboss.forge.resources.Resource;
import org.jboss.forge.resources.URLResource;
import org.jboss.forge.shell.Shell;
import org.jboss.forge.shell.ShellColor;
import org.jboss.forge.shell.ShellPrintWriter;
import org.jboss.forge.shell.exceptions.AbortedException;
import org.jboss.forge.shell.plugins.Alias;
import org.jboss.forge.shell.plugins.Command;
import org.jboss.forge.shell.plugins.DefaultCommand;
import org.jboss.forge.shell.plugins.Option;
import org.jboss.forge.shell.plugins.PipeIn;
import org.jboss.forge.shell.plugins.PipeOut;
import org.jboss.forge.shell.plugins.Plugin;
import org.jboss.forge.shell.plugins.SetupCommand;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

/**
 *
 */
@Alias("artifactory")
public class ArtifactoryForgePlugin implements Plugin
{
   @Inject
   private Shell shell;

   @Singleton
   public static class Context {
		java.net.URI uri;
		String username;
		String password;
		Client client;
		
		public void init(URLResource url, String username, String password) throws URISyntaxException {
			this.username = username;
			this.password = password;
			
			String result = url.getFullyQualifiedName();
			
			if( !result.endsWith("api")) {
				if( !result.endsWith("/")) {
					result = result.concat("/");
				}
				result = result.concat("api");
			}
			
			this.uri = new java.net.URI(result);
			
			final  ClientFilter authFilter = new HTTPBasicAuthFilter(username, password);

			client = ArtifactoryApi.createClient();
			client.addFilter( authFilter );
		}

		public final boolean isValid( ) {
			return uri!=null && username!=null && password!=null;
		}
		
		public final void checkValid(ShellPrintWriter spw) {
			if( uri == null ) {
				spw.println("uri is null!");
			}
			if( username == null ) {
				spw.println("username is null!");
			}
			if( password == null ) {
				spw.println( "password is null!");				
			}
			if( !isValid() ) {
				throw new IllegalStateException( "plugin is in invalid state! Did you forget to call setup?");								
			}
		}
		@Override
		public String toString() {
			return new StringBuilder()
					.append("Context Information").append('\n')
					.append("endpoint: ").append(uri).append('\n')
					.append("username: ").append(username).append('\n')
					.append("password: ").append("*****").append('\n')
					.toString();
		}	 
		
   }
   
   @Inject Context _context;
   
   /**
    * 
    * @param endpoint
    * @param username
    * @param password
    * @throws Exception
    */
   @SetupCommand
   public void setup( @Option(required=true) Resource<?> endpoint, 
		   				@Option(name="username", shortName="u") String username, 
		   				@Option(name="password", shortName="p") String password ) throws Exception {
	   
	   if( !(endpoint instanceof URLResource) ) {
		   throw new AbortedException( "endpoint is not a valid url!");
	   }
	   
	   if( username==null) {
		   username = shell.prompt("username:");
		   if( username==null ) {
			   throw new AbortedException( "username is not a valid!");			   
		   }
	   }
	   if( password==null) {
		   password = shell.promptSecret("password:");
		   if( password==null ) {
			   throw new AbortedException( "password is not a valid!");			   
		   }
	   }
	   
	   _context.init((URLResource)endpoint, username, password );

	   shell.println(ShellColor.RED, _context.toString());
	   
	   JSONObject result = ArtifactoryApi.systemVersion(_context.client, _context.uri)
			   	.getAsVndOrgJfrogArtifactorySystemVersionJson(JSONObject.class);
	   
	   shell.println(ShellColor.RED, 
			   String.format("\nVersion: [%s] - Revision: [%s]\n", 
					   result.getString("version"),
					   result.getString("revision")));
/*	   
	   ArtifactoryUtils.forEachResults(resultsObject, new F2<Void,Integer,JsonObject>() {

		@Override
		public Void f(Integer p1, JsonObject p2) {
			
			shell.println( ShellColor.BOLD, p2.toString());
			
			return null;
		}
		   
	   });
*/	   
   }

   /**
    * 
    * @param in
    * @param out
    */
   @DefaultCommand
   public void defaultCommand(@PipeIn String in, PipeOut out)
   {
		  if( !_context.isValid() ) {
			  shell.println( ShellColor.RED, "context is not valid");
		  }

		  out.println(String.valueOf(_context));
   }

   @Command("list-repositories")
   public void listRepositories(PipeOut out) throws JSONException
   {
		  if( !_context.isValid() ) {
			  shell.println( ShellColor.RED, "context is not valid");
		  }
		  
		  JSONArray result = ArtifactoryApi.repositories(_context.client, _context.uri)
  					.getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson("LOCAL", JSONArray.class);
  
		  ArtifactoryUtils.forEachResults(result, new F2<Void,Integer,JSONObject>() {

			@Override
			public Void f(Integer p1, JSONObject p2)  {
				
				try {
					shell.println( ShellColor.BOLD,
							String.format("[%d] %s %s", p1.intValue(), p2.getString("key"), p2.getString("type") ));
				} catch (JSONException e) {
					e.printStackTrace();
				}
				
				return null;
			}
			  
		  });
		  
   }
   
   static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
   static final SimpleDateFormat artifactoryDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"); 
   
   @Command(value="list-dependencies")
   public void listDependencies(@Option(required=true) final String repository, 
		   						@Option(name="artifact", shortName="a") final String artifact, 
		   						@Option(name="since", help="not download since, Date in format dd/mm/yyyy")  String date ) throws JSONException, ParseException
   {
		  if( !_context.isValid() ) {
			  shell.println( ShellColor.RED, "context is not valid");
		  }
	   JSONObject resultObject ;
		if( date!=null ) {
			
			java.util.Date dt = dateFormat.parse(date);
			
			resultObject = ArtifactoryApi
					.search(_context.client, _context.uri)
					.usage()
					.getAsVndOrgJfrogArtifactorySearchArtifactUsageResultJson(
							dt.getTime(), 
							repository, 
							JSONObject.class)
					;
			
		}
		else {
			resultObject = ArtifactoryApi
					.search(_context.client, _context.uri)
					.artifact()
					.getAsVndOrgJfrogArtifactorySearchArtifactSearchResultJson(
													artifact, 
													repository, 
													JSONObject.class);
		
		}

		ArtifactoryUtils.forEachResults(resultObject, new F2<Void,Integer, JSONObject>() {

			@Override
			public Void f(Integer i, JSONObject p) {
				
				try {
					java.net.URI uri = new java.net.URI( p.getString("uri") );

					
					java.net.URI completeUri = new java.net.URI( new StringBuilder()
																	.append(_context.uri)
																	.append("/storage/")
																	.append(repository)
																	.toString() );
					if( p.has("lastDownloaded")) {
						String lastDownload = p.getString("lastDownloaded");
					
						shell.println( String.format("[%d] lastDownload: [%s]\t%s - ", i.intValue(), lastDownload, completeUri.relativize(uri)) ); 
					}
					else {
						shell.println( String.format("[%d]\t\t%s", i.intValue(), completeUri.relativize(uri) ) ); 
					}
				
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				
				return null;
			}
			
		});
		
   }

}
