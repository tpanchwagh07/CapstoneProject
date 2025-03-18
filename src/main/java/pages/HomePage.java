package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	//constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//locators
	By homeLink = By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[1]/a");
	By allCoursesLink = By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[2]/a");
	By interviewLink = By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[3]/a");
	By supportLink = By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[4]/a");
	By blogLink = By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[5]/a");
	
	//verify the display of sections
	public boolean isSectionDisplayed(List<String> expectedSections) {
		
		for(String section : expectedSections) {
			boolean isDisplayed = false;
			if (section.equals("Home")) {
				isDisplayed = driver.findElement(homeLink).isDisplayed();
			}else if (section.equals("All courses")) {
				isDisplayed = driver.findElement(allCoursesLink).isDisplayed();
			}else if (section.equals("Interview")) {
				isDisplayed = driver.findElement(interviewLink).isDisplayed();
			}else if (section.equals("Support")) {
				isDisplayed = driver.findElement(supportLink).isDisplayed();
			}else if (section.equals("Blog")) {
				isDisplayed = driver.findElement(blogLink).isDisplayed();
			}else {
				return false;
			}
			if(!isDisplayed) {
				return false;
			}
		}
		return true;
	}
	
}
