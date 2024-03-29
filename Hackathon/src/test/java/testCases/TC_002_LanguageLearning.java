package testCases;
import java.time.Duration;
import testBase.BaseClass;
import pageObject.LanguageLearning;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class TC_002_LanguageLearning extends BaseClass {

	@Test (priority =1)
	public void searchLanguageLearning() throws InterruptedException {
		logger.info("********TC_002_languageLearning Starts********");
		logger.info("test started");
		LanguageLearning ll = new LanguageLearning(driver);
//		LanguageLearning l1 = new LanguageLearning(driver);
		ll.searchLanguageLearning();
		Thread.sleep(2000);
		ll.clickOnSearchResult();
	}
	@Test (priority =2)
	public void printLanguages() {
		LanguageLearning ll = new LanguageLearning(driver);
		ll.clickOnShowMore();
		ll.languages();
		screenshot("Languages");
		ll.clickOnClose();
	}
	
	@Test (priority =3)
	public void printLevels() {
		LanguageLearning ll = new LanguageLearning(driver);
		ll.levels();
		logger.info("********TC_002_languageLearning Ends********");
	}
	
}