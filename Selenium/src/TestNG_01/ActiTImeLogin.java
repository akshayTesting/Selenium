package TestNG_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTImeLogin extends ActiTime 
{
@Test
public void login() throws InterruptedException
{
	 WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	 Thread.sleep(3000);
	username.sendKeys("admin");
	WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	Thread.sleep(3000);
	password.sendKeys("manager");
	WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Login ']"));
	Thread.sleep(3000);
	loginbutton.click();
	String title=driver.getCurrentUrl();
	
	
	//Assert.assertEquals(title,"qwery4556");
		//SoftAssert s=new SoftAssert();
		//s.assertEquals(s,"trtyrtytryty");
		String t=driver.getTitle();
		Reporter.log(t,true);
		String u = driver.getCurrentUrl();
		Reporter.log(u,true);
		//s.assertAll();
	
}
}
