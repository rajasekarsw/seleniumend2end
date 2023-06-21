package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import action.ActionClass;

public class HomePage extends ActionClass{
	
	ActionClass actionClass=new ActionClass();
	
	private WebDriver driver=null;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
    private WebElement nav_menu;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(this.driver, this);
	}
	
	public void scrollPage()
	{
		actionClass.pageScroll();
	}
	public void clickNavMenu()
	{
		
		nav_menu.click();
	}

}
