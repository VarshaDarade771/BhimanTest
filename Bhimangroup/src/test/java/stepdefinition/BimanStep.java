package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Loginpage;

public class BimanStep {
	Loginpage Page=new Loginpage(null);
	WebDriver driver;
	
	@Given("use Launch Chrome browser")
	public void use_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}

	@When("User Opens URL {string}")
	public void user_opens_url(String string) {
	    driver.get("");
	}

	@When("User Enters PhoneNumber as {string} and Password as {string}")
	public void user_enters_phone_number_as_and_password_as(String Phone, String Password) {
	    Page.enterInTextEmailField(Phone);
	    Page.enterInTextPassword(Password);
	}

	@When("Click on Login")
	public void click_on_login() {

	}

	@Then("Page Title Should be {string}")
	public void page_title_should_be(String string) {
	    
	}

	@When("User Click on Log out Link")
	public void user_click_on_log_out_link() {
	 
	}

	@Then("Close browser")
	public void close_browser() {

	}
}
