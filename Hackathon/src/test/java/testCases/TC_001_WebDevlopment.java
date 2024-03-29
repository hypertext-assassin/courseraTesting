package testCases;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.WebDevlopmentPage;
import testBase.BaseClass;

public class TC_001_WebDevlopment extends BaseClass{
	@Test(priority = 1)
	public void searchWebDevlopment() throws InterruptedException {
		logger.info("*********TC_001_WebDevlopment starts**********");
		HomePage hp = new HomePage(driver);
		hp.search();
		hp.clickOnSearchedResult();
	}
	
	@Test(priority = 2)
	public void clickFilter() throws InterruptedException {
		WebDevlopmentPage wd = new WebDevlopmentPage(driver);
		wd.clickOnEnglishCheckbox();
		Thread.sleep(1000);
		scrolling(400);
		wd.clickOnBeginnerCheckbox();
	}
	
	@Test(priority = 3)
	public void printInfo() throws InterruptedException {
		WebDevlopmentPage wd = new WebDevlopmentPage(driver);
		Thread.sleep(3000);
		scrolling(-500);
		wd.nameOfFirstCourse();
		wd.ratingOfFirstCourse();
		wd.durationOfFirstCourse();
		wd.nameOfSecondCourse();
		wd.ratingOfSecondCourse();
		Thread.sleep(3000);
		wd.durationOfSecondCourse();
		screenshot("webDevlopment");
		logger.info("*********TC_001_WebDevlopment ends**********");
	}
}
