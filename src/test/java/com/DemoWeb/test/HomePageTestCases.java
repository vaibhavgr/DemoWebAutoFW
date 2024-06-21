package com.DemoWeb.test;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.TestProperties;
import utils.UniqueGenerator;






public class HomePageTestCases extends BaseTest {

	
	  // Verify user is able to view "Enter Email" Validation on CLicking Subscribe
	  //without Email
	  
	  @Test public void VerifyUserIsAbleToViewTheValidationPostEnteringBlank()throws InterruptedException 
	  { 
	  LP.ClickOnloginBtn(); LP.Login();
	  HP.ClickSubscribeBtn(); Thread.sleep(1000);
	  Assert.assertEquals(HP.GetEmailError(), "Enter valid email"); 
	  }
	 
	

	// Validate Getting Thank you message
	@Test(dataProvider ="getData")
	public void VerifyGettingThankMessageAfterSubscription(String emailVal) throws InterruptedException, IOException 
	{
		Properties prop = TestProperties.getProperties();
		String ActualText= prop.getProperty("subscriptionMsg");
		String ExpectedText = HP.NewsLetterThankYouMessage(emailVal);
		Thread.sleep(2000);	
		Assert.assertEquals(ActualText, ExpectedText);
	}

	
	@DataProvider
	public String[][] getData()
	{
		String [][] data = new String [3][1];
		data[0][0] = UniqueGenerator.getRandomNumber() + "@yopmail.com";
		data[1][0] = UniqueGenerator.getRandomNumber() + "@gmail.com";
		data[2][0] = UniqueGenerator.getRandomNumber() + "@hotstar.com";
		
		
		return data;
	}
	
}
