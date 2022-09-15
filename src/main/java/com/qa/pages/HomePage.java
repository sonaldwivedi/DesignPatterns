package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{
	WebDriver driver;
	
	@FindBy(css = "a.login")
	private WebElement signIn;
	
	@FindBy(css = "input#search_query_top")
	private WebElement search;
	
	@FindBy(xpath = "//button[@name='submit_search']")
	private WebElement seacrhIcon;
	
	@FindBy(css = "a.logout")
	private WebElement signOut;
	
	public LoginPage clickSignIn() {
		signIn.click();
		return new LoginPage(driver);
	}
	
	public SearchPage search(String text) {
		search.sendKeys(text);
		seacrhIcon.click();
		return new SearchPage(driver);
	}
	
	public boolean logoutisDisplayed() {
		return signOut.isDisplayed();
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
