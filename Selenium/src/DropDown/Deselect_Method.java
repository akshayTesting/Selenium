package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("cars"));
		
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("99");
		//s.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByValue("99");
		Thread.sleep(2000);
		//s.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		Thread.sleep(2000);
		driver.close();
	}

}
