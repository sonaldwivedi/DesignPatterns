package com.qa.testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.fluent.HomePage;
import com.qa.fluent.LoginPage;
import com.qa.fluent.RegistrationPage;

public class FluentDesignTest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
	}
	

	@Test(priority = 1)
	public void register() {
		
		HomePage.using(driver)
			.clickSignIn();
		
		LoginPage.using(driver)
		.enterEmailAndCreate("iloveselenium@yopmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		RegistrationPage.using(driver)
		.selectFemaleTitle()
		.enterFirstName("Peter")
		.enterLastName("John")
		.enterPassword("Test@123")
		.enterAddFirstName("Peter")
		.enterAddLastName("John")
		.enterCity("Los Angeles")
		.enterCode("88205")
		.clickRegister();		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
