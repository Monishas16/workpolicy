package objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MissPunchObj {
	
	@FindBy (xpath="//p[contains(text(),'Settings')]")
	public static WebElement settings;
	
	@FindBy (xpath="//a[contains(text(),'Work Policy')]")
	public static WebElement workpolicy;
	
	@FindBy (xpath="//span[text()='Create Work Policy ']")
	public static WebElement CreateWorkPol;
		
		@FindBy (xpath="//p[@class='text-lg font-semibold dark:text-white ']")
		public static WebElement WorkpolicyHead;
		
		
		@FindBy (xpath="//h2[text()='Miss Punch Policy']")
		public static WebElement MisspuchOpt;
				@FindBy (xpath="//h1[text()='Miss Punch Policy']")
		public static WebElement MisspuchHead;
		
		@FindBy (xpath="//input[@placeholder='Enter Work Policy Name']")
		public static WebElement policyName;
		
		@FindBy (xpath="//input[@class='ant-checkbox-input']")
		public static WebElement checkbox;
		
		@FindBy (xpath="//input[@placeholder ='Enter If miss punch occurs more than']")
		public static WebElement mispuchNo;
		
		@FindBy (xpath="(//input[@role='combobox'])[1]")
		public static WebElement DuductionDD;
		
		
		
		@FindBy (xpath="//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']")
		public static 	List<WebElement> DeductionList;
		
		@FindBy (xpath="(//input[@type='number'])[2]")
		public static WebElement Amount;
		
		@FindBy (xpath="(//input[@role='combobox'])[1]")
		public static WebElement DeductionfromDD;
		
		@FindBy (xpath="//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']")
		public static 	List<WebElement> DeductionfromList;
		
		@FindBy (xpath="//p[text()='Add Range']")
		public static WebElement AddrangeOpt;
		
		@FindBy (xpath="(//input[@placeholder='Enter If miss punch occurs more than'])[2]")
		public static WebElement morethanOpt;
//		
//		
//		@FindBy (xpath="(//input[@placeholder='Enter If miss punch occurs more than'])[2]")
//		public static List TimeDD;
//		
		@FindBy (xpath="//div[@class='ant-picker-content']")
		public static List< WebElement> HourSelct1;
		

		@FindBy (xpath="(//input[@role='combobox'])[2]")
		public static WebElement DeductionfromDD2;
		
		@FindBy (xpath="(//input[@class='ant-select-selection-search-input'])[2]")
		public static WebElement DeductionType2DD;
		
		@FindBy (xpath="//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']")
		public static List<WebElement> DeductionType2Opt;
		

		@FindBy (xpath="(//input[@role='combobox'])[3]")
		public static WebElement DeductionTypeDD2;
		
		@FindBy (xpath="(//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active'])[1]")
		public static List<WebElement> DeductionFrom2Opt;
		

		@FindBy (xpath="(//input[@role='combobox'])[4]")
		public static WebElement DaysDD;
		
		@FindBy (xpath="//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']")
		public static List<WebElement> DaysDroplist;
		
		
		@FindBy (xpath="//span[text()='Save & Continue ']")
		public static WebElement SaveCont;
		
		
		@FindBy (xpath="//div[text()='Assign Policy']")
		public static WebElement AssignpolicyHed;
		
		@FindBy (xpath="//p[@class='mb-0 ']")
		public static WebElement RemoveallOpt;
		
		@FindBy (xpath="//input[@placeholder='Search Employees']")
		public static WebElement SearchEmp;
		
		@FindBy (xpath="//span[text()='Department']")
		public static WebElement Department;
		
		
		@FindBy (xpath="//input[@placeholder='Search Departments']")
		public static WebElement SearchDep;
		
		@FindBy (xpath="//span[text()='Locations']")
		public static WebElement Location;
		
		
		
		@FindBy (xpath="//input[@placeholder='Search Locations']")
		public static WebElement SearchLoc;
		
		
		@FindBy (xpath="(//button[@type='button'])[8]")
		public static WebElement SaveContbtn;
		

		@FindBy (xpath="(//button[contains(@class, 'hover:bg-primaryalpha')])[1]")
		public static WebElement MPeditBtn;
		

		@FindBy (xpath="//input[@placeholder='Search']")
		public static WebElement DashSerch;
		
		@FindBy (xpath="(//button[contains(@class, 'hover:bg-primaryalpha')])[2]")
		public static WebElement DeletBtnmis;
		
		
		
		
		
}
