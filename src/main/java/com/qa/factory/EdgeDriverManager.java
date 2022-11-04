package com.qa.factory;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeDriverManager extends DriverManager {
	public EdgeDriverManager() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
}
