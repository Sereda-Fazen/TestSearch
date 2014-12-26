package com.exemple.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import com.exemple.data.UserData;
import com.exemple.utils.ConfigProperties;

public class BaseTestCase {

	protected static WebDriver driver;
	
	public UserData admin = new UserData("Наполнители");
	
	protected WebDriver getWebDriver(){
		  if  (driver == null) {
			   driver = new FirefoxDriver();
		       driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")),TimeUnit.SECONDS);
		  }
		 return driver;
		  
	}
		  
	  @AfterTest
	  public void tearDown() throws Exception {
	    driver.quit();
	   
	  }
}
