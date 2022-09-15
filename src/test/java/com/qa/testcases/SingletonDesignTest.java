package com.qa.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.singleton.SingletonBaseClass;

public class SingletonDesignTest {
	WebDriver driver1;
	WebDriver driver2;
	
	@BeforeClass
	public void setUp() {
		SingletonBaseClass.init();
	}
	
	@Test (priority = 1)
	public void verifyGoogleTitle() {
		driver1=SingletonBaseClass.getDriver();
		System.out.println("driver1: " +driver1);
		driver1.get("https://google.com");
		Assert.assertEquals(driver1.getTitle(), "Google");
	}
	
	@Test(priority = 2)
	public void verifyFacebookTitle() throws InterruptedException {
		driver2=SingletonBaseClass.getDriver();
		System.out.println("driver2: " +driver2);
		driver1.get("https://facebook.com");
		Assert.assertEquals(driver1.getTitle(), "Facebook – log in or sign up");
	}
	
	@AfterClass
	public void tearDown() {
		SingletonBaseClass.quit();
	}

}
