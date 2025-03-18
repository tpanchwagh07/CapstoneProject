package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AllCoursesPage;

public class AllCoursesSteps {
	
	WebDriver driver = Hooks.driver;
	AllCoursesPage allcoursesPage = new AllCoursesPage(driver);

	@When("user is on the All Courses page")
	public void user_is_on_the_all_courses_page() {
		allcoursesPage.allCourses();
	}
	@When("user selects a category and clicks search")
	public void user_selects_a_category_and_clicks_search() {
		allcoursesPage.selectCategory();
		allcoursesPage.clickSearch();
	}
	@Then("relevant courses should be displayed")
	public void relevant_courses_should_be_displayed() {
		Assert.assertTrue(allcoursesPage.verifyCategoryResults(), "Category is not Present.");
	}

//	@When("user searches for a course and clicks search")
//	public void user_searches_for_a_course_and_clicks_search() {
//		allcoursesPage.searchCourse();
//		allcoursesPage.clickSearch();
//	}
	@Then("the relevant course should be displayed")
	public void the_relevant_course_should_be_displayed() {
		Assert.assertTrue(allcoursesPage.verifyCourseResults(), "Course is not Present.");	}

}
