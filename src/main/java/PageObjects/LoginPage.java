package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DemoWeb.Utils.PageActions;

public class LoginPage extends PageActions

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
	private WebElement Password;

	@FindBy(css = ".button-1.login-button")
	private WebElement Submitbtn;

	@FindBy(xpath = "//*[@class='header-links']//*[@class='account']")
	private WebElement EmailLogin;
	
	
	@FindBy(xpath = "//*[@class='top-menu']/li/a")
	private List<WebElement> TopMenuItems;
	
	public void  ClickOnloginBtn() {

		clickElement(LoginBtn);
	}

	public String Login() {
		clickElement(username);
		setTextBox(username, "obsqura24@gmail.com");
		setTextBox(Password, "mypassword");
		clickElement(Submitbtn);
		return "obsqura24@gmail.com";
	}

	public String LoginEmailFetch() {
		return EmailLogin.getText();
	}
	 
	public List<String> getHeaders()
	{
		return getListOfTestFromWebElements(TopMenuItems);
		
		
	}
	
	
}
