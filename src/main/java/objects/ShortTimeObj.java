package objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShortTimeObj {
	
	
	@FindBy (xpath="//p[contains(text(),'Settings')]")
	public static WebElement settings;
	
	@FindBy (xpath="//a[contains(text(),'Work Policy')]")
	public static WebElement workpolicy;
	
	@FindBy (xpath="//p[@class='text-lg font-semibold dark:text-white ']")
	public static WebElement WorkpolicyHead;
		
	@FindBy (xpath="//span[text()='Create Work Policy ']")
	public static WebElement CreateWorkPol;
	
	@FindBy (xpath="//h2[text()='Short Time Policy']")
	public static WebElement ShorttimePolicy;
	
	@FindBy (xpath="//input[@placeholder='Enter Work Policy Name']")
	public static WebElement ShorttimePolicyName;
	
//checkbox	
	@FindBy (xpath="//input[@class='ant-checkbox-input']")
	public static WebElement checkbox;

//Short Time Rule
	@FindBy (xpath="//input[@placeholder='Choose If employee works less than']")
	public static WebElement lesstahnDD;
	
	@FindBy (xpath="(//input[@role='combobox'])[1]")
	public static WebElement DeductionTypeMiss;
	
	
//	@FindBy (xpath="//label[text()='Deduction Type']//following::div[@class='relative flex items-center ']")
//	public static 	WebElement  DeductionTypeMissDD;
//	
	@FindBy (xpath="//input[@placeholder='Enter Select Amount']")
	public static WebElement AmountSTP;
	
//set occurance checkbox
	
	@FindBy (xpath="(//input[@class='ant-checkbox-input'])[2]")
	public static WebElement checkbox2;
	
	@FindBy (xpath="//label[text()='Type']//following::span[1]")
	public static WebElement occuranceTypeOpt;
	
	@FindBy (xpath="(//input[@type='checkbox'])[1]")
	public static WebElement EmpolyeeCheckbox;
	
	
	@FindBy (xpath="(//button[@type='button'])[9]")
	public static WebElement SaveandContST;
	
	@FindBy (xpath="(//button[@type='button'])[8]")
	public static WebElement SaveandContEmpse;
	
	@FindBy (xpath="//input[@placeholder='Search Employees']")
	public static WebElement SearchEmpST;
	
	@FindBy (xpath="(//input[@type='checkbox'])[1]")
	public static WebElement Empcheckbox;
	
	@FindBy (xpath="//input[@placeholder='Search']")
	public static WebElement STPDashSearch;
	
	//UPDATE
	
	@FindBy (xpath="(//button[contains(@class, 'hover:bg-primaryalpha')])[1]")
	public static WebElement EditBtnSTP;
	
	@FindBy (xpath="(//button[contains(@class, 'hover:bg-primaryalpha')])[2]")
	public static WebElement DeleteBtnSTP;
	
	@FindBy (xpath="//span[text()='No']")
	public static WebElement NoOptSTP;
	
	
	@FindBy (xpath="(//button[@type='button'])[7]")
	public static WebElement ConfirmOptSTP;
	
	
	
	  
}
