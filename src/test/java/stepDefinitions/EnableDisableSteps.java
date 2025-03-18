package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EnableDisablePage;

public class EnableDisableSteps {
	
	WebDriver driver = Hooks.driver;
	EnableDisablePage enabledisablePage = new EnableDisablePage(driver);

	@When("User enables or disables the input field")
	public void user_enables_or_disables_the_input_field() {
		enabledisablePage.disableField();
		enabledisablePage.enableField();
	}
	@Then("The input field state should be verified")
	public void the_input_field_state_should_be_verified() {
		Assert.assertTrue(enabledisablePage.isFieldEnabled(), "Field is Disabled!");
	}

}
