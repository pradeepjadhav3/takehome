package com.allseleniumcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver{
	
	 protected WebDriver driver;
	
	 public Driver() {
		 
		
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	 
	 }
}
