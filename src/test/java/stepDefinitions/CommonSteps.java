package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;

public class CommonSteps {
	
	WebDriver driver = Hooks.driver;

	@Given("User is on the practice page")
	public void user_is_on_the_practice_page() {
		driver.get("https://www.letskodeit.com/practice");
		System.out.println("User is on the Homepage.");
	}
}
