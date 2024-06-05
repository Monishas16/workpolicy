package Testcases;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;

import libraries.CommonFunctions;
import objects.loginObj;
import objects.ShortTimeObj;
public class ShortTimeTC extends CommonFunctions {
	static String screenShot;
@BeforeSuite
	
	public void report() {
		report = new ExtentSparkReporter("Reports/Mispunch POlicy.html");
		reports = new ExtentReports();
		reports.attachReporter(report);
		Faker faker = new Faker();
 
		reports.setSystemInfo("<b>Application<b>", "<b>Loyaltri<b>");
		reports.setSystemInfo("<b>Module<b>", "<b>Monisha<\b>");
		reports.setSystemInfo("<b>Author<b>", "<b> Cordova Testing Team<b>");

	}
	

@Test(priority = 1)
public void eventlist() throws Exception {
	
	FileInputStream stream = new FileInputStream("Config.properties");
	 
	Properties properties = new Properties();
	properties.load(stream);
	Faker faker = new Faker();             //for give the default value
		test = reports.createTest("Testcase for MIssPuchPolicy Page ");
	PageFactory.initElements(driver,ShortTimeObj.class);
	test.info("<b><font color = 'purple'>Test case-1 Verify the country page is displayed </b>");
	
	ShortTimeObj.settings.click();
	test.pass("Settings Menu clicked");
	ShortTimeObj.workpolicy.click();
	test.pass("workpolicy Menu Clicked");
//	String actCountry = ShortTimeObj.WorkpolicyHead.getText();
//	if (actCountry.equals("WorkPolicy")) {
//            test.pass("WorkPolicy page is displayed");
//
//        } else {
//            test.fail("<font color='red'>MissPuchPOlicy page is not displayed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
//        }

	






	



@AfterSuite
public void reportflush() {
	
	reports.flush();
}


/*
 * Code for taking Screenshot
 */

public static String takeScreenshot(WebDriver driver, String screenshotName) throws Exception {
	String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	screenShot = System.getProperty("user.dir") + "/screenshots/" + screenshotName + "_" + timestamp + ".png";
	File screenshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotfile, new File(screenShot));
	return screenShot;

}
 

@AfterTest
public void close() {
	
	driver.close();

}






}
