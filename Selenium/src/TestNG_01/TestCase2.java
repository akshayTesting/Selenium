package TestNG_01;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase2 extends Sample 
{

	@Test
	public void forgotPassword() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("56756778");
		driver.findElement(By.id("did_submit")).click();
		String t=driver.getTitle();
		Reporter.log(t,true);
	}
	
}
