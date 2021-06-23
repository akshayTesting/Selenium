package ScreenShoot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShoot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		TakesScreenshot t1=(TakesScreenshot)driver;
		//call the method photo is taken and stored in RAM
			File src=t1.getScreenshotAs(OutputType.FILE);
			//Specify the location 
			File des=new File("./photo/myntra.png");
			//copy the photo from src to dest location 
			FileUtils.copyFile(src, des);
		driver.close();
	}

}
