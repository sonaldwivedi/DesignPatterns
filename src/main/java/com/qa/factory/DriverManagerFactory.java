package com.qa.factory;

public class DriverManagerFactory {

	public static DriverManager getManager(DriverType type) {
		DriverManager driverManager = null;

		switch (type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
		
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			
		case EDGE:
			driverManager = new EdgeDriverManager();
			
		default:
			break;

		}
		return driverManager;

	}
}
