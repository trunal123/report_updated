package testscript;

import Reusablecomponent.SeleniumCommon;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webpages.LoginPage2;
import webpages.LoginPage3;

import java.awt.*;
import java.io.IOException;

public class LoginPage3Test {



    @BeforeClass
    public void beforeClass() throws IOException {
        SeleniumCommon.waitForSecond(10);
        SeleniumCommon.launchBrowser();
        SeleniumCommon.openWebSite();

    }
    @Test(priority=1 ,description="Verified Navigated on correct Page")
    public void Verified_URL_Page2() throws IOException, AWTException {
        //LoginPage2 login2 = new LoginPage2();
        LoginPage3.CompareAnyTitle("Gmail");
        LoginPage3.EnterEmailid_ClickNext();
        LoginPage3.enter_password();
        LoginPage3.Enter_Next();

    }


    @Test(priority = 2,description = "Current page Title")
    public void Page_Title(){
        SeleniumCommon.waitForSecond(10);
        LoginPage3.CompareAnyTitle("Inbox (1) - ghatagepoonam5@gmail.com - Gmail");
        SeleniumCommon.waitForSecond(10);
    }


    @Test(priority = 3,description = "Refresh The page")
    public void Refresh(){
        LoginPage3.refresh();
    }

    @Test(priority = 4,description = "Verify Dropdown")
    public void Verify_Dropdown(){
        LoginPage3.verifydropdown();

    }

    @Test(priority = 5,description = "Verify Tooltip")
    public void Verify_Tooltip(){
        LoginPage3.veriftooltip();

    }

    @Test(priority = 6,description = "Verify Icon")
    public void Verify_Icon(){
        LoginPage3.verifyicon();

    }

   /* @Test(priority = 7,description = "Set Task")
    public void Set_Task(){
        LoginPage3.assigntask();
    }*/

}
