package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_ACtiTIme {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Actime_Login a=new Actime_Login(driver);
		 driver.navigate().refresh();
		 System.out.println(driver.getTitle());
		 a.username("admin");  //call to user name method
		 Thread.sleep(2000);
		 a.pass("manager");  // call to password method
		 Thread.sleep(2000);
		 a.checkBox();		//call to check box method
		 Thread.sleep(5000);
		 a.logins();  //login method call
		 LogOut_ActiTime l=new LogOut_ActiTime(driver);
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 l.logout();
		 
		 
		driver.close();
	}

}
