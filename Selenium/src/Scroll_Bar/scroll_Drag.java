package Scroll_Bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_Drag {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scroll.By(0,5000)");
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,-5000)");
		driver.close();
	}

}
