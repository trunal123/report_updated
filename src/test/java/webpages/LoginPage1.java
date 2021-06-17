package webpages;

import Reusablecomponent.ExtentTestManager;
import Reusablecomponent.Log;
import Reusablecomponent.SeleniumCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

import static Reusablecomponent.SeleniumCommon.driver;
//import static testscript.LoginTest1.nextbutton;

public class LoginPage1 {



    public LoginPage1() throws IOException  // Constructor to initialize Web elements using Page factory
    {
        driver = SeleniumCommon.getDriverInstance();
        ExtentTestManager.reporterLog("Chrome Invoked");
        PageFactory.initElements(driver, this);
        ExtentTestManager.reporterLog("URL Opened");
    }


    public static void logo() {
        WebElement logoPresent = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
        SeleniumCommon.verify_image(logoPresent);

    }


    public static void text1() {
        WebElement str_signin = driver.findElement(By.xpath("//*[@id=\"headingText\"]/span"));
        String expect = "Sign in";
        SeleniumCommon.comparetext(str_signin,expect);
    }


    public static void placeholder() {
        WebElement strvalu = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        SeleniumCommon.waitForSecond(5);
        System.out.println( strvalu.getAttribute("placeholder"));
        ExtentTestManager.reporterLog("Value1:" + strvalu.getAttribute("placeholder"));
        SeleniumCommon.waitForSecond(5);
        System.out.println(strvalu.getText());
        ExtentTestManager.reporterLog("Value2:"+ strvalu.getText());




      //  String expect_s = "Email or phone";
       // SeleniumCommon.comparetext(strvalu, expect_s);
    }


    public static void text2() {
        WebElement str_continue = driver.findElement(By.xpath("//*[@id=\"headingSubtext\"]/span"));
        String expect = "Continue to Gmail";
        SeleniumCommon.comparetext(str_continue,expect );
    }



    public static void Not_you_computer_text(){

        WebElement w8 = driver.findElement(By.xpath("//*[contains(text(),'Not your computer? Use Guest mode to sign in privately. ')]"));
        String expect_s8 = "Not your computer? Use Guest mode to sign in privately. Learn more";
        SeleniumCommon.comparetext(w8,expect_s8);
    }

    public static void checkLearn_more_link() throws AWTException {

        String link="Learn more";//pass link text
        String expect_title="Browse Chrome as a guest - Computer - Google Chrome Help";
        SeleniumCommon.openlinkinnewtab(link,expect_title);


    }

    public static void forgot_email() {
        WebElement e=driver.findElement(By.xpath("//div[@class = 'PrDSKc']//button"));
        SeleniumCommon.ClickOnWebElement(e);
    }



    public static void  getemail_value() throws IOException {

        WebElement l = driver.findElement(By.xpath("//input[@id='identifierId']"));
        l.sendKeys("poonam.ghatage@perennialsys.com");
        String expectvalue="poonam.ghatage@perennialsys.com";
        SeleniumCommon.getEnteredvalue(l,expectvalue);
        nextbutton();

    }


    public static void nextbutton(){
        SeleniumCommon.waitForSecond(10);
        WebElement w10 = driver.findElement(By.xpath("//span[contains(text(), 'Next')]"));
        SeleniumCommon.ClickOnWebElement(w10);

        WebElement w2= driver.findElement(By.xpath("//input[@id='identifierId']"));
        w2.clear();

    }


}
