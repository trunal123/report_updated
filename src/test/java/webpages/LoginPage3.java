package webpages;

import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.Log;
import Reusablecomponent.PropertiesReading;
import Reusablecomponent.SeleniumCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginPage3 extends SeleniumCommon {



    public static void EnterEmailid_ClickNext() throws IOException { String username;
        username = PropertiesReading.getProperty("Config", "qa_username");
        Log.info("Username: " + username);
        SeleniumCommon.findElement("xpath", "//input[@id='identifierId']").sendKeys(username);
        SeleniumCommon.waitForSecond(10);
        SeleniumCommon.findElement("xpath", "//*[@id=\"identifierNext\"]/div/button/span").click();
        ExtentTestManager.reporterLog("Navigated to correct Second page");
        SeleniumCommon.waitForSecond(10);
    }


    public static void enter_password() throws IOException {
        String password;
        password = PropertiesReading.getProperty("Config", "qa_password");
        Log.info("Password: " + password);
        SeleniumCommon.waitForSecond(5);
        SeleniumCommon.findElement("xpath", "//input[@type='password']").sendKeys(password);
        ExtentTestManager.reporterLog("Password Sent :" +password);


    }

    public static void Enter_Next(){
        WebElement bt1=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        SeleniumCommon.ClickOnWebElement(bt1);
    }

    public static void refresh() {

    }

    public static void verifydropdown() {

        //xpath=parent+space+child
        SeleniumCommon.waitForSecond(5);
        WebElement w1=driver.findElement(By.xpath("//div[@class=\"J-J5-Ji J-JN-M-I-Jm\"] //div[@class=\"G-asx T-I-J3 J-J5-Ji\"]"));
        SeleniumCommon.waitForSecond(5);
        WebElement w2=driver.findElement(By.xpath("//div[@selector='unread']"));
        SeleniumCommon.check_dropdown(w1,w2);

    }

    public static void veriftooltip() {

        //https://www.guru99.com/verify-tooltip-selenium-webdriver.html

        WebElement w1=driver.findElement(By.xpath("//span[@class=\"nU n1\"] //*[contains(text(),'Inbox')]"));//xpath=parent+space+child
        SeleniumCommon.waitForSecond(5);
        String expected="Inbox";
        SeleniumCommon.tooltip(w1,expected);

    }

    public static void verifyicon() {

        WebElement element=driver.findElement(By.xpath("//*[@id=\":1x\"]/div[4]"));
        if(element.isDisplayed())
        {
            System.out.println("Image displayed");
        }
        else
        {
            System.out.println("Image notdisplayed");
        }
    }

    public static void assigntask() {
        SeleniumCommon.waitForSecond(5);
        driver.findElement(By.xpath("//div[@class='aT5-aOt-I-JX-Jw']")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Add a task')]")).click();





    }
}
