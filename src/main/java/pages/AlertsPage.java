package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends BasePage{

	public AlertsPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By alertButton = By.id("alertbtn");
	By confrimButton = By.id("confirmbtn");
	
	public void clickAlert() {
		driver.findElement(alertButton).click();
	}
	
	public void clickConfirm() {
		driver.findElement(confrimButton).click();
	}
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
}
