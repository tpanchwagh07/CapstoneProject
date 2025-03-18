package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterationPage;

public class RegisterationSteps {
	
	WebDriver driver = Hooks.driver;
	RegisterationPage regPage = new RegisterationPage(driver);

	@When("user is on the registration page")
	public void user_is_on_the_registration_page() {
		driver.navigate().to("https://ecommercepractice.letskodeit.com/signup");
		System.out.println("User is on the Registeration Page");
	}
	@When("user enters registration details and submits")
	public void user_enters_registration_details_and_submits() {
		regPage.enterDetails();
		System.out.println("User has entered details.");
	}
	@Then("registration should be successful")
	public void registration_should_be_successful() {
		regPage.submit();
		System.out.println(driver.getCurrentUrl());
		System.out.println("User has registered successfully.");
	}
	
}
