package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut_ActiTime 
{

	public LogOut_ActiTime(WebDriver driver)   // constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "logoutLink")
	private WebElement logoutbtn;
	public void logout()
	{
		logoutbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
