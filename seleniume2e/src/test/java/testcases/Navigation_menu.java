package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.Base;
import pages.HomePage;

public class Navigation_menu extends Base {
	
	WebDriver driver=null;
	
	
	@Test(priority=3)
	public void openNavMenu_Homepage()
	{
		driver=getDriver();
		HomePage homePage=new HomePage(driver);
		homePage.scrollPage();
		homePage.clickNavMenu();
	}

}
