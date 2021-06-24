package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu_Objects {
	
	@FindBy(xpath="//h5[contains(text(),'Menu')]")
	public static WebElement menu;
	@FindBy(xpath="//mat-select[@id='mat-select-0']")
	public static WebElement storesdropdown;
	@FindBy(xpath="//span[contains(text(),'Ly Install')]")
	public static WebElement LyInstall;
	@FindBy(xpath="//li[contains(text(),'Group')]")
	public static WebElement group;
	@FindBy(xpath="//span[contains(text(),'Add Group')]")
	public static WebElement addgroup;
	@FindBy(xpath="//span[contains(text(),'Delete Group')]")
	public static WebElement deletegroup;
	@FindBy(xpath="//p[contains(text(),'Add Group')]//following::input[@formcontrolname='groupName']")
	public static WebElement groupname;
	@FindBy(xpath="//p[contains(text(),'Add Group')]//following::input[@formcontrolname='buttonName']")
	public static WebElement buttonname;
	@FindBy(xpath="//section[@class='mat-modal-buttons']//span[contains(text(),'Add')]")
	public static WebElement add;
	@FindBy(xpath="//section[@class='mat-modal-buttons']//span[contains(text(),'cancel')]")
	public static WebElement cancel;
	@FindBy(xpath="//li[contains(text(),'View Changes / Publish to Store')]")
	public static WebElement viewchanges;
	@FindBy(xpath="//td[contains(text(),' TEST1 ')]//preceding::div[1]")
	public static WebElement checkbox;
	@FindBy(xpath="//span[contains(text(),'Publish changes')]")
	public static WebElement publish_Changes;
	@FindBy(xpath="//h1[normalize-space()='Menu Editor']")
	public static WebElement menueditor;
	
}
