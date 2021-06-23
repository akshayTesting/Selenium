package TestNG_01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1
{

	@Test(priority = -1,invocationCount = 3)
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test(priority = 1,enabled=false)
	public void block() {
		Reporter.log("block",true);
	}
	
	@Test(priority = -1)
	public void chats() {
		Reporter.log("chats",true);
	}
}
