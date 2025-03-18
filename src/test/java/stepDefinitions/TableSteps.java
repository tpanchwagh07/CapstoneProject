package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TablesPage;

public class TableSteps {

	WebDriver driver = Hooks.driver;
	TablesPage tablesPage = new TablesPage(driver);
	
	@When("User retrieves data from the table")
	public void user_retrieves_data_from_the_table() {
		tablesPage.fetchTableData();
	}
	@Then("The table data should be verified")
	public void the_table_data_should_be_verified() {
		tablesPage.isDataPresent();
	}

}
