package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By email = By.id("email");
	By password = By.id("password");
	By submit = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/main/div[2]/div[1]/form/button[1]");
	
	public void enterDetails() {
		driver.findElement(email).sendKeys("peterparker@gmail.com");
		driver.findElement(password).sendKeys("Spiderman@3000");
	}
	
	public void submit() {
		driver.findElement(submit).click();
	}
	
}
