package com.DemoWeb.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	public static Properties getProperties() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\DemoWebb\\src\\main\\resources\\Configuartion\\config.properties");
		prop.load(fis);
		return prop;
	}

}
 