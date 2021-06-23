package POMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage
{

	public ActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="username")
	private WebElement usernamebtn;
	
	public void username(String name)
	{
	usernamebtn.sendKeys("admin");	
	}
	
	@FindBy(name="pwd")
	private WebElement passwordbtn;	
	
	public void pass(String pass)
	{
	passwordbtn.sendKeys("manager");	
	}
	
	@FindBy(xpath="//div[text()='Login ']") //login button xpath
	private WebElement loginbtn;
	
	public void logins()   // login method
	{
	loginbtn.click();	
	}
	
}
