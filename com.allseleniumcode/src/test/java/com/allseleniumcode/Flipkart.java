package com.allseleniumcode;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung");
//        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(srcFile, new File("screenshot.png"));
       List<WebElement> allmobilename=driver.findElements(By.xpath("//form[contains(@class,'header-form-search')]//li//a"));
//        for(WebElement mobiles:allmobilename)
//        {
//        	Thread.sleep(6000);
//        	System.out.println(mobiles.getText());
//        	 
//        }
//        
        for(int i=0;i<=allmobilename.size();i++)
        {
           System.out.println(allmobilename.size());
         //  System.out.println(allmobilename.get(i).click()));
        }
      //  allmobilename.get(1).click();
      //  Thread.sleep(3000); 
	}
     
}
