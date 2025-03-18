package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver = Hooks.driver;
	LoginPage loginPage = new LoginPage(driver);

	@When("user is on the login page")
	public void user_is_on_the_login_page() {
		driver.navigate().to("https://ecommercepractice.letskodeit.com/login/");
		System.out.println("User is on login page.");
	}
	@When("user enters valid login credentials")
	public void user_enters_valid_login_credentials() {
		loginPage.enterDetails();
		System.out.println("User enters valid credentials");
	}
	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		loginPage.submit();
		System.out.println(driver.getCurrentUrl());
		System.out.println("User logged In successfully");
	}
	
}
