package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver Idriver;
	
	public Loginpage(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy (id="Email")
    @CacheLookup
    WebElement txtEmail;
	@FindBy(id ="Password")
	@CacheLookup
	
	WebElement txtPassword;
	@FindBy(xpath="")
	@CacheLookup
	WebElement btnLogin;
	
}
