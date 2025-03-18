package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MouseHoverPage;

public class MouseHoverSteps {
	
	WebDriver driver = Hooks.driver;
	MouseHoverPage mousehoverPage = new MouseHoverPage(driver);

	@When("User hovers over an element")
	public void user_hovers_over_an_element() {
		mousehoverPage.mouseHover();
	}
	@Then("The hover action should display additional options")
	public void the_hover_action_should_display_additional_options() {
		Assert.assertTrue(mousehoverPage.areOptionsDisplayed(), "Options are Not Displayed!");
	}

}
