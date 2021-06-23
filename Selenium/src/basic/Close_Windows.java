package basic;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Windows {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String mainwindow=driver.getWindowHandle();
		System.out.println(mainwindow);
		Set<String> subwindow=driver.getWindowHandles();
		ArrayList<String>a=new ArrayList<String>(subwindow);
		for (int i = a.size()-1; i>=0; i--) 
		{
		driver.switchTo().window(a.get(i));
		Thread.sleep(3000);
		driver.close();
		}
	}

}
