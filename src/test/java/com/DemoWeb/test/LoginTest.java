package com.DemoWeb.test;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.TestProperties;

public class LoginTest extends BaseTest {

	// Verify user is able to click Login Button
	@Test
	public void login() {
		LP.ClickOnloginBtn();
	}

	// Verify user is able to login successfully &able  to view email id post login
	@Test(priority = 2)
	public void VerifyUserIsAbleToLoginAndViewTheLoginEmailPostLogin() throws IOException {
		LP.ClickOnloginBtn();
		Properties prop = TestProperties.getProperties();
		//System.out.println(prop.getProperty("email"));
		//System.out.println(prop.getProperty("Password"));
		String actualEmail = LP.Login(prop.getProperty("email"), prop.getProperty("Password"));
		String expectedEmail = LP.LoginEmailFetch();
		//Assert.assertEquals(expectedEmail, "obsqura24@gmail.com");
		
		Assert.assertEquals(actualEmail, expectedEmail, "Email is displayed");
	}

	// verify user is getting all validation on login
	@Test(priority = 3) 
	public void VerifyValidationOnLogin() {
	}

}
