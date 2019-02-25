package Test.Example;


import DSAdminPages.DSAdminLandingPageObjects;
import com.aventstack.extentreports.ExtentTest;

import org.testng.annotations.Test;

public class DSAdminLandingPageTest extends BaseTest {

   @Test
   public void givenLandingPage_Login()throws Exception{
       ExtentTest test = extent.createTest("DSAdmin Login", "User Login successful");
       test.pass("User Logged in");
       //test.log(Status.INFO, "This step shows usage of log(status, details)");
       //test.info("This step shows usage of info(details)");

       try {
           Thread.sleep(3000);
       } catch (InterruptedException e){
           e.printStackTrace();
       }
   }
}

