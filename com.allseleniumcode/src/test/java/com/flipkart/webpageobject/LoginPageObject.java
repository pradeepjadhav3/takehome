package com.flipkart.webpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.webpage.BaseClass;

public class LoginPageObject  {

	
	@FindBy(xpath="//a[@href='/account/login?ret=/']")
	public WebElement LoginBtn;

    @FindBy(xpath="(//input[@type='text'])[2]")
    public WebElement LoginTextBoxEmailorMobile;
    
	  
}

