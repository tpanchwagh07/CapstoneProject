package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckBoxPage;

public class CheckBoxSteps {
	
	WebDriver driver = Hooks.driver;
	CheckBoxPage checkboxPage = new CheckBoxPage(driver);

	@When("User selects a checkbox")
	public void user_selects_a_checkbox() {
		checkboxPage.selectBenz();
		checkboxPage.selectHonda();
	}
	@Then("The selected checkbox should be verified")
	public void the_selected_checkbox_should_be_verified() {
		Assert.assertTrue(checkboxPage.isBenzSelected(), "Benz is Not Selected!");
		Assert.assertFalse(checkboxPage.isBMWSelected(), "BMW is selected!");
	}

}
