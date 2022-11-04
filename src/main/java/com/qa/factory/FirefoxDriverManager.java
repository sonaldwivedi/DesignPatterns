package com.qa.factory;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverManager extends DriverManager {
	public FirefoxDriverManager() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
}
