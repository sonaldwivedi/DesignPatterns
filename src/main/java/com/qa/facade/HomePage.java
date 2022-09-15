package com.qa.facade;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(css = "div.product-image-container a")
	private List<WebElement> productList;
	
	@FindBy(css = "a.ajax_add_to_cart_button span")
	private List<WebElement> addToCartBtnList;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedToChkOut;
	
	
	public SummaryPage addToCartAndProceedToChkOut(int i, WebDriver driver) throws InterruptedException {
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(productList.get(i)).perform();
		addToCartBtnList.get(i).click();
		proceedToCheckOut(driver);
		return new SummaryPage(driver);
	}
	
	public void proceedToCheckOut(WebDriver driver) {
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(proceedToChkOut)).click();
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
