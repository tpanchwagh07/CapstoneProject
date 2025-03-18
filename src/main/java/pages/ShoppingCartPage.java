package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By cartLink = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div[2]/div[1]/div[4]/button[2]");
	By checkOutLink = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div[1]/div[4]/div[2]/div/div[3]/div/button");
	By confirmButton = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div[1]/div/div[2]/div/div[2]/div[2]/button");
	
	public void goToCart() {
		driver.navigate().to("https://ecommercepractice.letskodeit.com/cart");
	}
	
	public void checkOut() {
		driver.findElement(checkOutLink);
	}
	
	public void confirmOrder() {
		driver.findElement(confirmButton);
	}
	
}
