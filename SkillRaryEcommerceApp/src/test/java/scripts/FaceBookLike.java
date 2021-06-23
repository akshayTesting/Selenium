package scripts;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import Pages.FaceBook;
import Pages.SkillRaryLogin;

public class FaceBookLike extends BaseClass
{

	
	
	@Test
	public void facebooklikebtn() throws InterruptedException {
		SkillRaryLogin s=new SkillRaryLogin(driver);
		u.scrollBar(driver,0,5000);
		Thread.sleep(3000);
		s.faceBookicon();
		
		FaceBook f=new FaceBook(driver);
		f.likebtn();
	}
	
}
