package com.qa.fluent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(css = "input#email_create")
	private WebElement emailCreate;

	@FindBy(css = "button#SubmitCreate")
	private WebElement createAccBtn;
	

	public RegistrationPage enterEmailAndCreate(String email) {
		emailCreate.sendKeys(email);
		createAccBtn.click();
		return new RegistrationPage(driver);
	}

	private LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static LoginPage using(WebDriver driver) {
		return new LoginPage(driver);
	}

}
