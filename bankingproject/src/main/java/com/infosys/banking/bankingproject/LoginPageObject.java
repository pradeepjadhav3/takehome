package com.infosys.banking.bankingproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject  {

	@FindBy(xpath="//button[@id='AccdropdownMenuButton']")
	WebElement loginlink;
	
	   public void loginlink() {
		// TODO Auto-generated method stub
    loginlink.click();
	}
}
