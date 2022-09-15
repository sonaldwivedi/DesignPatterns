package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	 
	WebDriver driver;

	@FindBy(css = "input#email")
	private WebElement email;

	@FindBy(css = "input#passwd")
	private WebElement password;

	@FindBy(css = "button#SubmitLogin")
	private WebElement signInBtn;

	@FindBy(css="i.icon-home")
	private WebElement homeBtn;
	
	
	public void login(String user, String pass) {		
		email.sendKeys(user);
		password.sendKeys(pass);
		signInBtn.click();
	}
	
	public HomePage clickHomeBtn(WebDriver driver) {
		homeBtn.click();
		return new HomePage(driver);
	}	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
