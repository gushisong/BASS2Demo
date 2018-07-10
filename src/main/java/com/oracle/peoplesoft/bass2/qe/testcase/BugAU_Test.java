/**
 * 
 */
package com.oracle.peoplesoft.bass2.qe.testcase;

import static org.junit.Assert.*;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.oracle.peoplesoft.bass2.qe.appModules.bugau.BugAU_SignIn_Action;
import com.oracle.peoplesoft.bass2.qe.pageObjects.BaseClass;
import com.oracle.peoplesoft.bass2.qe.pageObjects.bugau.Home_Page;
import com.oracle.peoplesoft.bass2.qe.utility.Constants;
import com.oracle.peoplesoft.bass2.qe.utility.Utils;

/**
 * @author xiaolson
 *
 */
public class BugAU_Test {
	
	private static WebDriver driver;
	
	public static void main(String[] args) throws Exception {

		DOMConfigurator.configure("log4j.xml");
		driver =Utils.openBrowser(Constants.BugAU_URL);
		new BaseClass(driver);
		Home_Page.lnk_CreateRequest().click();
		BugAU_SignIn_Action.Execute();
		
	}



}
