package TestNG_01;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test00
{
	@Test
	public void demo() {
		Reporter.log("hello",true);
	}
}
