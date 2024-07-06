package objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeInOutObj {
	
	
	@FindBy (xpath="//p[contains(text(),'Settings')]")
	public static WebElement settingsTIOP;
	
	@FindBy (xpath="//a[contains(text(),'Work Policy')]")
	public static WebElement workpolicyTIOP;
	
	@FindBy (xpath="//p[@class='text-lg font-semibold dark:text-white ']")
	public static WebElement WorkpolicyHeadTIOP;
		
	@FindBy (xpath="//span[contains(text(), 'Create Work Policy')]")
	public static WebElement CreateWorkPolTIOP;

	@FindBy (xpath="//h2[text()='Time In-Out Policies']")
	public static WebElement TimeinoutOpt;
	
	@FindBy (xpath="//input[@placeholder='Enter Work Policy Name']")
	public static WebElement TIOPName;
	
//checkbox	
	@FindBy (xpath="//input[@class='ant-checkbox-input']")
	public static WebElement TIOPcheckbox;
	
	
	@FindBy (xpath="(//input[@placeholder='Choose If Employee Late More Than'])[1]")
	public static WebElement TIOPMorethan;
	
//deduction dropdown	
	
	@FindBy (xpath="(//input[@role='combobox'])[2]")
	public static WebElement TIOPDeductionDD;
	
	
	@FindBy (xpath="(//input[@role='combobox'])[3]")
	public static  WebElement TIOPDeductionFrom;
	
	
	@FindBy (xpath="(//input[@role='combobox'])[4]")
	public static  WebElement TIOPDays;
	
	@FindBy (xpath="//span[text()='Save & Continue']")
	public static  WebElement TIOPCreateSaveBtn;
	
//Assign POlicy	
	
	@FindBy (xpath="//input[@placeholder='Search Employees']")
	public static  WebElement TIOPSerachEmp;
	
	@FindBy (xpath="(//input[@type='checkbox'])[1]")
	public static  WebElement TIOPEmpCheckbox;

//update
	
	@FindBy (xpath="//input[@placeholder='Search']")
	public static WebElement DashSearchTIOP;
	
	@FindBy (xpath="(//button[contains(@class, 'hover:bg-primaryalpha')])[1]")
	public static WebElement EditBtnTIOP;
	
	
	@FindBy (xpath="//table//tr[2]/td[1]")
	public static  WebElement TIOPDataTable;
	
//Delete
	@FindBy (xpath="(//button[contains(@class, 'hover:bg-primaryalpha')])[2]")
	public static WebElement DeleteBtnTIOP;
	
	@FindBy (xpath="//span[text()='No']")
	public static WebElement NoOptTIOP;
	
	
	@FindBy (xpath="//span[text()='Confirm']")
	public static WebElement ConfirmOptTIOP;
	

	
	
	
}
