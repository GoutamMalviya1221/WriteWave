package Genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PageClasses.HomePage;
import PageClasses.LoginPage;
import PageClasses.Register;


public class basetest {
	protected WebDriver driver;
	
	protected String username;
	protected String password ;
	String url;
	protected LoginPage lpLoginPage;
	protected HomePage hpHomePage;
	protected Register rpRegistorPage;
	
	@BeforeClass
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\Documents\\workspace-spring-tool-suite-4-4.24.0.RELEASE\\R_System\\src\\test\\resources\\Config.properties");
		properties.load(file);
		url = properties.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		lpLoginPage = new LoginPage(driver);
		hpHomePage = new HomePage(driver);
		rpRegistorPage = new Register(driver);
		
		username = properties.getProperty("username");		
		password = properties.getProperty("Password");


}
	@AfterClass
	public void teardown() {
		
		driver.close();
	}
}
