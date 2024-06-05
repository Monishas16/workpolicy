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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import objects.MissPunchObj;
import libraries.CommonFunctions;
import com.github.javafaker.Faker;


public class MissPuchTC  extends CommonFunctions{
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
//	try {

		
	
	
		Faker faker = new Faker();             //for give the default value
 		test = reports.createTest("Testcase for MIssPuchPolicy Page ");
		PageFactory.initElements(driver,MissPunchObj.class);
		test.info("<b><font color = 'purple'>Test case-1 Verify the country page is displayed </b>");
		
		MissPunchObj.settings.click();
		test.pass("Settings Menu clicked");
		MissPunchObj.workpolicy.click();
		test.pass("workpolicy Menu Clicked");
		String actCountry = MissPunchObj.WorkpolicyHead.getText();
		if (actCountry.equals("WorkPolicy")) {
	            test.pass("WorkPolicy page is displayed");
 
	        } else {
	            test.fail("<font color='red'>MissPuchPOlicy page is not displayed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
	        }
 
		
	    test.info("<b><font color = 'purple'>Test case-2 Check the Create Workpolicy page is displayed </b>");

		MissPunchObj.CreateWorkPol.click();
		test.pass("Creatework policy option clicked");
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		 js.executeScript("window.scrollBy(0,1000)"); 
		 Thread.sleep(4000);
		 
		 
		MissPunchObj.MisspuchOpt.click();
		test.pass("Creatework policy option clicked");
		Thread.sleep(1000);
		
	
		
		
		 test.info("<b><font color = 'purple'>Test case-3 Check the Create Misspuch  page is displayed </b>");
		 if(MissPunchObj.MisspuchHead.getText().equals("Miss Punch Policy")) {
				test.pass("Miss Puch Policy  window is displayed.The heading is :"+MissPunchObj.MisspuchHead.getText());
			}else {
	            test.fail("<font color='red'>Create Workpolicy page navigation failed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
			}

	
		    MissPunchObj.policyName.sendKeys(properties.getProperty("PolicyName"));
			test.pass("Policyname entred successfully");
//			Thread.sleep(2000);
//check box			
			  if (!MissPunchObj.checkbox.isSelected()) {
				  MissPunchObj.checkbox.click();
		            test.pass("Checkbox clicked successfully");
		        }
		        
//		        Thread.sleep(1000);
		    
		        MissPunchObj.mispuchNo.sendKeys(properties.getProperty("MissTime"));
		        test.pass("MissPuch value entred successfully");
		        Thread.sleep(1000);

				MissPunchObj.DuductionDD.click();
		        Thread.sleep(1000);
		        
//Deduction Type dropdown
		        
		        for (int i = 0; i < MissPunchObj.DeductionList.size(); i++) {
			    	
			        if (MissPunchObj.DeductionList.get(i).getText().equalsIgnoreCase(properties.getProperty("DeductionType1"))) {
			        	
			        	MissPunchObj.DeductionList.get(i).click();
			        	
			            break;

			          
		       }
			
			}
		        MissPunchObj.Amount.sendKeys(properties.getProperty("amount"));
		        test.pass("MissPuch value entred successfully");
		        Thread.sleep(1000);
		        
		        MissPunchObj.AddrangeOpt.click();
		        test.pass("Deduction DroprDown clicked successfully");
		  
		     
		        MissPunchObj.morethanOpt.sendKeys(properties.getProperty("Puchmissmore"));
		        MissPunchObj.morethanOpt.sendKeys(Keys.ENTER);
		        test.pass("Miss punch occur time  DroprDown clicked successfully");
		        Thread.sleep(1000);
		       
		        MissPunchObj.DeductionType2DD.click();
		        test.pass("Deduction Type Drop Down clicked successfully");

		        Thread.sleep(2000);

               for (int i = 0; i < MissPunchObj.DeductionType2Opt.size(); i++) {
			    	
	
            	   if (MissPunchObj.DeductionType2Opt.get(i).getText().equalsIgnoreCase(properties.getProperty("DeductionType2"))) {
			        	
			        	MissPunchObj.DeductionType2Opt.get(i).click();
			        	
			            break;

			          
		       }
			
			}
               
////Deduction Type dropdown2

		        MissPunchObj.DeductionTypeDD2.click();
		        test.pass("Deduction From Drop Down clicked successfully");
		        Thread.sleep(2000);

		       
		        for (int i = 0; i < MissPunchObj.DeductionFrom2Opt.size(); i++) {
			    	
		        	
	            	   if (MissPunchObj.DeductionFrom2Opt.get(i).getText().equalsIgnoreCase(properties.getProperty("DeductionFrom2"))) {
				        	
				        	MissPunchObj.DeductionFrom2Opt.get(i).click();
				        	
				            break;

				          
	
				            
				            
	            	   }
		
	            	   
				}
//Days DropDown
		        
		        MissPunchObj.DaysDD.click();
		        test.pass("Days Drop Down clicked successfully");
		        Thread.sleep(2000);

		        for (int i = 0; i < MissPunchObj.DaysDroplist.size(); i++) {
			    	
		        	
	            	   if (MissPunchObj.DaysDroplist.get(i).getText().equalsIgnoreCase(properties.getProperty("Days"))) {
				        	
				        	MissPunchObj.DaysDroplist.get(i).click();
				        	
				            break;

				          
			       }
		
	            	   
				}

		        MissPunchObj.SaveCont.click();
		        test.pass("Save & Continue button clicked successfully");
		        Thread.sleep(2000);


//assign policy		        
				 test.info("<b><font color = 'purple'>Test case-4 Check the Assign Policy  page is displayed </b>");

				 if(MissPunchObj.AssignpolicyHed.getText().equals("Assign Policy")) {
						test.pass("Assign Policy  window is displayed.The heading is :"+MissPunchObj.AssignpolicyHed.getText());
					}else {
			            test.fail("<font color='red'>Create Workpolicy page navigation failed</font>",MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(driver,screenShot)).build());
					}
                
                
//check box		        
				  if (!MissPunchObj.checkbox.isSelected()) {
					  MissPunchObj.checkbox.click();
			            test.pass("Checkbox clicked successfully");
			        }
			        Thread.sleep(2000);

//remove all
			        MissPunchObj.RemoveallOpt.click();
			        test.pass("Remove All Option clicked successfully");
			        Thread.sleep(4000);

		
//search Empolyee
			        MissPunchObj.SearchEmp.sendKeys(properties.getProperty("workSearch"));
			        test.pass("Send the value successfully");
			        Thread.sleep(1000);

		
			        if (!MissPunchObj.checkbox.isSelected()) {
						  MissPunchObj.checkbox.click();
				            test.pass("Checkbox clicked successfully");
				        }
				        Thread.sleep(1000);
				        
				    	MissPunchObj.SearchEmp.sendKeys(Keys.CONTROL + "a");
						MissPunchObj.SearchEmp.sendKeys(Keys.DELETE);
//						
				        MissPunchObj.SearchEmp.clear();
//				        Thread.sleep(1000);

//Search Department		
				        MissPunchObj.Department.click();
				        test.pass("Department Option clicked successfully");
				        
				        
				        MissPunchObj.SearchDep.sendKeys(properties.getProperty("deprtSearch"));
				        test.pass(" Send the department value successfully");
				        Thread.sleep(1000);

				        if (!MissPunchObj.checkbox.isSelected()) {
							  MissPunchObj.checkbox.click();
					            test.pass("Checkbox clicked successfully");
					           
					        }
				        MissPunchObj.SearchDep.sendKeys(Keys.CONTROL + "a");
						MissPunchObj.SearchDep.sendKeys(Keys.DELETE);
//						
				        MissPunchObj.SearchDep.clear();
					        
//Search Location	    					        
					        MissPunchObj.Location.click();
					        Thread.sleep(3000);
					        if (!MissPunchObj.checkbox.isSelected()) {
								  MissPunchObj.checkbox.click();
						            test.pass("Checkbox clicked successfully");
						        }
						        Thread.sleep(1000);
					        

				
						        
					        
					       MissPunchObj.SaveContbtn.click();
					       test.pass("saved  successfully");
					       Thread.sleep(4000);
//Update		
					       test.info("<b><font color = 'purple'>Test case-5  Verify the Update Miss Puch Policy functionality  </b>");
					       MissPunchObj.DashSerch.sendKeys(properties.getProperty("PolicyName"));
					       Thread.sleep(4000);

					      MissPunchObj.MPeditBtn.click();
					       test.pass("Search the policy  successfully");
					       Thread.sleep(4000);
					       
					        MissPunchObj.mispuchNo.sendKeys(properties.getProperty("MisstimeUp"));
					        MissPunchObj.mispuchNo.sendKeys(Keys.CONTROL + "a");
							MissPunchObj.mispuchNo.sendKeys(Keys.DELETE);
//							
					        MissPunchObj.mispuchNo.clear();
					        Thread.sleep(1000);
					        
					        MissPunchObj.SaveCont.click();
					        MissPunchObj.SaveContbtn.click();
						   test.pass("Update the policy  successfully");

					        Thread.sleep(1000);

//delete		
					        test.info("<b><font color = 'purple'>Test case-6  Verify the Delete  functionality  Miss Puch Policy </b>");
					        MissPunchObj.DeletBtnmis.click();
							   test.pass("Delete the policy  successfully");

					        Thread.sleep(1000);

					       
   
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
