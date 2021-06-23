package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firfox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}

}
