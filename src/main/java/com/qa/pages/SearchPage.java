package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;
	
	@FindBy(css = "span.lighter")
	private WebElement searchName;
	
	public String getSearchName() {
		return searchName.getText().toLowerCase();
	}
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
