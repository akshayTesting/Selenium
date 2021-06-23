package Autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggestion1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement finds = driver.findElement(By.name("q"));
		finds.sendKeys("gmail");
		List<WebElement>text = driver.findElements(By.xpath("//li[@class=\"sbct\"]"));
		System.out.println(text.size());
		for (WebElement n : text)
		{
		System.out.println(n.getText());	
		}
		driver.findElement(By.xpath("//b[text()='l create']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
