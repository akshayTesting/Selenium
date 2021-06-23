package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
	//	driver.close();
		
	}

}
