package com.oracle.peoplesoft.bass2.qe.utility;

import java.io.File;
import java.util.Properties;

public class Constants {
	
	private static final String configFile=System.getProperty("user.dir")+File.separator+"config"+File.separator+"config.properties";
	
	private static PropertiesUtils prop=new PropertiesUtils(configFile);
	
//	public static final String BrowserPath=prop.getProperty("BrowserPath");
	
	public static final String URL=prop.getValueByKey("URL");
	
	
	
	
	

	
	
	
	


}
