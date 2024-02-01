package com.infosys.banking.bankingproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest extends driversetup
{
	LoginPageObject loginpageobject=new LoginPageObject();
	WebDriver driver;

@Test(enabled=true, description="This is login test")
public void login() throws InterruptedException
{
   
   Thread.sleep(2000);
   loginpageobject.loginlink();	
}


}