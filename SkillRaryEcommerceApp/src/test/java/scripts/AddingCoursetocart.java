package scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import Pages.AddtoCart;
import Pages.DemoSkillrray;
import Pages.SkillRaryLogin;

public class AddingCoursetocart extends BaseClass
{

	@Test
	public void addingTocart() {
		SkillRaryLogin s=new SkillRaryLogin(driver);
		s.gerasButton();
		s.demoskillraryApp();
		
		u.switchingTabs(driver);
		
		DemoSkillrray d=new DemoSkillrray(driver);
		u.mouseHover(driver,d.getCoursebtn());
		d.seleniumTrainingbtn();
		
		AddtoCart a=new AddtoCart(driver);
		a.addtocartBtn();
		u.alertPopup(driver);
		
	}
	
}
