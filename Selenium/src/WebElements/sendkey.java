package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey 
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//up-casting webDriver is interface and chromeDrive is implementation and 
		//driver is reference variable of webDriver
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys("Demo123@gmail.com");
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("DemoTest@123#@!");
		Thread.sleep(3000);
		driver.close();
}
}