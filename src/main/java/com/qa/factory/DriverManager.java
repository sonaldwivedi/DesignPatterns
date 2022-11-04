package com.qa.factory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;
   

    public WebDriver getDriver() {
       
        return driver;
    }
}
