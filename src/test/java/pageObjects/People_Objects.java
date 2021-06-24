package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class People_Objects {
	
	@FindBy(xpath="//h5[normalize-space()='Summary']")
	public static WebElement summary;
	@FindBy(xpath="//div[@id='main-content']//h2[contains(text(),'Weekly Time Clock Review')]")
	public static WebElement timrclock;
	
}
