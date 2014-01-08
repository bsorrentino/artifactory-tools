package org.bsc.forge;

import java.net.URISyntaxException;
import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.bsc.ArtifactoryApi;
import org.codehaus.jackson.JsonGenerator;
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
		  out.println( "context is not valid");
	  }
      out.println(String.valueOf(_context));
   }

   @Command
   public void listRepositories(PipeOut out)
   {
		  if( !_context.isValid() ) {
			  out.println( "context is not valid");
		  }
		   String resultsObject = ArtifactoryApi.repositories(_context.client, _context.uri)
  					.getAsVndOrgJfrogArtifactoryRepositoriesRepositoryDetailsListJson("LOCAL", String.class);
  
		  
   }
   
   @Command
   public void command(@PipeIn String in, PipeOut out, @Option String... args)
   {
      if (args == null)
         out.println("Executed named command without args.");
      else
         out.println("Executed named command with args: " + Arrays.asList(args));
   }

}
