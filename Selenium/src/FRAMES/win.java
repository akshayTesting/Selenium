package FRAMES;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class win {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.findElement(By.xpath("//input[@name=\"B3\"]")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(3000);
		//a.dismiss();
		a.accept();
		Thread.sleep(3000);
		driver.close();
	}

}
