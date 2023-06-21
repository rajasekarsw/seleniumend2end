package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import pages.LoginPage;

public class Login extends Base {
	
	
	WebDriver driver=null;
	@BeforeTest
	public void initDriver()
	{
		driver=getDriver();
	}
	
	@Test(priority=1)
	public void openLogionPage()
	{
		driver.get(prop.getProperty("url"));
	}
	
	
	
	@Test(priority=2)
	public void login_with_credentials()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.inputUserName(prop.getProperty("username"));
		loginPage.inputPassword(prop.getProperty("password"));
		loginPage.clickSubmit();
	}
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
	}

}
