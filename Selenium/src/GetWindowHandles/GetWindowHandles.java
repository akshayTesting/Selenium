package GetWindowHandles;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		
		Set<String> win= driver.getWindowHandles();
		System.out.println(win.getClass());
		for (String wi : win)
		{
		System.out.println(wi);
		driver.switchTo().window(wi);
		driver.close();
		}
		
	}

}
