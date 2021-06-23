package POMS;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage 
{

	@FindBy(name="q")
	private WebElement searbarbtn;
	
 public GoogleHomePage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public void find(String name)
 {
	 searbarbtn.sendKeys("java",Keys.ENTER);
	 
 }
 
 
 

}
