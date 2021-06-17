package testscript;

import Reusablecomponent.SeleniumCommon;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webpages.LoginPage2;

import java.awt.*;
import java.io.IOException;

public class LoginPage2Test {

   @BeforeClass
    public void beforeClass() throws IOException {
        SeleniumCommon.waitForSecond(10);
        SeleniumCommon.launchBrowser();
        SeleniumCommon.openWebSite();

    }


    @Test(priority=1 ,description="Verified Navigated on correct Page")
    public void Verified_URL_Page2() throws IOException, AWTException {
        //LoginPage2 login2 = new LoginPage2();
        LoginPage2.CompareAnyTitle("Gmail");
        LoginPage2.EnterEmailid_ClickNext();
    }

    @Test(priority=2,description = "verified Text Welcome")
    public void Verified_Text_Welcome(){
        LoginPage2.text_welcome();

    }

    @Test(priority = 3,description = "Verified Email ID")
    public void Verified_UserEmail(){
        LoginPage2.verify_user();
    }

   /* @Test(priority = 4,description = "Verified Placehollder of password field")
    public void Verified_Placeholder(){
        LoginPage2.verify_Placeholder_Of_Passwordfield();
    }*/


    @Test(priority = 5,description = "Verified password")
    public void Enter_Password() throws IOException {
        LoginPage2.enter_password();

    }

    @Test(priority = 6,description = "Verified Show password Checkbox")
    public void Verify_Checkbox(){
        LoginPage2.verify_showpassword_checkbox();
    }

    @Test(priority = 7,description = "Clicked on Next")
    public void Click_Next(){
        LoginPage2.Enter_Next();
        SeleniumCommon.waitForSecond(10);
    }









}


