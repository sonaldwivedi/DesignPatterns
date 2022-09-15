package com.qa.facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	WebDriver driver;
	
	@FindBy(css = "a.cheque")
	private WebElement payByCheque;
	
	@FindBy(xpath = "//span[contains(text(), 'I confirm my order')]")
	private WebElement confirmBtn;
	
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement backToOrders;
	
	@FindBy(css="i.icon-home")
	private WebElement homeBtn;
	
	@FindBy(css = "div.shopping_cart span.ajax_cart_quantity")
	private WebElement cartCount;
	
	
	public String clickPayByChequeAndConfirm(WebDriver driver) throws InterruptedException {
		payByCheque.click();
		confirmBtn.click();
		Thread.sleep(2000);
		return cartCount.getText();
	}
	
	public HomePage clickHomeBtn() {
		homeBtn.click();
		return new HomePage(driver);
	}
	
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
