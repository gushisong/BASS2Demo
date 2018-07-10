package com.oracle.peoplesoft.bass2.qe.utility;

import java.io.File;
import java.util.Properties;

public class Constants {
	
	private static final String configFile=System.getProperty("user.dir")+File.separator+"config"+File.separator+"config.properties";
	
	private static PropertiesUtils prop=new PropertiesUtils(configFile);
//	
//	public static final String BrowserName=prop.getValueByKey("BrowserName");
//	
	public static final int ElementWaitTimeSecond=new Integer(prop.getValueByKey("ElementWaitTimeSecond"));
//	
////	public static final String BrowserPath=prop.getProperty("BrowserPath");
//	
//	public static final String URL=prop.getValueByKey("URL");
	
	
	public static final String BASS2_URL="http://scliawd.us.oracle.com:8200/psp/EMHD8SPQ/?cmd=login";
	
	public static final String BugAU_URL="https://bugau.oraclecorp.com/index.html";
	
	public static final String URL="http://toolsqa.wpengine.com/automation-practice-form";
	
	public static final String BaseBug="27988933";
	
	public static final String BugAu_UserName="xiaolei.song@oracle.com";
	
	public static final String BugAu_Password="IRL-local-1234";
	
	public static final String UserName="PSQA";
	
	public static final String Password="QA";
	
	public static final String BrowserName="Chrome";
	
	public static final int WaitForTimeOut=20;  
	
	
	
	
	
	
	
	
	

	
	
	
	


}
