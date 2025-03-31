package com.allseleniumcode;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class refreshBackForwad extends Driver {

	@Test(enabled=true,priority=1,description="Back Refresh and forwad using navigate")
	
	 public void SignIn() throws InterruptedException {
      driver.navigate().to("https://www.zoho.com/");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//div[@class='signupcontainer']//a[@class='signUp'][normalize-space()='Sign up']")).click();
      Thread.sleep(2000);
      driver.navigate().back();
      Thread.sleep(2000);
      driver.navigate().forward();
      Thread.sleep(2000);
      driver.navigate().refresh();
      Thread.sleep(2000);
	}
	
	 
}
