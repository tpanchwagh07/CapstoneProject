package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RadioButtonPage;

public class RadioButtonSteps {
	
	WebDriver driver = Hooks.driver;
	RadioButtonPage radioButtonPage = new RadioButtonPage(driver);
	
	@When("User selects a radio button")
	public void user_selects_a_radio_button() {
		radioButtonPage.selectBMW();
	}
	@Then("The selected radio button should be verified")
	public void the_selected_radio_button_should_be_verified() {
		Assert.assertTrue(radioButtonPage.isBMWSelected(), "BMW is not Selected!");
		Assert.assertFalse(radioButtonPage.isHondaSelected(), "Honda is Selected!");
	}

}
