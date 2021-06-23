package TestNG_01;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ActiTime 
{
	public WebDriver driver;
 @BeforeMethod
	public void OpenApplication()
	{
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
 

@AfterMethod
public void CloseApplication() 
{
driver.close();	
}
 
}
