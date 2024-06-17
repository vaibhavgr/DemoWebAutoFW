package com.DemoWeb.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	// Verify user is able to click Login Button
	@Test
	public void login() {
		LP.ClickOnloginBtn();
	}

	// Verify user is able to login successfully &able  to view email id post login
	@Test(priority = 2)
	public void VerifyUserIsAbleToLoginAndViewTheLoginEmailPostLogin() {
		LP.ClickOnloginBtn();
		String actualEmail = LP.Login();
		String expectedEmail = LP.LoginEmailFetch();
		//Assert.assertEquals(expectedEmail, "obsqura24@gmail.com");
		
		Assert.assertEquals(actualEmail, expectedEmail, "Email is displayed");
	}

	// verify user is getting all validation on login
	@Test(priority = 3) 
	public void VerifyValidationOnLogin() {
	}

}
