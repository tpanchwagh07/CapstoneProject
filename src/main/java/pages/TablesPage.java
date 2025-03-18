package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TablesPage extends BasePage{

	public TablesPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By tableRows = By.xpath("//table[@id='product']//tr");

    public void fetchTableData() {
        List<WebElement> rows = driver.findElements(tableRows);
        for (WebElement row : rows) {
            System.out.println(row.getText());
        }
    }
    
    public boolean isDataPresent() {
        List<WebElement> rows = driver.findElements(tableRows);
        for (WebElement row : rows) {
            if (row.getText().contains("Selenium WebDriver With Java")) {
                return true;
            }
        }
        return false;
    }
    
}
