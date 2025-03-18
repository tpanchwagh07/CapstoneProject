package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DropdownPage;

public class DropdownSteps {
	
	WebDriver driver = Hooks.driver;
	DropdownPage dropdownPage = new DropdownPage(driver);

	@When("User selects an option from the dropdown")
	public void user_selects_an_option_from_the_dropdown() {
		dropdownPage.selectByValue();
		dropdownPage.selectByVisibleText();
	}
	@Then("The selected option should be verified")
	public void the_selected_option_should_be_verified() {
		dropdownPage.getSelectedCar();
		System.out.println(dropdownPage.getSelectedCar());
	}

}
