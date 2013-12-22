package org.bsc.forge;

import java.util.Arrays;

import javax.inject.Inject;

import org.artifactory.client.Artifactory;
import org.artifactory.client.ArtifactoryClient;
import org.artifactory.client.Repositories;
import org.artifactory.client.model.LightweightRepository;
import org.artifactory.client.model.Repository;
import org.artifactory.client.model.RepositoryType;
import org.artifactory.client.model.impl.RepositoryTypeImpl;
import org.jboss.forge.resources.Resource;
import org.jboss.forge.resources.URLResource;
import org.jboss.forge.shell.Shell;
import org.jboss.forge.shell.exceptions.AbortedException;
import org.jboss.forge.shell.plugins.Alias;
import org.jboss.forge.shell.plugins.Command;
import org.jboss.forge.shell.plugins.DefaultCommand;
import org.jboss.forge.shell.plugins.Option;
import org.jboss.forge.shell.plugins.PipeIn;
import org.jboss.forge.shell.plugins.PipeOut;
import org.jboss.forge.shell.plugins.Plugin;
import org.jboss.forge.shell.plugins.SetupCommand;

/**
 *
 */
@Alias("artfactory")
public class ArtifactoryForgePlugin implements Plugin
{
   @Inject
   private Shell shell;

   Artifactory artifactory;
   
   @DefaultCommand
   public void defaultCommand(@PipeIn String in, PipeOut out)
   {
      out.println("Executed default command.");
   }

   @SetupCommand
   public void setup( @Option(required=true) Resource<?> endpoint, String username, String password ) throws Exception {
	   
	   if( !(endpoint instanceof URLResource) ) {
		   throw new AbortedException( "endpoint is not a valid url!");
	   }
	   
	   if( username==null) {
		   username = shell.prompt("username:");
	   }
	   if( password==null) {
		   password = shell.promptSecret("password:");
	   }
	   
	   artifactory = ArtifactoryClient.create(endpoint.getFullyQualifiedName(), username, password);
	   
	   final Repositories repos = artifactory.repositories();
	   
	   java.util.List<LightweightRepository> repoList = repos.list( RepositoryTypeImpl.LOCAL);
	   
	   for( LightweightRepository lr : repoList ) {
		   
		   shell.println( lr.toString() );
	   }
	   
	   artifactory.close();
   }
   
   @Command
   public void command(@PipeIn String in, PipeOut out, @Option String... args)
   {
      if (args == null)
         out.println("Executed named command without args.");
      else
         out.println("Executed named command with args: " + Arrays.asList(args));
   }

   @Command
   public void prompt(@PipeIn String in, PipeOut out)
   {
      if (shell.promptBoolean("Do you like writing Forge plugins?"))
         out.println("I am happy.");
      else
         out.println("I am sad.");
   }
}
