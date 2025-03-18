package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HideShowPage;

public class HideShowSteps {
	
	WebDriver driver = Hooks.driver;
	HideShowPage hideshowPage = new HideShowPage(driver);

	@When("User hides or shows an element")
	public void user_hides_or_shows_an_element() {
		hideshowPage.hideField();
		hideshowPage.showField();
	}
	@Then("The element visibility should be verified")
	public void the_element_visibility_should_be_verified() {
		hideshowPage.isFieldDisplayed();
	}

}
