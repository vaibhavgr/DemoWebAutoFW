package com.DemoWeb.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest {

	@Test
	public void verifyUserIsAbleVerifyHeaders()
	{
		List<String> expectedHeaders = new ArrayList<>(Arrays.asList("COMPUTERS", "BOOKS", "ELECTRONICS","APPAREL & SHOES", "DIGITAL DOWNLOADS", "JEWELRY", "GIFT CARDS"));
		expectedHeaders.replaceAll(String :: toLowerCase);
		Collections.sort(expectedHeaders);
		System.out.println(expectedHeaders);
		List <String >actualHeaders = LP.getHeaders();
		Collections.sort(actualHeaders);
		System.out.println(actualHeaders);
		Assert.assertEquals(actualHeaders, expectedHeaders, "Headers Mismatch");
	}
	
}
