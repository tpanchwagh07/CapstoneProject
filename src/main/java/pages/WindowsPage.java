package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowsPage extends BasePage{

	public WindowsPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By openWindowButton = By.id("openwindow");

	public void openNewWindow() {
		driver.findElement(openWindowButton).click();
	}

	public void switchToNewWindow() {
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
	}
	
	public void closeNewWindowAndSwitchBack() {
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                driver.close();
                break;
            }
        }
        driver.switchTo().window(mainWindow);
    }
}
