package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WindowsPage;

public class SwitchingWindowsSteps {
	
	WebDriver driver = Hooks.driver;
	WindowsPage windowsPage = new WindowsPage(driver);

	@When("User opens a new window")
	public void user_opens_a_new_window() {
		windowsPage.openNewWindow();
		windowsPage.switchToNewWindow();
	}
	@Then("User should be able to switch back to the main window")
	public void user_should_be_able_to_switch_back_to_the_main_window() {
		windowsPage.closeNewWindowAndSwitchBack();
	}

}
