package GenericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class XLSheet 
{


	@DataProvider
	public static String[][] read(String path, String sheet) throws Exception {
		String[][] st;
		FileInputStream fis = new FileInputStream(path);// path
		Workbook wb = WorkbookFactory.create(fis);// loading
		Sheet sh = wb.getSheet("Sheet1");// loading sheet
		st = new String[sh.getPhysicalNumberOfRows() - 1][sh.getRow(0).getLastCellNum()];
		for (int i = 1; i < sh.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
			org.apache.poi.ss.usermodel.Cell	cl = sh.getRow(i).getCell(j);
				st[i - 1][j] = cl.toString();
			}

		}
		return st;
	}

	public static String readCell(String path, String sheetName, int r, int c) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		org.apache.poi.ss.usermodel.Cell cl =  sh.getRow(r).getCell(c);
		return cl.toString();
	}

	public static String readConfig(String path, String key) throws Exception {
		FileInputStream fis = new FileInputStream(path);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);


}
}


