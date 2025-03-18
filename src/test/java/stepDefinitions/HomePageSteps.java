package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pages.HomePage;


public class HomePageSteps {

	WebDriver driver = Hooks.driver;
	HomePage homePage = new HomePage(driver);

	@Then("I verify the page title")
	public void i_verify_the_page_title() {
		String actualTitle = "Practice Page";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Page Title Verified!");
	}
	@Then("I verify all the following sections:")
	public void i_verify_all_the_following_sections(DataTable table) {
		List<String> expectedSections = table.asList();
		Assert.assertTrue(homePage.isSectionDisplayed(expectedSections) , "All sections are not Displayed!");
		
	}

}

