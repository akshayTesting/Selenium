package FRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class clearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("FromTag")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.id("ToTag")).sendKeys("Pune");
		Thread.sleep(3000);
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='28']")).click();
		Thread.sleep(2000);

		WebElement adult = driver.findElement(By.id("Adults"));
		//adult.click();
		Select s=new Select(adult);
		s.selectByIndex(2);
		Thread.sleep(3000);
		WebElement children = driver.findElement(By.id("Childrens"));
		Select s1=new Select(children);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,5000)");
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(3000);
		WebElement seat = driver.findElement(By.id("Class"));
		Select s2=new Select(seat);
		s2.selectByIndex(3);
		Thread.sleep(3000);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Air Asia Indonesia (XT)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"pr10\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("SearchBtn")).click();
		driver.close();
		
	}

}
