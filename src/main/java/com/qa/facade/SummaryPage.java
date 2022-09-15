package com.qa.facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {

	WebDriver driver;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
	private WebElement proceedToChkOut;
	
	public AddressPage proceedToCheckOut(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		proceedToChkOut.click();
		return new AddressPage(driver);
	}
	
	public SummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
