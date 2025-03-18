package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage extends BasePage{

	public RadioButtonPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By bmwRadio = By.id("bmwradio");
	By benzRadio = By.id("benzradio");
	By hondaRadio = By.id("hondaradio");
	
	public void selectBMW() {
		driver.findElement(bmwRadio).click();
	}
	
	public void selectBenz() {
		driver.findElement(benzRadio).click();
	}
	
	public void selectHonda() {
		driver.findElement(hondaRadio).click();
	}
	
	public boolean isBMWSelected() {
		return driver.findElement(bmwRadio).isSelected();
	}
	
	public boolean isBenzSelected() {
		return driver.findElement(benzRadio).isSelected();
	}
	
	public boolean isHondaSelected() {
		return driver.findElement(hondaRadio).isSelected();
	}
	
}
