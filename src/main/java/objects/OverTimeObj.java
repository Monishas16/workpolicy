package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverTimeObj {
	
	@FindBy (xpath="//p[contains(text(),'Settings')]")
	public static WebElement settingsOT;
	
	@FindBy (xpath="//a[contains(text(),'Work Policy')]")
	public static WebElement workpolicyOT;
	
	@FindBy (xpath="//p[text()='Work Policy']")
	public static WebElement WorkpolicyHeadOT;
	
	@FindBy (xpath="//span[contains(text(), 'Create Work Policy')]")
	public static WebElement CreateWorkPolOTP;
	
	
	@FindBy (xpath="//h2[text()='Over Time Policy']")
	public static WebElement OvertimePolicyOp;
	
	@FindBy (xpath="//h1[text()='Over Time Policy']")
	public static WebElement OvertimePolicyHead;
	
	
	@FindBy (xpath="//input[@placeholder='Enter Policy Name']")
	public static WebElement OTPName;
	
	@FindBy (xpath="//input[@placeholder='Enter Maximum Over Time Per Month for an Employee']")
	public static WebElement OTMonth ;
	
	//Extra hours on week days
	
	@FindBy (xpath="//input[@placeholder='Choose Time']")
	public static WebElement FixedrateMoreopt;

	@FindBy (xpath="//input[@placeholder='Enter Amount Per Minute']")
	public static WebElement OTamoutperminitues;
	
	@FindBy (xpath="//span[text()='Save & Continue']")
	public static  WebElement OTPSaveBtn;
	
//Assign OTP 
	
	@FindBy (xpath="//input[@placeholder='Search Employees']")
	public static  WebElement OTPSerachEmp;
	
	@FindBy (xpath="(//input[@type='checkbox'])[1]")
	public static  WebElement OTPEmpCheckbox;

//Custom Rate
	
	@FindBy (xpath="//h3[text()='Custom Rate']")
	public static  WebElement CustomRateOpt;
	
	@FindBy (xpath="//input[@placeholder='Choose If Employee works more than']")
	public static  WebElement OTPmorethan;

	@FindBy (xpath="//input[@role='combobox']")
	public static WebElement OTPTypeOpt;
	
	@FindBy (xpath="//input[@placeholder='Enter Amount Per Minute']")
	public static WebElement multiplayerAmount;
	
//Complimentary off	
	
	@FindBy (xpath="//h3[text()='Complimentary Off']")
	public static WebElement ComplimentaryOpt ;

	@FindBy (xpath="(//input[@placeholder='Choose time'])[2]")
	public static WebElement Offtime ;
	
//updation
	
	@FindBy (xpath="//input[@placeholder='Search']")
	public static WebElement DashSearchOTP;
	
	@FindBy (xpath="(//button[contains(@class, 'hover:bg-primaryalpha')])[1]")
	public static WebElement EditBtnOTP;
	
	
	@FindBy (xpath="//table//tr[2]/td[1]")
	public static  WebElement OTPDataTable;
	
//Delete
	@FindBy (xpath="(//button[contains(@class, 'hover:bg-primaryalpha')])[2]")
	public static WebElement DeleteBtnOTP;
	
	@FindBy (xpath="//span[text()='No']")
	public static WebElement NoOptOTP;
	
	
	@FindBy (xpath="//span[text()='Confirm']")
	public static WebElement ConfirmOptOTP;
	

	
	
	
}
