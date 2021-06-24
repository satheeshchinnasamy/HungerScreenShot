package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Communicate_Objects {

	@FindBy(xpath="//h5[normalize-space()='Documents']")
	public static WebElement documents;
	@FindBy(xpath="//*[@id='MainRightContent']//following::h1[contains(text(),'Documents')]")
	public static WebElement doc_content;
	
}
