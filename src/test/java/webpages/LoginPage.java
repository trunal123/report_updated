package webpages;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.Log;
import Reusablecomponent.PropertiesReading;
import Reusablecomponent.SeleniumCommon;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends SeleniumCommon {
    @FindBy(xpath = "//input[@id='identifierId']")
    public static WebElement email;
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement passwd;
    @FindBy(xpath = "//div[text()='Use another account']")
    WebElement UseAnotherAccount;
    @FindBy(xpath = "//div[@class='VfPpkd-RLmnJb']")
    WebElement nextButton;
    @FindBy(xpath = "//img[@class='gb_uc']")
    WebElement gmailLogo;
    @FindBy(xpath = "//img[@class='gb_Da gbii']")
    WebElement userName;
    @FindBy(xpath = "//div[@class='gb_ob']")
    WebElement userEmail;




    public LoginPage() throws IOException  // Constructor to initialize Web elements using Page factory
    {
        driver = SeleniumCommon.getDriverInstance();
        ExtentTestManager.reporterLog("Chrome Invoked");
        PageFactory.initElements(driver, this);
        ExtentTestManager.reporterLog("URL Opened");
    }



    public void checktitle(){
        SeleniumCommon.CompareAnyTitle("Gmail");
        ExtentTestManager.reporterLog("Title Checked");
    }
    public void login() throws IOException {
        String url = PropertiesReading.getProperty("Config", "baseURL");
        String username;
        String password;
        username = PropertiesReading.getProperty("Config", "qa_username");
        password = PropertiesReading.getProperty("Config", "qa_password");
        Log.info("Username: " + username);
        Log.info("Password: " + password);
        SeleniumCommon.findElement("id", "email").sendKeys(username);
        SeleniumCommon.waitForSecond(5);
        SeleniumCommon.findElement("id", "password").sendKeys(password);
        Log.info("Entered username and password");
        SeleniumCommon.findElement("xpath", "//input[@type=\"submit\"]").click();
        Log.info("Clicking on Log in Button");
        SeleniumCommon.waitForClosingLoader();
    }
    public boolean login1() throws IOException {
        String url = PropertiesReading.getProperty("Config", "baseURL");
        String username;
        String password;
        username = PropertiesReading.getProperty("Config", "qa_username");
        password = PropertiesReading.getProperty("Config", "qa_password");
        Log.info("Username: " + username);
        Log.info("Password: " + password);
        SeleniumCommon.findElement("xpath", "//input[@id='identifierId']").sendKeys(username);
        ExtentTestManager.reporterLog("Email-ID Sent :" +username );
        SeleniumCommon.findElement("xpath", "//div[@class='VfPpkd-RLmnJb']").click();
        Log.info("Clicking on next Button");
        ExtentTestManager.reporterLog("Clicked On Next");

        SeleniumCommon.waitForSecond(5);
        SeleniumCommon.findElement("xpath", "//input[@type='password']").sendKeys(password);
        ExtentTestManager.reporterLog("Password Sent :" +password);
        Log.info("Entered username and password");
        SeleniumCommon.findElement("xpath", "//div[@class='VfPpkd-RLmnJb']").click();
        Log.info("Clicking on next Button");
        ExtentTestManager.reporterLog("Clicked on Next Button");
        Boolean flag = false;
        flag = SeleniumCommon.findElement("xpath", "//img[@class='gb_uc']").isDisplayed();
        return flag;
    }
    public boolean login2() throws Throwable {
        PageFactory.initElements(driver, this);
        String url = PropertiesReading.getProperty("Config", "baseURL");
        String username;
        String password;
        username = PropertiesReading.getProperty("Config", "qa_username");
        password = PropertiesReading.getProperty("Config", "qa_password");
        Log.info("Username: " + username);
        Log.info("Password: " + password);
        SeleniumCommon.input(email, username);
        SeleniumCommon.ClickOnWebElement(nextButton);
        SeleniumCommon.waitForSecond(5);
        SeleniumCommon.input(passwd, password);
        Log.info("Entered username and password");
        SeleniumCommon.waitForSecond(5);
        SeleniumCommon.ClickOnWebElement(nextButton);
        Log.info("Clicking on next Button");
        Boolean flag = false;
        flag = SeleniumCommon.findElement("xpath", "//img[@class='gb_uc']").isDisplayed();
        return flag;
    }
    public void verifyUser() {
        SeleniumCommon.findElement("xpath", "//img[@class='gb_Da gbii']").click();
        //SeleniumCommon.click(userName);
        //SeleniumCommon.waitForSecond(2);
        WebElement ActualTitle = driver.findElement(By.className("gb_ob"));
        String ExceptedTitle = "qapereal@gmail.com";
        if (ActualTitle.equals(ExceptedTitle)) {
            Log.info("user logged in  is matching");
        } else {
            Log.info("user logged in  is matching");
        }
        SeleniumCommon.findElement("xpath", "//img[@class='gb_Da gbii']").click();
       /* if (userEmail.equals(ExceptedTitle)) {
            Log.info("user logged in  is matching");
       // } else {
            Log.info("user logged in is not  matching");
        }*/
    }
    public void
    searchByID() throws AWTException {
        SeleniumCommon.findElement("cssSelector", "#gs_lc50 > input:nth-child(1)").sendKeys("poonamghatage21@gmail.com");
        Log.info("Search by Id poonamghatage21@gmail.com");
        SeleniumCommon.ClickEnter();
        SeleniumCommon.waitForSecond(10);
        // 20 SeleniumCommon.findElement("xpath", "//*[@id=\":6x\"]/text()").click();
        //
        //
        // selenium.click("css=a[href*='listDetails.do'][id='oldcontent']");
       // 20 Log.info("Identified Specific mail at mentioned xpath");
        // 20SeleniumCommon.waitForSecond(10);
    }
    public void checkMail() throws AWTException {
        SeleniumCommon.ClickEnter();
        SeleniumCommon.findElement("xpath", "//a[@href='https://www.flickonclick.com/checkout-these-exciting-latest-offers-from-jiomart/']");
        Log.info("Click on linkavailable in the mail");
        SeleniumCommon.ClickEnter();
        ArrayList<String> allTabs = new ArrayList<>(driver.getWindowHandles());
        SeleniumCommon.waitForSecond(3);
        Log.info("Open link in new tab");
        String ActualTitle1 = driver.getTitle();
        String ExceptedTitle1 = "checkout these exciting latest offers from jiomart";
        if (ActualTitle1.equals(ExceptedTitle1)) {
            Log.info("link is matching");
        } else {
            Log.info("link is not matching");
        }
        driver.switchTo().window(allTabs.get(0));
        SeleniumCommon.waitForSecond(3);
    }
    public void LogOut() {
        SeleniumCommon.findElement("xpath", "//img[@class='gb_Da gbii']").click();
        Log.info("Clicking on User name for Log out");
        SeleniumCommon.waitForSecond(2);
        SeleniumCommon.findElement("xpath", "//a[@class='gb_Db gb_Uf gb_3f gb_Qe gb_4c']").click();
        Log.info("Clicked on logout button");
        Log.info("Clicking on Log out Button");
        SeleniumCommon.waitForSecond(2);
        //SeleniumCommon.closeDriver();
        Log.info("Close browser");
    }


    public static void title() {
        WebElement str_google = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
        String expect = "Google";
        SeleniumCommon.comparetext(str_google,expect);
    }



    public static void text1() {
        WebElement str_signin = driver.findElement(By.xpath("//*[@id=\"headingText\"]/span"));
        String expect = "Sign in";
        SeleniumCommon.comparetext(str_signin,expect);
    }

    public static void text2() {
        WebElement str_continue = driver.findElement(By.xpath("//*[@id=\"headingSubtext\"]/span"));
        String expect = "Continue to Gmail";
        SeleniumCommon.comparetext(str_continue,expect );
    }

    public static void paceholder() {
        WebElement strvalu = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        String expect_s = "Email or phone";
        SeleniumCommon.comparetext(strvalu,expect_s);
    }


    public static void forgot_email() {
        WebElement e=driver.findElement(By.xpath("//div[@class = 'PrDSKc']//button"));
        SeleniumCommon.ClickOnWebElement(e);
    }




    public static void Create_account(){
        SeleniumCommon.waitForSecond(5);
        WebElement w9 = driver.findElement(By.xpath("//span[contains(text(), 'Create account')]"));
        String expect_s = "Create account";
        SeleniumCommon.comparetext(w9,expect_s);

    }

    public static void nextbutton(){
        SeleniumCommon.waitForSecond(10);
        WebElement w10 = driver.findElement(By.xpath("//span[contains(text(), 'Next')]"));
        SeleniumCommon.ClickOnWebElement(w10);

        WebElement w2= driver.findElement(By.xpath("//input[@id='identifierId']"));
        w2.clear();

    }

    public static void  getemail_value_incorrect() throws IOException {

        WebElement l = driver.findElement(By.xpath("//input[@id='identifierId']"));
        l.sendKeys("poonam.ghatage@perennial.com");
        nextbutton();


        //String expectvalue="poonam.ghatage@perennialsys.com";
       // SeleniumCommon.getEnteredvalue(l,expectvalue);

    }



    public static void  getemail_value_empty() throws IOException {

        WebElement l = driver.findElement(By.xpath("//input[@id='identifierId']"));
        l.sendKeys(" ");

        String expectvalue="poonam.ghatage@perennialsys.com";
        SeleniumCommon.getEnteredvalue(l,expectvalue);
        nextbutton();

       // String url = PropertiesReading.getProperty("Config", "baseURL");
        //driver.navigate().to(url);
    }





}