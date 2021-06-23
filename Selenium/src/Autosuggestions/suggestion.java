package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("fresher j");
		Thread.sleep(3000);
		List<WebElement> ele1=driver.findElements(By.xpath("//li[@class=\"sbct\"]"));
		System.out.println("total job"+"   "+ele1.size());
		for (WebElement b : ele1)
		{
		System.out.println(b.getText());	
		}
		  driver.findElement(By.xpath("//b[text()='ob openings']")).click();
		  
		 Thread.sleep(2000);
		 driver.close();
	}

}
