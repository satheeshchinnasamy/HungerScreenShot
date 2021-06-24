package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Objects {
	
	@FindBy(id="UserName")
	public static WebElement username;
	@FindBy(id="Password")
	public static WebElement password;
	@FindBy(id="newLogonButton")
	public static WebElement loginbtn;

}
