package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// WebElement ele=driver.findElement(By.id("username"));

		Test1 t = new Test1(driver);

		driver.navigate().refresh();

		t.username("admin");
		t.password("manager");
		t.loginbutton();
		
		Thread.sleep(7000);
		Home h=new Home(driver);
		h.logoutbtn();

	}

}
