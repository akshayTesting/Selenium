package ScreenShoot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class fileclass {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//typecasting
		TakesScreenshot t=(TakesScreenshot)driver;
		//call the method photo is taken and stored in RAM
		File src = t.getScreenshotAs(OutputType.FILE);
		//Specify the location 
		File dest=new File("./photo/amazon.png");
		//copy the photo from src to dest location 
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
