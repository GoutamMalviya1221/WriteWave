package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register {

	WebDriver driver;

	Select s;
		
		//Create a constructor 
		public Register(WebDriver driver){
			
			this.driver = driver;
			
			PageFactory.initElements(driver , this);

		}
		@FindBy(css = "[placeholder=\'Username\']")
		private WebElement username;

		
		@FindBy(css = "[placeholder=\'Password\']")
		private WebElement password;

		@FindBy(css = "[type=\'submit\']")
		private WebElement btn;

		public WebElement getUsernam() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getBtn() {
			return btn;
		}
		
		public void LoginDetails(String username, String Password ) {
			
			this.username.sendKeys(username);
			this.password.sendKeys(Password);
			
			
		}
		
		public void Btn() {

			this.btn.click();
		}
}
