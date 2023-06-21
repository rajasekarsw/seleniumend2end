package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.LogoutPage;

public class Logout extends Base{
	
	WebDriver driver=null;
	@Test(priority=4)
	public void logout()
	{
		driver=getDriver();
		LogoutPage logoutPage=new LogoutPage(driver);
		
		logoutPage.clickLogout();
		
		Assert.assertEquals(driver.getTitle(),"Swag Labs" );
		
	}

}
