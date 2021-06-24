package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Objects {
	
	@FindBy(id="dashAnchor")
	public static WebElement dashboard;
	@FindBy(id="rptAnchor")
	public static WebElement reports;
	@FindBy(id="manageAnchor")
	public static WebElement manage;
	@FindBy(id="peopleAnchor")
	public static WebElement people;
	@FindBy(id="communicateAnchor")
	public static WebElement communicate;
	@FindBy(id="invAnchor")
	public static WebElement inventory;
	@FindBy(id="lySBAnchor")
	public static WebElement sitedesigner;
	@FindBy(id="displayAnchor")
	public static WebElement display;
	@FindBy(id="sysOnlyAnchor")
	public static WebElement hungerRush;
	
	
	
	

}
