package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reports_Objects {
	
	@FindBy(id="id_8")
	public static WebElement sales;
	@FindBy(xpath="//li[@data-displayname='Daily Performance - Single Store']")
	public static WebElement singleStore;
	@FindBy(id="from")
	public static WebElement from_Date;
	@FindBy(id="to")
	public static WebElement to_Date;
	@FindBy(id="storesDD")
	public static WebElement storelist;
	@FindBy(id="btnview")
	public static WebElement viewbutton;
	@FindBy(id="rptSection1Hdr")
	public static WebElement reportsOption;
	
	
}
