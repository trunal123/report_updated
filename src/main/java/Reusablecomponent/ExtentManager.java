package Reusablecomponent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.util.Date;

public class ExtentManager {

    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance();
        return extent;
    }

    private  static ExtentReports extent;

    public static ExtentReports createInstance(){
        String filename=getReportName();
        String directory=System.getProperty("user.dir");
        new File(directory).mkdirs();
        String path=directory + filename;

        ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(path);

        htmlReporter=new ExtentHtmlReporter("./extent.html/");//extent report will save
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("Automation Reports");
        htmlReporter.config().setReportName("Gmail Login Automation Report");
        htmlReporter.config().setTheme(Theme.DARK);

        extent=new ExtentReports();
        extent.setSystemInfo("Company","Perennial System");
        extent.setSystemInfo("Tester","Poonam");
        extent.attachReporter(htmlReporter);
        return  extent;
    }

    public static String getReportName(){
        Date d=new Date();
        String filename ="AutomationReport" +d.toString().replace(":","-").replace(",","_")+ ".png";
        return filename;

    }


}
