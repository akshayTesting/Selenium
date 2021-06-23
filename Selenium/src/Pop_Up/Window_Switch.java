package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FRAMES.alert;

public class Window_Switch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.findElement(By.xpath("//input[@name=\"B2\"]")).click();
		 Alert a=driver.switchTo().alert();
		 System.out.println(a.getText());
		 Thread.sleep(3000);
		 a.accept();
		 Thread.sleep(3000);
		 driver.close();
	}

}
