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
	
	ShortTimeObj.settings.click();
	test.pass("Settings Menu clicked");
	ShortTimeObj.workpolicy.click();
	test.pass("workpolicy Menu Clicked");
	String actShortName = ShortTimeObj.WorkpolicyHead.getText();
	if (actShortName.equals("Work Policy")) {
            test.pass("WorkPolicy page is displayed");

    
	} else {
            test.fail("<font color='red'> Work Policy page is not displayed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
        }
	

	
	
    test.info("<b><font color = 'purple'>Test case-2 Check the Create short Time Policy page is displayed </b>");
    ShortTimeObj.CreateWorkPol.click();
	Thread.sleep(1000);

	ShortTimeObj.ShorttimePolicy.click();
	Thread.sleep(1000);
	ShortTimeObj.ShorttimePolicyName.sendKeys(properties.getProperty("ShortTimeName"));
	
//check box			
	  if (!ShortTimeObj.checkbox.isSelected()) {
		  ShortTimeObj.checkbox.click();
          test.pass("Checkbox clicked successfully");
      }

	  
//Short Time Rule
	    ShortTimeObj.lesstahnDD.sendKeys(properties.getProperty("WorkLessThan"));
		Thread.sleep(1000);
		
		ShortTimeObj.DeductionTypeMiss.click();
		ShortTimeObj.DeductionTypeMiss.sendKeys(properties.getProperty("DeductionTypeST"));
		ShortTimeObj.DeductionTypeMiss.sendKeys(Keys.ENTER);
        test.pass(" The deduction value is enterd successfully");
        
		ShortTimeObj.AmountSTP.sendKeys(properties.getProperty("AmountofSTP"));
	    test.pass(" THe deduction amount is passed successfully");
	    
	   
			JavascriptExecutor js = (JavascriptExecutor) driver; 
		
			js.executeScript("window.scrollBy(0,1000)"); 
			 Thread.sleep(4000);

			ShortTimeObj.SaveandContST.click();
	        test.pass(" The save and continue button cicked successfully");
			Thread.sleep(1000);
	

			
			
			
		    test.info("<b><font color = 'purple'>Test case-3 Check the Assign short Time Policy page is displayed </b>");
		    
//need to update	all below code	    
		    
//SERACH EMPOLYEE
		     
		    ShortTimeObj.SearchEmpST.sendKeys(properties.getProperty("EmpnameST"));
	        test.pass("Send the value successfully");
            Thread.sleep(1000);


			 if (!ShortTimeObj.Empcheckbox.isSelected()) {
				  ShortTimeObj.Empcheckbox.click();
		          test.pass("Select the empolyee successfully");
		      }
				Thread.sleep(3000);
				
				ShortTimeObj.SaveandContEmpse.click();
		        test.pass(" The save and continue button cicked successfully");
				Thread.sleep(1000);

		
				

//updation      
				/*
			    test.info("<b><font color = 'purple'>Test case-4 Verify the Update Short Time Policy Functionality</b>");
			    ShortTimeObj.STPDashSearch.sendKeys(properties.getProperty("ShortTimeName"));
		        test.pass(" Serching  Short Time Policy   successfully");
				Thread.sleep(2000);
				
				ShortTimeObj.EditBtnSTP.click();
		        test.pass(" Edit button clicked successfully");
				Thread.sleep(1000);
				
				
				
				ShortTimeObj.AmountSTP.sendKeys(properties.getProperty("Updateamount"));
			    test.pass(" The new deduction amount is passed successfully");
			    

				ShortTimeObj.SaveandContST.click();
		        test.pass(" The save and continue button cicked successfully");
				Thread.sleep(1000);
	
			    */
//delete 
				
				
				test.info("<b><font color = 'purple'>Test case-6 check the delete button is displyed </b>");
				
				ShortTimeObj.STPDashSearch.sendKeys(properties.getProperty("serachSTP"));
				
				ShortTimeObj.DeleteBtnSTP.click();
				test.pass("Delete button clicked.");

				Thread.sleep(1000);
				
				//NO OPTION
				
				ShortTimeObj.NoOptSTP.click();
				test.pass("No button clicked successfully.");
				
				
				

				String searchValue = properties.getProperty("serachSTP");
				boolean dataNotDeleted = verifyDataNotDeleted(searchValue); // Implement this method to verify if data is not deleted
				if (dataNotDeleted) { 
				    test.pass("Data not deleted. No button functionality working");
			    } else {
				    test.fail("<font color='red'>No button click failed.</font>", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver, screenShot)).build());
				}
				
				
				ShortTimeObj.DeleteBtnSTP.click();
				Thread.sleep(1000);


				ShortTimeObj.ConfirmOptSTP.click();
				test.pass("Confirmation button clicked successfully.");

		
				Thread.sleep(1000);

    
				
}


private boolean verifyDataNotDeleted(String searchValue) {
	// TODO Auto-generated method stub
	return false;
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
