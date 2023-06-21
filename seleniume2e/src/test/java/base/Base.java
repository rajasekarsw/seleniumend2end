package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Base {

	public static WebDriver driver=null;
	static public Properties prop=null;
	public static ExtentReports extentReports=null;
	public ExtentTest extentTest=null;
	@BeforeSuite
	public void setUp() throws FileNotFoundException, IOException
	{
		prop=new Properties();
		
		
		prop.load(new FileInputStream(new File(System.getProperty("user.dir")+"/application.properties") ));
		
		extentReports=new ExtentReports();
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/reports/extentreports.html"));
		
		reporter.config().setDocumentTitle("Sauce lab automation");
		reporter.config().setTheme(Theme.DARK);
		
	    extentReports.attachReporter(reporter);
	}
	
	@AfterSuite
	public void tearDown()
	{
		extentReports.flush();
	}
	
	
	
public static  WebDriver getDriver()
	{
	
	if(driver==null)
	{
    driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implwait"))));
	
	}
	
		return driver;

	}
}
