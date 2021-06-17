package testscript;
import Reusablecomponent.ExtentManager;
import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.SeleniumCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webpages.LoginPage;
import webpages.LoginPage1;

import java.awt.*;
import java.io.IOException;

public class LoginTest1 {

     @BeforeClass
      public void beforeClass() throws IOException {
          SeleniumCommon.launchBrowser();
          SeleniumCommon.openWebSite();

      }
      @Test (priority=1 ,description="Verified URl")
      public void Verified_URL() throws IOException, AWTException{

          LoginPage1 login1 = new LoginPage1();

      }




    @Test (priority=2 ,description="Verified Title")
    public void Verified_Page_Title(){

      SeleniumCommon.CompareAnyTitle("Gmail");

    }

    @Test (priority=3,description="Verified Page Title:Google")
    public void Verified_Logo(){
    LoginPage1.logo();
    }



    @Test (priority=4,description="Verified Text:Sign in")
    public void Verified_Text1(){
        LoginPage1.text1();

    }

    @Test (priority=5,description="Verified Text:Continue to Gmail")
    public void Verified_Text2(){
        LoginPage1.text2();
    }

    @Test (priority=6, description="Verified Placeholder:Email or Phone")
    public void Verified_EmailId_Placeholder(){
         SeleniumCommon.waitForSecond(5);
        LoginPage1.placeholder();
    }

    @Test(priority=7,description="Verified Text:Not you computer")
    public void Verified_Text_Not_you_computer(){
        LoginPage1.Not_you_computer_text();
    }


    @Test(priority =8,description = "Learm more Link")
    public void Verified_LearnMore_Link() throws IOException, AWTException {
        LoginPage1.checkLearn_more_link();
        ExtentTestManager.reporterLog("Navigated to correct URl");
    }


    @Test(priority=9,description="Submit Empty Email_id")
    public void Verified_Next_Button(){
        SeleniumCommon.waitForSecond(5);
        LoginPage.nextbutton();

    }


    @Test(priority =10,description = "Get Incoreect Email-Id")
    public void Verified_InCorrectEmailId() throws IOException {
        LoginPage.getemail_value_incorrect();
    }



    @Test(priority =11,description = "Get Email-Id")
    public void Verified_CorrectEmailId() throws IOException {
        LoginPage1.getemail_value();
    }






     /* @Test(priority =13,description = "Get Empty Email-Id")
    public void Verified_EmptyEmailId() throws IOException {
        LoginPage.getemail_value_empty();

    }


    @Test(priority=9,description="Verified :Create Account")
    public void Verified_Create_Account(){
        //LoginPage.Create_account();
        SeleniumCommon.Verify_list();
    }




    @Test(priority=15)
    public void Verified_Forgot_Email_button(){
        LoginPage1.forgot_email();
    }
*/

}
