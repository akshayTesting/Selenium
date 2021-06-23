package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trainingpage
{

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//a[text()=' TAKE THIS COURSE ']")
	private WebElement takethiscoursebtn;
	
	public Trainingpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void playButton() {
		playbtn.click();
	}
	
	public void pauseButton() {
		pausebtn.click();
	}
	
	public void takecouse() {
		takethiscoursebtn.click();
	
	
	}
}
