package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWinddowsHandles_Method
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		 Set<String> wins = driver.getWindowHandles();
		
		System.out.println(wins.getClass());
		for (String wi : wins)
		{
		System.out.println(wi);
		driver.switchTo().window(wi);
		driver.close();
		}
		
	}

}
