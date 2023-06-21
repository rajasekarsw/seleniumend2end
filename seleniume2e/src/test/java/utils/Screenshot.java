package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Base;



public class Screenshot extends Base{
	

	public  static String screenShot(String method) throws IOException {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		File src=((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		
		String screeshotPath=System.getProperty("user.dir")+"/screenshots/"+method+"screenshot.jpg";
		
	    FileUtils.copyFile(src, new File(screeshotPath));
		
		return screeshotPath;
	}

}
