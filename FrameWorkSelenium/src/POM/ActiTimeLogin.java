package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLogin 
{
		@FindBy(id="username")
		private WebElement usernamebtn;
		
		public void Sendname(String name)
		{
			usernamebtn.sendKeys(name);
		}
		
		@FindBy(name="pwd")
		private WebElement passwordbtn;
		public void sendpass(String password)
		{
			passwordbtn.sendKeys(password);
		}
		
		
		@FindBy(id="keepLoggedInCheckBox")
		private WebElement checkboxbtn;
		public void checkbox()
		{
			checkboxbtn.click();
		}
		
		@FindBy(xpath = "//div[text()='Login ']")
		private WebElement loginbtn;
		public void login()
		{
		loginbtn.click();	
		}
	
		
		public ActiTimeLogin (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
}
