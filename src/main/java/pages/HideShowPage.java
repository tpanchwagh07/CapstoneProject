package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HideShowPage extends BasePage{

	public HideShowPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By inputField = By.id("displayed-text");
	By hideButton = By.id("hide-textbox");
	By showButton = By.id("show-textbox");
	
	public void hideField() {
		driver.findElement(hideButton).click();
	}
	
	public void showField() {
		driver.findElement(showButton).click();
	}
	
	public void isFieldDisplayed() {
		driver.findElement(inputField).isDisplayed();
	}
	
}
