package webpages;

import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.Log;
import Reusablecomponent.PropertiesReading;
import Reusablecomponent.SeleniumCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.io.IOException;
import java.util.List;

public class LoginPage2 extends SeleniumCommon {

    @FindBy(xpath = "//input[@id='identifierId']")
    public static WebElement email;
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement passwd;


    @FindBy(xpath = "")
    public static WebElement logo;

    public static void EnterEmailid_ClickNext() throws IOException { String username;
      username = PropertiesReading.getProperty("Config", "qa_username");
      Log.info("Username: " + username);
      SeleniumCommon.findElement("xpath", "//input[@id='identifierId']").sendKeys(username);
      SeleniumCommon.waitForSecond(10);
      SeleniumCommon.findElement("xpath", "//*[@id=\"identifierNext\"]/div/button/span").click();
      ExtentTestManager.reporterLog("Navigated to correct Second page");
      SeleniumCommon.waitForSecond(10);
  }


    public static void text_welcome() {
        WebElement w1=driver.findElement(By.xpath("//*[@id=\"headingText\"]/span"));
        SeleniumCommon.comparetext(w1,"Welcome");

    }

    public static void verify_user() {
        WebElement w2=driver.findElement(By.xpath("//*[@id=\"profileIdentifier\"]"));
        SeleniumCommon.comparetext(w2,"ghatagepoonam5@gmail.com");
    }

    public static  void verify_Placeholder_Of_Passwordfield(){
        WebElement w3=driver.findElement(By.xpath("//input[@type='password']"));
        String expect="Enter your password";
        SeleniumCommon.getEnteredvalue(w3,expect);
    }


    public static void enter_password() throws IOException {
        String password;
        password = PropertiesReading.getProperty("Config", "qa_password");
        Log.info("Password: " + password);
        SeleniumCommon.waitForSecond(5);
        SeleniumCommon.findElement("xpath", "//input[@type='password']").sendKeys(password);
        ExtentTestManager.reporterLog("Password Sent :" +password);


    }

    public static void  verify_showpassword_checkbox(){
        WebElement checkbox=driver.findElement(By.xpath("//*[@type='checkbox']"));
        SeleniumCommon.verfify_checkbox(checkbox);
    }

    public static void Enter_Next(){
        WebElement bt1=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        SeleniumCommon.ClickOnWebElement(bt1);
    }

    public static  void  refresh(){
        driver.navigate().refresh();
    }



}
