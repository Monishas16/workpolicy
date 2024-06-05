package objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShortTimeObj {
	
	
	@FindBy (xpath="//p[contains(text(),'Settings')]")
	public static WebElement settings;
	
	@FindBy (xpath="//a[contains(text(),'Work Policy')]")
	public static WebElement workpolicy;

}
