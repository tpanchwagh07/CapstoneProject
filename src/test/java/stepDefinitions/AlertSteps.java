package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AlertsPage;

public class AlertSteps {
	
	WebDriver driver = Hooks.driver;
	AlertsPage alertsPage = new AlertsPage(driver);

	@When("User triggers an alert")
	public void user_triggers_an_alert() {
		alertsPage.clickConfirm();
	}
	@Then("User should be able to accept or dismiss the alert")
	public void user_should_be_able_to_accept_or_dismiss_the_alert() {
		alertsPage.acceptAlert();
	}

}
