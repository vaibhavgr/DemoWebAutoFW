package com.DemoWeb.Utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageActions 

{
	WebDriver driver;
	
	public void clickElement(WebElement element)
	{
		waitUntilClickable(element);
		element.click();
	}
	
	public void setTextBox(WebElement element , String value)
	{
		element.sendKeys(value);
	}
	
	@FindBy(css = ".newsletter-subscribe-button")
	protected WebElement SubscribeBtn;

	
	public List<String> getListOfTestFromWebElements(List<WebElement> list )
	{
		List<String> actualList = new ArrayList<String>();
		for(WebElement item : list ) {
			 actualList.add(item.getText().toLowerCase());	}
		return actualList;
	}
	public void waitUntilClickable(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	
}
}
