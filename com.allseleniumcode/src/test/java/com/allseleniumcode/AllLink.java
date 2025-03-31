package com.allseleniumcode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLink {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();		
			driver.get("https://www.geeksforgeeks.org/java/");
		    List<WebElement> allink=driver.findElements(By.tagName("a"));
              int count=0;
		    for (WebElement link : allink)
		    {
	            System.out.println(link.getText() + " - " + link.getAttribute("href")); // Print link text and URL
	             System.out.println(allink.size());
	             count++;
	             if(count==40)
	             {
	            	 System.out.println("continue till 50");
	            	 continue;
	             }
	             
	             if(count==50)
	             {
	            	 System.out.println("break the loop");
	            	 break;
	             }
	             
	             System.out.println("Count ="+count);
		    }
              
	}
		   
		 

}
	

