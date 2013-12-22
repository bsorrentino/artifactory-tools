package org.bsc.forge;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.forge.test.AbstractShellTest;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.Ignore;



public class ArtifactoryForgePluginTest extends AbstractShellTest
{
   @Deployment
   public static JavaArchive getDeployment()
   {
      return AbstractShellTest.getDeployment()
            .addPackages(true, ArtifactoryForgePlugin.class.getPackage());
   }
   
   @Test
   public void testSetupCommand() throws Exception
   {
  
      //getShell().execute("artfactory setup  http://artifactory.au-sdc.com:8080/artifactory builder builder2013.01");
      getShell().execute("artfactory setup http://support.softphone.it/artifactory bsorrentino BactiuSP");
   }

   @Test @Ignore
   public void testDefaultCommand() throws Exception
   {
      getShell().execute("artfactory");
   }

   @Test @Ignore
   public void testCommand() throws Exception
   {
      getShell().execute("artfactory command");
   }

   @Test @Ignore
   public void testPrompt() throws Exception
   {
      queueInputLines("y");
      getShell().execute("artfactory prompt foo bar");
   }
}
