package com.qa.factory;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager extends DriverManager {
	
	public ChromeDriverManager() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
}
