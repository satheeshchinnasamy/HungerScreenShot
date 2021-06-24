package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Inventory_Objects {
	
	@FindBy(xpath="//*[@id='divInventoryHeader']//following::h1[contains(text(),'Inventory Managemen')]")
	public static WebElement inventory_page;

}
