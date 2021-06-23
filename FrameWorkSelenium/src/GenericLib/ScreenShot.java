package GenericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScreenShot 
{


	public static void takePic(WebDriver driver, String path) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File SaveSS = new File(path);
		Files.copy(ss, SaveSS);
}
}
