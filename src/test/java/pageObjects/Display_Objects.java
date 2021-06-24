package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Display_Objects {
	
	@FindBy(xpath="//h5[normalize-space()='Drive']")
	public static WebElement Drive;
	@FindBy(xpath="//span[contains(text (),'Current Trip')]")
	public static WebElement trip;
}
