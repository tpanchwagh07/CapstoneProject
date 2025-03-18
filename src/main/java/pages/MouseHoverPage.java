package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MouseHoverPage extends BasePage{

	public MouseHoverPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By mouseHoverButton = By.id("mousehover");
    By topOption = By.xpath("//div[@class='mouse-hover-content']/a[text()='Top']");
    By reloadOption = By.xpath("//div[@class='mouse-hover-content']/a[text()='Reload']");
    
    public void mouseHover() {
    	driver.findElement(mouseHoverButton).click();
    }
	
    public boolean areOptionsDisplayed() {
    	return driver.findElement(topOption).isDisplayed() && driver.findElement(reloadOption).isDisplayed();

    }
    
}
