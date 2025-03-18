package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends BasePage{

	public CheckBoxPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By bmwCheck = By.id("bmwcheck");
	By benzCheck = By.id("benzcheck");
	By hondaCheck = By.id("hondacheck");
	
	public void selectBMW() {
		driver.findElement(bmwCheck).click();
	}
	
	public void selectBenz() {
		driver.findElement(benzCheck).click();
	}
	
	public void selectHonda() {
		driver.findElement(hondaCheck).click();
	}
	
	public boolean isBMWSelected() {
		return driver.findElement(bmwCheck).isSelected();
	}
	
	public boolean isBenzSelected() {
		return driver.findElement(benzCheck).isSelected();
	}
	
	public boolean isHondaSelected() {
		return driver.findElement(hondaCheck).isSelected();
	}
	
}
