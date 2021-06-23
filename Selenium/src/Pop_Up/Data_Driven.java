package Pop_Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Driven {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
child.remove(parent);
		
		for(String b:child)
		{
			Thread.sleep(5000);
			driver.switchTo().window(b);
			
			}
		
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		 WebElement ele = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
		 Thread.sleep(3000);
		ele.click();
		
		driver.switchTo().window(parent);
		WebElement ele1 = driver.findElement(By.linkText("Forgotten password?"));
	Thread.sleep(3000);
		ele1.click();
		
		driver.quit();
	}

}
