package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
    WebDriver driver=null;
	
	@FindBy(xpath="//input[@name='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}


	public void inputUserName(String userName)
	{
		username.sendKeys(userName);
	}
	
	public void inputPassword(String password)
	{
		this.password.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}

}
