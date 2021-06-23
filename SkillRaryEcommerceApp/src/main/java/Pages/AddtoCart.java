package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart 
{

	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addtocart;
	
	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartBtn() {
		addtocart.click();
	
	}
}
