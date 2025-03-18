package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage{

	public DropdownPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By dropdown = By.id("carselect");
	
	public void selectByValue() {
		Select select = new Select(driver.findElement(dropdown));
		select.selectByIndex(2);
	}
	
	public void selectByVisibleText() {
		Select select = new Select(driver.findElement(dropdown));
		select.selectByVisibleText("Honda");
	}
	
	public String getSelectedCar() {
		Select select = new Select(driver.findElement(dropdown));
		return select.getFirstSelectedOption().getText();
	}
	
}
