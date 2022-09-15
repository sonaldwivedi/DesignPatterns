package com.qa.fluent;
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
	
	public HomePage clickSignIn() {
		signIn.click();
		return this;
	}
		
	public HomePage(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public static HomePage using(WebDriver driver) {
        return new HomePage(driver);
    }
	
}
