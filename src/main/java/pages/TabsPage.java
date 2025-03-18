package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TabsPage extends BasePage{

	public TabsPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By openTabButton = By.id("opentab");
	
	public void openNewTab() {
		driver.findElement(openTabButton).click();
	}
	
	public void switchToNewTab() {
		String mainTab = driver.getWindowHandle();
		Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            if (!tab.equals(mainTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
	}
	
	public void closeNewTabAndSwitchBack() {
        String mainTab = driver.getWindowHandle();
        Set<String> allTabs = driver.getWindowHandles();

        for (String window : allTabs) {
            if (!window.equals(mainTab)) {
                driver.switchTo().window(window);
                driver.close();
                break;
            }
        }
        driver.switchTo().window(mainTab);
    }
	
}
