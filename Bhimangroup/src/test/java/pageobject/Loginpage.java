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
	@FindBy (id="username")
    @CacheLookup
    WebElement txtEmail;
	
	@FindBy(id ="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@class=\"btn btn-block btn-primary btn-rounded box-shadow\"]")
	@CacheLookup
	WebElement btnLogin;
	
	public void enterInTextEmailField(String Email) {
		txtEmail.sendKeys(Email);
	}
	public void enterInTextPassword(String Password) {
		txtPassword.sendKeys(Password);
	}

	public void clickOnLoginBtn() {
		btnLogin.click();

	}
}
