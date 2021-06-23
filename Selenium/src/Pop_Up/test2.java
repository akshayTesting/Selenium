package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/account/register/basicdetails");
driver.findElement(By.xpath("//button[text()='I am a Professional']")).click();
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\Akshay\\Desktop");
	}

}
