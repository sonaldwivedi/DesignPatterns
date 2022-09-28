package com.qa.fluent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	WebDriver driver;
	
	@FindBy(css = "div#uniform-id_gender2")
	private WebElement mrsRadio;
	
	@FindBy(css = "input#customer_firstname")
	private WebElement firstName;
	
	@FindBy(css = "input#customer_lastname")
	private WebElement lastName;
	
	@FindBy(css = "input#passwd")
	private WebElement password;
	
	@FindBy(css = "input#firstname")
	private WebElement addFirstName;
	
	@FindBy(css = "input#lastname")
	private WebElement addLastName;
	
	@FindBy(css = "input#city")
	private WebElement city;	
	
	@FindBy(css = "input#postcode")
	private WebElement postcode;
	
	@FindBy(css = "button#submitAccount")
	private WebElement registerBtn;
	
	RegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public RegistrationPage selectFemaleTitle() {
		System.out.println("driver; " +driver);
		mrsRadio.click();
		return this;
	}
	
	public RegistrationPage enterFirstName(String first) {
		firstName.sendKeys(first);
		return this;
	}
	
	public RegistrationPage enterLastName(String last) {
		lastName.sendKeys(last);
		return this;
	}

	public RegistrationPage enterPassword(String pass) {
		password.sendKeys(pass);
		return this;
	}
	
	public RegistrationPage enterAddFirstName(String first) {
		addFirstName.sendKeys(first);
		return this;
	}
	
	public RegistrationPage enterAddLastName(String last) {
		addLastName.sendKeys(last);
		return this;
	}
	
	public RegistrationPage enterCity(String cityName) {
		city.sendKeys(cityName);
		return this;
	}
	
	public RegistrationPage enterCode(String post) {
		postcode.sendKeys(post);
		return this;
	}
	
	public HomePage clickRegister() {
		registerBtn.click();
		return new HomePage(driver);
	}
	

	public static RegistrationPage using(WebDriver driver) {
		return new RegistrationPage(driver);
	}
}
