package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("actiTIME - Login")) {
			System.out.println("Pass:Home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}
		
		driver.close();
	}

}
