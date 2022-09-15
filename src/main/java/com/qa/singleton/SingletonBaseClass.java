package com.qa.singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SingletonBaseClass {

	private static WebDriver driver = null;
	private static String browserName= "chrome";

	public static void init() {
		if (driver == null) {
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void quit() {
		driver.quit();
		driver=null;
	}
}
