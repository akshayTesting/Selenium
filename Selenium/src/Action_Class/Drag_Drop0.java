package Action_Class;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement source = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement destination=driver.findElement(By.xpath("//h1[text()='Block 4']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, destination).perform();
		Thread.sleep(10000);
		WebElement b3=driver.findElement(By.xpath("//p[text()='Block 3 data']"));
		WebElement b2=driver.findElement(By.xpath("//h1[text()='Block 2']"));
		Actions a2=new Actions(driver);
		a.dragAndDrop(b2, b3).perform();
		Thread.sleep(10000);
		
		driver.close();
	}

}
