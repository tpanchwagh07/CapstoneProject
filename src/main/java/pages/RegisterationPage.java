package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPage extends BasePage{

	public RegisterationPage(WebDriver driver) {
		super(driver);
	}
	//locators
	By firstName = By.id("firstName");
	By lastName = By.id("lastName");
	By email = By.id("email");
	By password = By.id("password");
	By submitButton = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div/div[1]/form/button[1]");
	
	public void enterDetails() {
		driver.findElement(firstName).sendKeys("Peter");
		driver.findElement(lastName).sendKeys("Parker");
		driver.findElement(email).sendKeys("peterparker@gmail.com");
		driver.findElement(password).sendKeys("Spiderman@3000");
	}
	
	public void submit() {
		driver.findElement(submitButton).click();
	}
}
