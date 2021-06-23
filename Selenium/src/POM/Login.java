package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	@FindBy(id="email")
	private WebElement usenamebtn;

	@FindBy(name="password")
	private WebElement passwordbtn;
	
	@FindBy(id="last")
	private WebElement loginbtn;
	
	public Login(WebDriver driver)  // constructor
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String name)
	{
	usenamebtn.sendKeys(name);	
	}
	public void password(String pwd)
	{
		passwordbtn.sendKeys(pwd);
	}
	public void login()
	{
	loginbtn.click();	
	}
}
