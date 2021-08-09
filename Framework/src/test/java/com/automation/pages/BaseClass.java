package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automation.utilities.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() 
	{
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://ui.cogmento.com/ ");
	}
	
	

	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}

}

