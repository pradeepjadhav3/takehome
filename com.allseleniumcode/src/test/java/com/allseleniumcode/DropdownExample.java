package com.allseleniumcode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownExample {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://practice.expandtesting.com/dropdown");
	Thread.sleep(3000);
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown']"));
	Select selectall=new Select(dropdown);
    selectall.getAllSelectedOptions();
	
	
}
}
