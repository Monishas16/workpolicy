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
import objects.OverTimeObj;
import objects.ShortTimeObj;
import objects.TimeInOutObj;
public class OverTimeTC extends CommonFunctions {
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
	test = reports.createTest("Testcase for OverTimePolicy Page ");
	PageFactory.initElements(driver,OverTimeObj.class);
	
	OverTimeObj.settingsOT.click();
	test.pass("Settings Menu clicked");
	OverTimeObj.workpolicyOT.click();
	test.pass("workpolicy Menu Clicked");
	String actName = OverTimeObj.WorkpolicyHeadOT.getText();
	if (actName.equals("Work Policy")) {
            test.pass("WorkPolicy page is displayed");

        } else {
            test.fail("<font color='red'> Work Policy page is not displayed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
        }

//CREATE POLICY
	
	test.info("<b><font color = 'purple'>Test case-1 Check the Create short Time Policy page is displayed </b>");
	  OverTimeObj.CreateWorkPolOTP.click();
	  test.pass("Create Work pollicy option is clicked Suceesfully");
	  
	  OverTimeObj.OvertimePolicyOp.click();
	  test.pass("Over Time  pollicy option is clicked Suceesfully");
	  
	  String OvertimeName = OverTimeObj.OvertimePolicyHead.getText();
	  if (OvertimeName.equals("Over Time Policy")) {
          test.pass("Over Time Policy page is displayed");

      } else {
          test.fail("<font color='red'> Over Time Policy page is not displayed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
      }
	  
	   Thread.sleep(3000);
	   
	
	   
//fixed rate	   
		   OverTimeObj.OTPName.sendKeys(properties.getProperty("OvertimewpolicyName"));
		   test.pass("Send the Over Time Policy name Successfully");
			  
		 
		  OverTimeObj.FixedrateMoreopt.sendKeys(properties.getProperty("Workmorethan"));
		  OverTimeObj.FixedrateMoreopt.sendKeys(Keys.ENTER);
		  test.pass("Send the time extra work Successfully");
		   Thread.sleep(1000);


		   OverTimeObj.OTamoutperminitues.sendKeys(properties.getProperty("AmountPerMini"));
		   test.pass("Send the amount for extra work Successfully");
		   Thread.sleep(1000);
		   
		   OverTimeObj.OTPSaveBtn.click();
		   test.pass("Save OverTime Policy Successfully");
		   
//ASSIGN eMPOLYEE	
		   
		test.info("<b><font color = 'purple'>Test case-2 Check the Assign Over Time Policy page is displayed </b>");

		   OverTimeObj.OTPSerachEmp.sendKeys(properties.getProperty("EmpnameST"));
		   
		   if (!OverTimeObj.OTPEmpCheckbox.isSelected()) {
			   OverTimeObj.OTPEmpCheckbox.click();
		          test.pass("Checkbox clicked successfully");
		      }	  
		   
		   
		   OverTimeObj.OTPSaveBtn.click();
		   test.pass("Save & Continue Button clicked Successfully");

		  	 		   
//Custom Rate			
		   test.info("<b><font color = 'purple'>Test case-3 Verify the Custom Rate Functionality </b>");
		  
		        Thread.sleep(2000);
		        
		       OverTimeObj.CreateWorkPolOTP.click();
		  	   test.pass("Create Work pollicy option is clicked Suceesfully");
		  	  
		  	   OverTimeObj.OvertimePolicyOp.click();
		  	   test.pass("Over Time  pollicy option is clicked Suceesfully");
			
			   OverTimeObj.OTPName.sendKeys(properties.getProperty("OvertimewpolicyName"));
			   test.pass("Send the Over Time Policy name Successfully");
				 
			   OverTimeObj.OTamoutperminitues.sendKeys(properties.getProperty("AmountPerMini"));
			   test.pass("Send the amount for extra work Successfully");
			   Thread.sleep(1000);
			   
			   OverTimeObj.CustomRateOpt.click();
			   test.pass("Clicked the Custom Rate Option Successfully");

			   OverTimeObj.OTPmorethan.sendKeys(properties.getProperty("Workmorethan"));
			   OverTimeObj.OTPmorethan.sendKeys(Keys.ENTER);
	
			   test.pass("Send the time extra work Successfully");
			
			   OverTimeObj.OTPTypeOpt.click();
			   OverTimeObj.OTPTypeOpt.sendKeys(properties.getProperty("OVTType"));
			   OverTimeObj.OTPTypeOpt.sendKeys(Keys.ENTER);
			   test.pass("Send the time extra work Successfully");

			   OverTimeObj.multiplayerAmount.sendKeys(properties.getProperty("MultiplayerAmount"));
			   test.pass("Send the Multiplayer amount for extra work Successfully");
			   
			   OverTimeObj.OTPSaveBtn.click();
			   test.pass("Save OverTime Policy Successfully");
			   
//asign			    
				  			  
				   OverTimeObj.OTPSerachEmp.sendKeys(properties.getProperty("EmpnameST"));
				   
				   if (!OverTimeObj.OTPEmpCheckbox.isSelected()) {
					   OverTimeObj.OTPEmpCheckbox.click();
				          test.pass("Checkbox clicked successfully");
				      }	  
				   
				   
				   OverTimeObj.OTPSaveBtn.click();
				   test.pass("Save & Continue BUtton clicked Successfully");



//	Complimentary Off
				   
				 test.info("<b><font color = 'purple'>Test case-4 Verify the Complimentary Off Functionality </b>");
			        Thread.sleep(2000);


				   OverTimeObj.CreateWorkPolOTP.click();
			  	   test.pass("Create Work pollicy option is clicked Suceesfully");
			  	  
			  	   OverTimeObj.OvertimePolicyOp.click();
			  	   test.pass("Over Time  pollicy option is clicked Suceesfully");
				

				   OverTimeObj.OTPName.sendKeys(properties.getProperty("ComplimentaryName"));
				   test.pass("Send the Over Time Policy name Successfully");
					 
				   OverTimeObj.OTamoutperminitues.sendKeys(properties.getProperty("AmountPerMini"));
				   test.pass("Send the amount for extra work Successfully");
				   Thread.sleep(1000);
				   

			  	   OverTimeObj.ComplimentaryOpt.click();
				   test.pass("Clicked the Complimentary off Option Clicked Successfully");

				   OverTimeObj.Offtime.click();
				   OverTimeObj.Offtime.sendKeys(properties.getProperty("OfftypeTime"));
				   OverTimeObj.Offtime.sendKeys(Keys.ENTER);
				   test.pass("Choose time  Successfully");
				   
				   
				   OverTimeObj.OTPSaveBtn.click();
				   test.pass("Save OverTime Policy Successfully");
				   
                   OverTimeObj.OTPSerachEmp.sendKeys(properties.getProperty("EmpnameST"));
				   
				   if (!OverTimeObj.OTPEmpCheckbox.isSelected()) {
					   OverTimeObj.OTPEmpCheckbox.click();
				          test.pass("Checkbox clicked successfully");
				      }	  
				   
				   
				   OverTimeObj.OTPSaveBtn.click();
				   test.pass("Save & Continue BUtton clicked Successfully");


//updation
				   test.info("<b><font color = 'purple'>Test case-3 Verify the Update Over Time Policy Functionality</b>");
				    OverTimeObj.DashSearchOTP.sendKeys(properties.getProperty("OvertimewpolicyName"));
			        test.pass(" Serching Workpolicy successfully");
					Thread.sleep(2000);
					
		
					OverTimeObj.EditBtnOTP.click();
					OverTimeObj.OTPName.sendKeys(Keys.CONTROL + "a"); // Select all text
					OverTimeObj.OTPName.sendKeys(Keys.DELETE);
					OverTimeObj.OTPName.sendKeys(properties.getProperty("UpdateOTPName"));
				    test.pass("Changed the  TimeInTimeOut Policy name Successfully");
					 Thread.sleep(1000);

					 
					 
					 
					  OverTimeObj.OTPSaveBtn.click();
					   Thread.sleep(3000);

					   OverTimeObj.OTPSaveBtn.click();
					   Thread.sleep(3000);


			        String UpdateNameOTP = OverTimeObj.OTPDataTable.getText();
					if (UpdateNameOTP.equals("UpdateOTPName")) {
				            test.pass("Updated Time In Time Out Policy details displayed in data table");

				        } else {
				            test.fail("<font color='red'> Update Time In Time Out Policy failed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
	
				            
			    
	
				            
				        }
			   
	//Delete
					test.info("<b><font color = 'purple'>Test case-4 check the delete button is displyed </b>");
					
					OverTimeObj.DashSearchOTP.sendKeys(Keys.CONTROL + "a"); // Select all text
					OverTimeObj.DashSearchOTP.sendKeys(Keys.DELETE);
					
					OverTimeObj.DashSearchOTP.sendKeys(properties.getProperty("UpdateOTPName"));
					OverTimeObj.DeleteBtnOTP.click();
					test.pass("Delete button clicked Successfully.");

					Thread.sleep(1000);
					
	//NO OPTION
					
					OverTimeObj.NoOptOTP.click();
					test.pass("No button clicked Successfully.");
	//Confirm opt
					
					OverTimeObj.DeleteBtnOTP.click();
					Thread.sleep(1000);

					OverTimeObj.ConfirmOptOTP.click();
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
