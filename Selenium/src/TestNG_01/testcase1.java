package TestNG_01;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase1 extends Sample
{
	@Test
	public void login() 
	{
	driver.findElement(By.id("email")).sendKeys("GFHGHFGGHFGHG");
	driver.findElement(By.id("pass")).sendKeys("gdgchgghghgj");
	driver.findElement(By.name("login")).click();
	String t = driver.getTitle();
	//Assert.assertEquals(t,"qwery4556");
	SoftAssert s=new SoftAssert();
	s.assertEquals(s,"trtyrtytryty");
	Reporter.log(t,true);
	String u = driver.getCurrentUrl();
	Reporter.log(u,true);
	s.assertAll();
	
	}
}
