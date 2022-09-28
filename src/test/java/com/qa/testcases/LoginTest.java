package com.qa.testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.POM.BaseClass;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SearchPage;

public class LoginTest{
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	SearchPage sp;
	
	@BeforeTest
	public void setUp() {
		driver=BaseClass.init();
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
		sp=new SearchPage(driver);
	}	
	@Test(priority = 1)
	public void validLogin() {
		hp.clickSignIn();
		lp.login("<username>", "<password>");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Assert.assertTrue(hp.logoutisDisplayed());
	}	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}	
}
