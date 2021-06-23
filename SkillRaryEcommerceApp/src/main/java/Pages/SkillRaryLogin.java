package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLogin
{

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement serachtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement go;
	
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement fbicon;

	public SkillRaryLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gerasButton() {
		gerasBtn.click();
	}
	
	public void demoskillraryApp() {
		demoapp.click();
	}
	
	public void searchTb(String name) {
		serachtb.sendKeys(name);	
	}
	
	public void faceBookicon() {
		fbicon.click();
	}
	
	public void goButton() 
	{
		go.click();
	
	
	}
	
}
