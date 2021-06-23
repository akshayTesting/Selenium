package Scroll_Bar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Excutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//typecasting
		JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,5000)");
	
	Thread.sleep(3000);
	j.executeScript("window.scrollBy(0,-5000)");
	
	Thread.sleep(3000);
	driver.close();
	}

}
