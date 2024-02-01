package com.infosys.banking.bankingproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driversetup {
WebDriver driver;
	public void driversetup()
	{
		WebDriverManager.chromedriver().setup();
		 ChromeDriver   driver=new ChromeDriver();
		   driver.get("https://www.idbibank.in/");
	}

	public void tearDown()
	{
	driver.close();
	}

}
