package org.bsc.forge;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.forge.test.AbstractShellTest;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;



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
      getShell().execute("artifactory setup http://support.softphone.it/artifactory --username bsorrentino --password BactiuSP");
      getShell().execute("artifactory");
      
      final String sb = new StringBuilder()
      				.append("Context Information\n")
      				.append("endpoint: http://support.softphone.it/artifactory/api\n")
      				.append("username: bsorrentino\n")
      				.append("password: *****\n")
      				.toString();
      
      //Assert.assertThat( super.getOutput(), IsEqual.equalTo(sb.toString()));
      Assert.assertThat( super.getOutput().startsWith(sb.toString()), Is.is( true));
      
   }

   @Test @Ignore
   public void testCommand() throws Exception
   {
      getShell().execute("artifactory command");
   }

   @Test @Ignore
   public void testPrompt() throws Exception
   {
      queueInputLines("y");
      getShell().execute("artifactory prompt foo bar");
   }
}
