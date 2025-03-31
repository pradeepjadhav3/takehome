package com.flipkart.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.flipkart.webpageobject.LoginPageObject;


public class LoginPage extends BaseClass {
	 private LoginPageObject loginPageObject;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		loginPageObject = new LoginPageObject();
		PageFactory.initElements(driver, loginPageObject);
	}
	
	public void login(String mobileno_or_email)
	{
		loginPageObject.LoginBtn.click();
		loginPageObject.LoginTextBoxEmailorMobile.sendKeys(mobileno_or_email);
		
	}
}
