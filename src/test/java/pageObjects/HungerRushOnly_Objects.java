package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HungerRushOnly_Objects {
	
	@FindBy(xpath="//h5[normalize-space()='All Customers']")
	public static WebElement allCustomers;
	@FindBy(xpath="//td[contains(@title,'Reds Pizza')]")
	public static WebElement customertitle;
	
}
