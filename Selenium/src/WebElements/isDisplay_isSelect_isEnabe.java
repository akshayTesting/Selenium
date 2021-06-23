package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplay_isSelect_isEnabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement ele = driver.findElement(By.id("username"));

		if(ele.isDisplayed())
		{     
			System.out.println("Pass:element is dispalyed");
			ele.sendKeys("aadmin");
		}
		else
		{
			System.out.println("Fail:element is not dispalyed");
		}
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login ']"));
	if(loginBtn.isEnabled()) {
		System.out.println("Pass:element is enabled");
	}
	else
	{
		System.out.println("Fail:element is not enaabled");
	}
	
	WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	if(checkbox.isSelected()) {
		System.out.println("Pass:element is selected");
	}
	else
	{
		System.out.println("Fail:element is not selected");
	}
	driver.close();
	}

}
