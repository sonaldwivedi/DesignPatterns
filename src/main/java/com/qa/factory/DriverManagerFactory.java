package com.qa.factory;

public class DriverManagerFactory {

	public static DriverManager getManager(DriverType type) {

		DriverManager driverManager = null;

		switch (type) {
		case CHROME:
			driverManager = new ChromeDriverManager();
		
		default:
			break;

		}
		System.out.println("driverManager: " + driverManager);
		return driverManager;

	}
}
