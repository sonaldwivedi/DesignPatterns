package com.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.factory.DriverManager;
import com.qa.factory.DriverManagerFactory;
import com.qa.factory.DriverType;

public class FactoryDesignTest {

    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void verifyFacebook() {
        driver.get("https://www.facebook.com/");
        Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
    }

    @Test
    public void verifyLinkedIn() {
        driver.get("https://www.linkedin.com/signup");
        Assert.assertEquals("Sign Up | LinkedIn", driver.getTitle());
    }

    @Test
    public void verifyGoogle() {
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }

}