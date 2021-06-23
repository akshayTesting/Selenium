package Website_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import DropDown.select;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		 System.out.println(driver.getTitle());
		 WebElement source = driver.findElement(By.id("src"));
		 
		 // source
		 source.sendKeys("Pune");
		 Thread.sleep(2000);
		 List<WebElement> li=driver.findElements(By.xpath("//li[@data-no=\"3\"]"));
		 System.out.println(li.size());
		 for (WebElement location : li)
		 {
		System.out.println(location.getText());	
		}
		 driver.findElement(By.xpath("//li[@select-id=\"results[2]\"]")).click();
		 
		 Thread.sleep(2000);
		 //destination
		 WebElement destination = driver.findElement(By.id("dest"));
		 destination.sendKeys("Bangalore");
		 List<WebElement>l2=driver.findElements(By.xpath("//li[@data-id=\"90329\"]"));
		 System.out.println("Bangalore locations::"+l2.size());
		 for (WebElement bangalor : l2)
		 {
			System.out.println(bangalor.getText());
		}
		 driver.findElement(By.xpath("//li[@select-id=\"results[5]\"]")).click();
				driver.close();
	}

}
