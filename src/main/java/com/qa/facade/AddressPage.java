package com.qa.facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

	WebDriver driver;
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement proceedToChkOut;
	
	public ShippingPage proceedToCheckOut(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		proceedToChkOut.click();
		return new ShippingPage(driver);
	}
	
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
