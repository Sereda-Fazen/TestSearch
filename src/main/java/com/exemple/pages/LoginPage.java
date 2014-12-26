package com.exemple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exemple.data.UserData;
import com.exemple.utils.ConfigProperties;

public class LoginPage extends Page {
	
	@FindBy(xpath = "//*[@id='search']/input")
	public WebElement fieldSearch;
	
	@FindBy(xpath = "//*[@id='livesearch_search_results']/li[5]/a" )
	public WebElement button;
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	public HomePage loginAs(UserData admin) {
		type(fieldSearch, admin.search);
		button.click();
		
		return PageFactory.initElements(driver, HomePage.class);	
	}
    @Override
	public void open(){
		driver.get(ConfigProperties.getProperty("login.url"));
	}

	
		

}
