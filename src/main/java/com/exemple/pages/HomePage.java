package com.exemple.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id='search']/input")
	public WebElement searchText;
	
	
	
	@Override
	public void open() {
		
	}
	public boolean isLogIn() {
		if (isElementPresent(searchText)) {
		return true;
		}
		else
			return false;
	}
	
	public void logout() {
		searchText.click();
	}
	
}
	


