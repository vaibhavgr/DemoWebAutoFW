package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.PageActions;

public class LoginPage extends BasePage

{
	WebDriver driver; 

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 

	@FindBy(xpath = "//*[@class='ico-login']")
	private WebElement LoginBtn;

	@FindBy(id = "Email")
	private WebElement username;

	@FindBy(id = "Password")
	private WebElement PasswordInput;

	@FindBy(css = ".button-1.login-button")
	private WebElement Submitbtn;

	@FindBy(xpath = "//*[@class='header-links']//*[@class='account']")
	private WebElement EmailLogin;
	
	
	
	
	
	public void  ClickOnloginBtn() {

		clickElement(LoginBtn);
	}

	public String Login(String emailID , String password ) {
		clickElement(username);
		setTextBox(username, emailID);
		setTextBox(PasswordInput, password); 
		clickElement(Submitbtn);
		return emailID ;
	}

	public String LoginEmailFetch() {
		return EmailLogin.getText();
	}
	 
	public List<String> getHeaders()
	{
		return getListOfTestFromWebElements(TopMenuItems);
		
		
	}
	
	
}
