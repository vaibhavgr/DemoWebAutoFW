package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.PageActions;

public class BasePage extends PageActions {
	

	WebDriver driver;
	
	@FindBy(xpath = "//a[@class='ico-register']")
	protected WebElement register;
	
	@FindBy(xpath = "//*[@class='top-menu']/li/a")
	protected List<WebElement> TopMenuItems;
	

}
