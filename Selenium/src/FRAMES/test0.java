package FRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[contains(text(),'Google Play')]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
