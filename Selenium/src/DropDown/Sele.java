package DropDown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
WebElement names = driver.findElement(By.name("firstname"));
names.sendKeys("Demo");
WebElement lname=driver.findElement(By.name("lastname"));
lname.sendKeys("Test");
WebElement mobileno = driver.findElement(By.name("reg_email__"));
mobileno.click();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_0);
r.keyPress(KeyEvent.VK_1);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_3);
r.keyPress(KeyEvent.VK_4);
r.keyPress(KeyEvent.VK_5);
r.keyPress(KeyEvent.VK_6);
r.keyPress(KeyEvent.VK_7);
r.keyPress(KeyEvent.VK_8);
r.keyPress(KeyEvent.VK_9);
Thread.sleep(3000);
r.keyRelease(KeyEvent.VK_0);
r.keyRelease(KeyEvent.VK_1);
r.keyRelease(KeyEvent.VK_2);
r.keyRelease(KeyEvent.VK_3);
r.keyRelease(KeyEvent.VK_4);
r.keyRelease(KeyEvent.VK_5);
r.keyRelease(KeyEvent.VK_6);
r.keyRelease(KeyEvent.VK_7);
r.keyRelease(KeyEvent.VK_8);
r.keyRelease(KeyEvent.VK_9);
WebElement pass=driver.findElement(By.name("reg_passwd__"));
pass.sendKeys("akshay@123");
Thread.sleep(3000);
WebElement day=driver.findElement(By.id("day"));
day.click();
select s=new select();


//driver.findElement(By.id("month")).click();
	}

}
