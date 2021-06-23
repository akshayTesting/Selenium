package DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	WebElement months = driver.findElement(By.id("month"));
	Select s=new Select(months);
	s.selectByIndex(4);
	List<WebElement>alloptions=s.getOptions();
		System.out.println(months.getText());
		Thread.sleep(3000);
		System.out.println("****************************************");
		ArrayList a=new ArrayList();
		for (WebElement o : alloptions)
		{
		String text= o.getText();
		System.out.println(text);

		a.add(text);
			
		}
		Collections.sort(a);
		System.out.println("after sort");
		for (Object obj : a)
		{
		System.out.println(obj);	
		}
		
		driver.close();
	}

}
