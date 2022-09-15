package com.qa.facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {

	WebDriver driver;

	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement proceedToChkOut;

	@FindBy(css = "input#cgv")
	private WebElement agreeChk;

	public PaymentPage proceedToCheckOut(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		chkAgreeBox();
		proceedToChkOut.click();
		return new PaymentPage(driver);
	}

	public void chkAgreeBox() {
		agreeChk.click();
	}

	public ShippingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
