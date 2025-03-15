package Test;

import org.testng.annotations.Test;

import Genric.basetest;

public class RTest extends basetest {


	@Test(priority = 0)
	public void LoginTest() {
		hpHomePage.getLogin().click();
		lpLoginPage.Login(username, password);

	}
	
	@Test(priority = 1)
	public void Register() {
		
		hpHomePage.getRegister().click();
		lpLoginPage.getLoginbtn().click();
		rpRegistorPage.LoginDetails(username , password);
	}

}
