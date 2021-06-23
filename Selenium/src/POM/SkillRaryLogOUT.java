package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLogOUT
{

	@FindBy(xpath="//span[text()='SkillRary Admin']")
	private WebElement skillRarybtn;
	
	
	public void SkillRary()
	{
		skillRarybtn.click();
	}
	
	
	@FindBy(id="admin_profile")
	private WebElement updatebtn;
	
	public void update()
	{
	updatebtn.click();	
	}
	@FindBy(xpath="//button[@class='btn btn-default btn-flat pull-left']")
	private WebElement closebtn;
	
	public void close() 
	{
	closebtn.click();	
	}
	
	public SkillRaryLogOUT(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
