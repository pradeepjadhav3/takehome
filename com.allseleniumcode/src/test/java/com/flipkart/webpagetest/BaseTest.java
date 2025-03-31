package com.flipkart.webpagetest;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTest {
	protected WebDriver driver;
   @BeforeClass
   public void setup()
   {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.manage().window().maximize();
       driver.get("https://www.flipkart.com/");
       System.out.println("Driver initialized: " + driver); 
     //driver.get(Config.getProperty("baseURL"));
   }

   @AfterClass
   public void tearDown() {
       if (driver != null) {
           driver.quit();
       }
   }
}
