package org.bsc.forge;

import java.util.Arrays;

import javax.inject.Inject;

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
