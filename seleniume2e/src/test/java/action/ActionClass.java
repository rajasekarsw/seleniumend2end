package action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Base;

public class ActionClass extends Base implements ActionInterface {

	
	JavascriptExecutor jse=null;
	
	@Override
	public void pageScroll() {
		
		
		jse=(JavascriptExecutor) getDriver();
		
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		sleep(2000);
		
	}

	private void sleep(int i) {
		
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
