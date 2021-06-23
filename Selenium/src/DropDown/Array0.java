package DropDown;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Array0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	WebElement ele = driver.findElement(By.id("month"));
	Select s=new Select(ele);
	s.selectByIndex(2);
	
	List<WebElement> allOption = s.getOptions();
	System.out.println(allOption.size());
	
	ArrayList a=new ArrayList<>();
	
	for(WebElement b:allOption) {
		String text = b.getText();
		System.out.println(text);
		a.add(text);
	}
	
	Collections.sort(a);
	System.out.println("************after sorting*********");
	
	for(Object b:a)
	{
		System.out.println(b);
	}
	driver.close();
	}

}
