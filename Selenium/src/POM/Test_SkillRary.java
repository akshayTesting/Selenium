package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basic.Close_Windows;

public class Test_SkillRary {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		Login l=new  Login(driver);
		driver.navigate().refresh();
		l.username("admin");
		Thread.sleep(3000);
		l.password("admine");
		l.login();
		SkillRaryLogOUT s=new  SkillRaryLogOUT(driver);    //object create
		driver.navigate().refresh();
		s.SkillRary();
		Thread.sleep(3000);
		s.update();
		Thread.sleep(3000);
		s.close();

}
}