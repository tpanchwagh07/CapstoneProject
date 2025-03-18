package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TabsPage;

public class SwitchingTabsSteps {
	
	WebDriver driver = Hooks.driver;
	TabsPage tabsPage = new TabsPage(driver);

	@When("User opens a new tab")
	public void user_opens_a_new_tab() {
		tabsPage.openNewTab();
		tabsPage.switchToNewTab();
	}
	@Then("User should be able to switch back to the main tab")
	public void user_should_be_able_to_switch_back_to_the_main_tab() {
		tabsPage.closeNewTabAndSwitchBack();
	}
	
}
