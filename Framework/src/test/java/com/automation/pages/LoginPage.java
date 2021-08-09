package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	@FindBy(name="email") WebElement uname;
	@FindBy(name="password") WebElement pword;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement loginbutton;

	
	public void loginTestCRM(String UsernameApplication,String passwordApplication)
	{
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		uname.sendKeys(UsernameApplication);
		pword.sendKeys(passwordApplication);
	}
	
}
