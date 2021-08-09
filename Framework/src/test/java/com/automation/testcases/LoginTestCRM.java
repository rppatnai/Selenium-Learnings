package com.automation.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserFactory;

public class LoginTestCRM extends BaseClass{

	@Test
	public void LoginApp()
	{
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginTestCRM("Selenium50", "ABCHED@50");	
	}

}
