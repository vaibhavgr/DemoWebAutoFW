package com.DemoWeb.test;

import java.util.LinkedHashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import models.Person;

public class RegistrationTest extends BaseTest {
 
 	
	@Test
	public void verifyUserIsAbleToSignupWithValidCred() 
	{ 
		Faker faker = new Faker(); 
		String password = faker.internet().password();
		String email = faker.internet().emailAddress();
		HP.navigateToRegistration();
		LinkedHashMap<String, Object> map = RP.validateRegistration(faker.name().firstName(), faker.name().lastName(), email,password,password);
		System.out.println(map);
		Assert.assertEquals(map.get("alertMsg"), "Your registration completed"); 		
		Assert.assertEquals(map.get("LoggedEmail"), email);
		Assert.assertEquals(map.get("isLogoutDisplayed"), true );
	}
	
	
}
 