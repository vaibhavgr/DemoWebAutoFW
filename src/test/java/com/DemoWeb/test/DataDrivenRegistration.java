package com.DemoWeb.test;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import models.Person;
import utils.ExcelReader;

public class DataDrivenRegistration extends BaseTest {

	@Test
	public void verifyUserIsAbleToRegisterMultiplePerson() throws IOException {
		HP.navigateToRegistration();
		List<Person> personList = ExcelReader.readData();
		for (Person person : personList) {
			RP.RegisterMultipleUsers(person);
		}
	}
}
