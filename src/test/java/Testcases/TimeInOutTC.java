package Testcases;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import objects.MissPunchObj;
import objects.OverTimeObj;
import objects.ShortTimeObj;
import objects.TimeInOutObj;


public class TimeInOutTC extends CommonFunctions{
	
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
		
		test = reports.createTest("Testcase for Time In Out Policy Page ");
		PageFactory.initElements(driver,TimeInOutObj.class);
		
		TimeInOutObj.settingsTIOP.click();
		test.pass("Settings Menu clicked");
		TimeInOutObj.workpolicyTIOP.click();
		test.pass("workpolicy Menu Clicked");
		String actNameTIOP = TimeInOutObj.WorkpolicyHeadTIOP.getText();
		if (actNameTIOP.equals("Work Policy")) {
	            test.pass("WorkPolicy page is displayed");

	 		   Thread.sleep(1000);

	            
	        } else {
	            test.fail("<font color='red'> Work Policy page is not displayed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
	        }

		 test.info("<b><font color = 'purple'>Test case-1 Check the Create  Time In Out Policy page is displayed </b>");
		  TimeInOutObj.CreateWorkPolTIOP.click();
		  test.pass("Create Work pollicy option is clicked Suceesfully");
		  Thread.sleep(2000);
		  
	
		  TimeInOutObj.TimeinoutOpt.click();
		  test.pass("TimeIn OutPolicy option is clicked Suceesfully");


		  TimeInOutObj.TIOPName.sendKeys(properties.getProperty("TimeOutpolicyName"));
		   test.pass("Send the  TimeInTimeOut Policy name Successfully");
		   Thread.sleep(1000);
		   
 //check box			
			  if (!TimeInOutObj.TIOPcheckbox.isSelected()) {
				  TimeInOutObj.TIOPcheckbox.click();
		          test.pass("Checkbox clicked successfully");
		      }	  
		  
			  TimeInOutObj.TIOPMorethan.sendKeys(properties.getProperty("LateMoreThan"));
			  TimeInOutObj.TIOPMorethan.sendKeys(Keys.ENTER);
			  test.pass("Send the  TimeInTimeOut Policy name Successfully");
			  Thread.sleep(1000);
	
//Deduction Type dropdown 
			   
			   
			   TimeInOutObj.TIOPDeductionDD.click();
			   TimeInOutObj.TIOPDeductionDD.sendKeys(properties.getProperty("TIOPDeductiontype"));
			   TimeInOutObj.TIOPDeductionDD.sendKeys(Keys.ENTER);
			   test.pass("Send the Deduction type value Successfully");

 //Deduction From
			   
			   TimeInOutObj.TIOPDeductionFrom.click();
			   TimeInOutObj.TIOPDeductionFrom.sendKeys(properties.getProperty("TIOPDeductionfrom"));
			   TimeInOutObj.TIOPDeductionFrom.sendKeys(Keys.ENTER);
	
			   test.pass("Send the value of  Deduction type  Successfully");

			   

//Deduction Days
			   
			   TimeInOutObj.TIOPDays.click();
			   TimeInOutObj.TIOPDays.sendKeys(properties.getProperty("TIOPdays"));
			   TimeInOutObj.TIOPDays.sendKeys(Keys.ENTER);
			   test.pass("Send the value of Days Successfully");
			   
			   TimeInOutObj.TIOPCreateSaveBtn.click();
			   test.pass("Save & Continue BUtton clicked Successfully");
	
			   

//Assign Policy
			   
			 test.info("<b><font color = 'purple'>Test case-2 Check the Assign  Time In Out Policy page is displayed </b>");

			   TimeInOutObj.TIOPSerachEmp.sendKeys(properties.getProperty("EmpnameST"));
			   
			   if (!TimeInOutObj.TIOPEmpCheckbox.isSelected()) {
					  TimeInOutObj.TIOPEmpCheckbox.click();
			          test.pass("Checkbox clicked successfully");
			      }	  
			   
			   
			   TimeInOutObj.TIOPCreateSaveBtn.click();
			   test.pass("Save & Continue BUtton clicked Successfully");

//updation
			test.info("<b><font color = 'purple'>Test case-3 Verify the Update Time In Time Out Policy Functionality</b>");
			    TimeInOutObj.DashSearchTIOP.sendKeys(properties.getProperty("TimeOutpolicyName"));
		        test.pass(" Serching Workpolicy successfully");
				Thread.sleep(2000);
				
	
				TimeInOutObj.EditBtnTIOP.click();
				TimeInOutObj.TIOPName.sendKeys(Keys.CONTROL + "a"); // Select all text
				TimeInOutObj.TIOPName.sendKeys(Keys.DELETE);
			
				TimeInOutObj.TIOPName.sendKeys(properties.getProperty("TIOsearch"));
			    test.pass("Changed the  TimeInTimeOut Policy name Successfully");
				 Thread.sleep(1000);

				 
				   TimeInOutObj.TIOPCreateSaveBtn.click();
				   Thread.sleep(3000);

				   TimeInOutObj.TIOPCreateSaveBtn.click();
				   Thread.sleep(3000);


		        String UpdateNameTIOP = TimeInOutObj.TIOPDataTable.getText();
				if (UpdateNameTIOP.equals("TIOsearch")) {
			            test.pass("Updated Time In Time Out Policy details displayed in data table");

			        } else {
			            test.fail("<font color='red'> Update Time In Time Out Policy failed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
	
		    
			        
			        }
		   
//Delete
				test.info("<b><font color = 'purple'>Test case-4 check the delete button is displyed </b>");
				
				TimeInOutObj.DashSearchTIOP.sendKeys(Keys.CONTROL + "a"); // Select all text
				TimeInOutObj.DashSearchTIOP.sendKeys(Keys.DELETE);
				
				TimeInOutObj.DashSearchTIOP.sendKeys(properties.getProperty("TIOsearch"));
				
				TimeInOutObj.DeleteBtnTIOP.click();
				test.pass("Delete button clicked Successfully.");

				Thread.sleep(1000);
				
//NO OPTION
				
				TimeInOutObj.NoOptTIOP.click();
				test.pass("No button clicked Successfully.");
//Confirm opt
				
				TimeInOutObj.DeleteBtnTIOP.click();
				Thread.sleep(1000);

				TimeInOutObj.ConfirmOptTIOP.click();
				test.pass("Confrim button clicked Successfully.");
	
	
	
	}
	
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

	
	
	
	
	
	

