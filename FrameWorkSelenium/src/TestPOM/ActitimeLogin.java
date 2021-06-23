package TestPOM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericLib.BaseTest;

import GenericLib.XLSheet;
import POM.ActiTimeLogin;

public class ActitimeLogin extends BaseTest
{
	

	@Test
	public void validLogin() throws Exception {
		SheetName = XLSheet.readConfig(proFile, "XLsheet");// login
		fileName = XLSheet.readConfig(proFile, "XlFile");// framwork.xlsx
		String user = XLSheet.readCell(xl_path + fileName, SheetName, 1, 1);
		String pass = XLSheet.readCell(xl_path + fileName, SheetName, 2, 1);
		ActiTimeLogin al=new ActiTimeLogin(driver);
		al.Sendname(user);
		al.sendpass(pass);
		al.login();

 
		/*
		 * EnterTimeTracker ett = new EnterTimeTracker(driver);
		 * ett.isHomePageDisplyed(driver)
		 */
}
}