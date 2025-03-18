package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectPage extends BasePage{

	public MultiSelectPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By multipleSelect = By.id("multiple-select-example");
	
	public void clickOptions() {
		Select select = new Select(driver.findElement(multipleSelect));
		select.selectByIndex(0);
		select.selectByVisibleText("Peach");
	}
	
	public List<WebElement> getSelectedOptions() {
		Select select = new Select(driver.findElement(multipleSelect));
		return select.getAllSelectedOptions();
	}
	
}
