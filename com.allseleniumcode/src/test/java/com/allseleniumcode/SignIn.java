package com.allseleniumcode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignIn extends Driver {

	@Test(enabled=true,priority=1,description="Sign in of Zoho.com")
	 public void SignIncall() throws InterruptedException {
		 driver.get("https://www.zoho.com/");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//a[@class='login']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("LOGIN_ID")).sendKeys("pradeepjadhav409@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("nextbtn")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("password")).sendKeys("Pradeep@2024");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		 Thread.sleep(2000);
         driver.findElement(By.xpath("//p[@class='name']")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
	}
	
    
	}

