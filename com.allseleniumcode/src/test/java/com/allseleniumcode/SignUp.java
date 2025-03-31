package com.allseleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	@Test(enabled = true, priority = 2, description = "Sign up Page for Zoho website")

	/**
	 * @author pradeep
	 * @description this page is used for the sign UP
	 */
	public void SignUpPage() {

		WebDriverManager.chromedriver().setup(); // this is used to setup chrome driver
		WebDriver driver = new ChromeDriver();// open Chrome Browser
		driver.get("https://www.zoho.com/"); // this is used to open zoho website in chrome browser(Automated);
		// following are signup automation steps
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		String title = driver.getTitle();
		System.out.println("My website title is:->" + title);
		WebElement test = driver.findElement(By.xpath("//span[text()='Have a Zoho Account? ']"));
		System.out.println(test);
		String expectedLabel = "Have a Zoho Account?";
		Assert.assertEquals("Have a Zoho Account?", expectedLabel);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pradeepjadhav409@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sairam111e@232");
		driver.findElement(By.xpath("//input[@id='rmobile']")).sendKeys("9823144567");
		driver.findElement(By.xpath("//span[@id='signup-termservice']")).click();
		Boolean b = driver.findElement(By.xpath("//span[@id='signup-termservice']")).isDisplayed();
		System.out.println("Check box is selected:->    " + b);
		String curenturl = driver.getCurrentUrl();
		System.out.println("Current URL:-" + curenturl);
		driver.findElement(By.xpath("//input[@id='signupbtn']")).click();
        
	}
}
