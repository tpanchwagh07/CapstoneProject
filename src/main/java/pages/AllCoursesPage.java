package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllCoursesPage extends BasePage{

	public AllCoursesPage(WebDriver driver) {
		super(driver);
	}

	//locators
	By allCoursesLink = By.xpath("//*[@id=\"navbar-inverse-collapse\"]/ul/li[2]/a");
	By categoryDropdown = By.name("categories");
    By searchField = By.id("search");
    By searchButton = By.className("search-course");
    By courseResults = By.id("course-list");
	
    public void allCourses() {
    	driver.findElement(allCoursesLink).click();
    }
    
    public void selectCategory() {
        Select select = new Select(driver.findElement(categoryDropdown));
        select.selectByIndex(5);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

    public boolean verifyCategoryResults() {
        return driver.findElement(courseResults).getText().contains("Selenium WebDriver Advanced");
    }

    public void searchCourse() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(By.id("search")));
    	searchField.click();
    	searchField.sendKeys("Selenium WebDriver Advanced");
    }

    public boolean verifyCourseResults() {
        return driver.findElement(courseResults).getText().contains("Selenium WebDriver Advanced");
    }
}
