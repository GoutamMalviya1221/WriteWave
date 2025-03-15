package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver , this);
		
	}

	@FindBy(xpath = "//input[@placeholder='username']")
	private WebElement login;
	

	@FindBy(xpath = "//input[@placeholder='password']")
	private WebElement password;	
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginbtn;
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void Login(String username , String password) {
		
		login.sendKeys(username);
		this.password.sendKeys(password);
		loginbtn.click();
	
}
}
