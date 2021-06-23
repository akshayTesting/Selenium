package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import GenericLib.BaseClass;
import Pages.Selenium;
import Pages.SkillRaryLogin;
import Pages.Trainingpage;

public class TakeingCouse extends BaseClass
{

	
	@Test
	public void takecourses() throws FileNotFoundException, IOException, InterruptedException {
		SkillRaryLogin s=new SkillRaryLogin(driver);
		s.searchTb(p.getData("coursename"));
		s.goButton();
		
		Selenium s1=new Selenium(driver);
		s1.corejavaselenium();
		
		Trainingpage t=new Trainingpage(driver);
		u.frameSwitch(driver);
		t.playButton();
		Thread.sleep(15000);
		t.pauseButton();
		u.switchBack(driver);
		t.takecouse();
		
	}
}
