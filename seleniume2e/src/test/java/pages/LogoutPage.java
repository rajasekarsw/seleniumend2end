package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	private WebDriver driver=null;
	
	@FindBy(css ="nav>a[id='logout_sidebar_link']")
	private WebElement logout;
	
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void clickLogout()
	{
	  logout.click();
	}

}
