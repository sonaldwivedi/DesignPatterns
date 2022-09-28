package com.qa.facade;

import org.openqa.selenium.WebDriver;

public class PlaceOrderFacade {

	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	SummaryPage sp;
	ShippingPage shp;
	PaymentPage pp;
	AddressPage ap;
	
	
	public String placeOrder(WebDriver driver) throws InterruptedException {
		lp=new LoginPage(driver);
		System.out.println("lp: "+lp);
		lp.login("<username>", "<password>");
		hp=lp.clickHomeBtn(driver);
		sp=hp.addToCartAndProceedToChkOut(0, driver);
		ap=sp.proceedToCheckOut(driver);
		shp=ap.proceedToCheckOut(driver);
		pp=shp.proceedToCheckOut(driver);
		String cartCount=pp.clickPayByChequeAndConfirm(driver);
		return cartCount;
	}
}
