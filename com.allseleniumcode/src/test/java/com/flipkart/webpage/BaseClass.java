package com.flipkart.webpage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
 protected  WebDriver driver;
 protected  WebDriverWait wait;
       public BaseClass(WebDriver driver)
       {
    	   this.driver=driver;
    	   this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	   PageFactory.initElements(driver, this);
       }
}
