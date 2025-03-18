package com.qa.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.POM.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.SearchPage;
import java.time.Duration;

public class SearchTest {
	WebDriver driver;
	HomePage hp;
	SearchPage sp;
	
	
	@BeforeTest
	public void setUp() {
		driver=BaseClass.init();
		hp=new HomePage(driver);
		sp=new SearchPage(driver);
	}
	
	@Test(priority = 1)
	public void search() {
		hp.search("dress");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(sp.getSearchName().contains("dress"));
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}	
}
