package com.flipkart.webpagetest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.flipkart.webpage.LoginPage;

public class LoginTest extends BaseTest {
	 LoginPage loginPage;
	
	@Test(priority=1,description="Enter the mobile number or email id")
	
	public void tesValiidlogin()
	{
		 loginPage = new LoginPage(driver);
		 loginPage.login("9834350233");
	}
	
}
