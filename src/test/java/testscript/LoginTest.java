package testscript;
import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.SeleniumCommon;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webpages.LoginPage;

import java.awt.*;
import java.io.IOException;




public class LoginTest {
    @BeforeClass
    public void beforeClass() throws IOException {
        SeleniumCommon.launchBrowser();
        SeleniumCommon.openWebSite();
    }

    @Test
    public void method1() throws IOException, AWTException {

        LoginPage login = new LoginPage();
        SeleniumCommon.CompareAnyTitle("Gmail");

        boolean flag;
        flag = login.login1();
        Assert.assertTrue(flag);
        SeleniumCommon.GetCurrentPageTitle();

        SeleniumCommon.CompareAnyTitle("Inbox (1) - testpereneal@gmail.com - Gmail");
       // flag=login.login2();
        login.verifyUser();
        login.searchByID();
        //login.checkMail();
        login.LogOut();
        //SeleniumCommon.closeDriver();
    }


}





