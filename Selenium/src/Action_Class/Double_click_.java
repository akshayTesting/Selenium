package Action_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click_ {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		WebElement button=(WebElement) driver.findElement(By.xpath("//button[@id=\"add\"]"));
		
		a.doubleClick(button).perform();
		a.doubleClick(button).perform();
		a.doubleClick(button).perform();
		a.doubleClick(button).perform();
		Thread.sleep(7000);
		driver.close();
	}

}
