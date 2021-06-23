package TestNG_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActiTImeForgetPass extends ActiTime
{
	@Test
	public void forgetpass() throws InterruptedException
	{
		WebElement forgetpass = driver.findElement(By.xpath("//a[contains(.,'Forgot your password?')]"));
		forgetpass.click();
		WebElement EnterEmail = driver.findElement(By.xpath("//input[@placeholder='Your Email or Username']"));
		Thread.sleep(3000);
		EnterEmail.sendKeys("admin");
		Thread.sleep(3000);
		WebElement Registration = driver.findElement(By.xpath("//div[text()='Request Login Info']"));
		Thread.sleep(3000);
	Registration.click();
	String title=driver.getTitle();
	Reporter.log(title,true);
	
	}

}
