package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnableDisablePage extends BasePage{

	public EnableDisablePage(WebDriver driver) {
		super(driver);
	}

	//locators
	By inputField = By.id("enabled-example-input");
    By enableButton = By.id("enabled-button");
    By disableButton = By.id("disabled-button");
    
    public void enableField() {
    	driver.findElement(enableButton).click();;
    }
    
    public void disableField() {
    	driver.findElement(disableButton).click();;
    }
    
    public boolean isFieldEnabled() {
    	return driver.findElement(inputField).isEnabled();
    }
}
