package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ShoppingCartPage;

public class ShoppingCartSteps {
	
	WebDriver driver = Hooks.driver;
	ShoppingCartPage shoppingcartPage = new ShoppingCartPage(driver);

	@When("User is on the shopping page")
	public void user_is_on_the_shopping_page() {
		driver.navigate().to("https://ecommercepractice.letskodeit.com/shop/");
	}
	@Then("User clicks on the cart")
	public void user_clicks_on_the_cart() {
		shoppingcartPage.goToCart();
	}
	@Then("User checksout")
	public void user_checksout() {
		shoppingcartPage.confirmOrder();
	}

}
