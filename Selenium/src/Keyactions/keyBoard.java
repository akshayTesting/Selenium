package Keyactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyBoard {

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.truecaller.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement no = driver.findElement(By.xpath("//input[@placeholder=\"Search a phone number\"]"));
		no.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_9);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_0);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_8);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_9);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_0);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_0);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_0);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_4);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_9);
		r.keyRelease(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_9);
		r.keyRelease(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_4);
	
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
	}

}
