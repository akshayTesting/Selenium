package GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfiledata implements Autoconstant
{

	public String getData(String keys) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream(datapropertyfile));
	   return p.getProperty(keys);
}
}