package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actime_Login
{
	@FindBy(id="username")
	private WebElement usernamebtn;
	
	public void username(String name)
	{
	usernamebtn.sendKeys(name);	
	}
	
	@FindBy(name="pwd")
	private WebElement passwordbtn;	
	public void pass(String pass)
	{
	passwordbtn.sendKeys("manager");	
	}
	@FindBy(name="remember")
	private WebElement checkBoxbtn;
	
	public void checkBox()		// check Box method
	{
	checkBoxbtn.click();	
	}
	
	@FindBy(xpath="//div[text()='Login ']") //login button xpath
	private WebElement loginbtn;
	
	public void logins()   // login method
	{
	loginbtn.click();	
	}
	
	
	
	
	public Actime_Login(WebDriver driver)   // Constructor
	{
		PageFactory.initElements(driver, this);
		
	}
}
