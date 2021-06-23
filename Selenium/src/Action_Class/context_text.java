package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class context_text {
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement ele = driver.findElement(By.name("q"));
	
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
	driver.close();
}
}
