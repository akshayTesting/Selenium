package GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.annotations.ITest;

public class BaseTest implements IAutoConstant
{
	public WebDriver driver;
	public String browser;
	public String fileName;
	public String SheetName;

	
	@BeforeMethod
	public void OpenBrowser() throws IOException
	{
	FileInputStream fis=new FileInputStream(proFile);
	Properties p=new  Properties();
	p.load(fis);
	browser=p.getProperty("Browser");
	if (browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty(firefox_key, firefox_value);
		driver=new FirefoxDriver();
	}
	else if (browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get(p.getProperty("URL"));
	driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	
	
	
	


	}
	@AfterMethod
	public void closeBrowser(ITestResult testResult) throws IOException 
	{
	int	status=testResult.getStatus();
	String	name=testResult.getName();
	if (status==1)
	{
		Reporter.log("TestCase"+name+"IS pass",true);
	}
	else
	{
		Reporter.log("TestCase"+name+"IS fail",true);
		String path=img_path + name + " .png";
		ScreenShot.takePic(driver, path);
	}
		driver.close();
	}
}
