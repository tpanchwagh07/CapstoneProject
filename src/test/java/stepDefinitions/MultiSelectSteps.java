package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MultiSelectPage;

public class MultiSelectSteps {
	
	WebDriver driver = Hooks.driver;
	MultiSelectPage multiselectPage = new MultiSelectPage(driver);

	@When("User selects multiple options from the list")
	public void user_selects_multiple_options_from_the_list() {
		multiselectPage.clickOptions();
	}
	@Then("The selected options should be verified")
	public void the_selected_options_should_be_verified() {
		multiselectPage.getSelectedOptions();
	}

}
