package com.oracle.peoplesoft.bass2.qe.appModules.bugau;

import org.openqa.selenium.WebDriver;

import com.oracle.peoplesoft.bass2.qe.pageObjects.BaseClass;
import com.oracle.peoplesoft.bass2.qe.pageObjects.bugau.Login_Page;
import com.oracle.peoplesoft.bass2.qe.utility.Constants;
import com.oracle.peoplesoft.bass2.qe.utility.Log;

public class BugAU_SignIn_Action extends BaseClass {
	
	public BugAU_SignIn_Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void Execute() throws Exception {
		
		//Check UserName,Password and Login button are avaliable
		waitForElement(Login_Page.txt_UserName());
		waitForElement(Login_Page.txt_Password());
		waitForElement(Login_Page.btn_Login());
		
		//Input UserName
		
		String sUserName=Constants.BugAu_UserName;
		Login_Page.txt_UserName().clear();
		Login_Page.txt_UserName().sendKeys(sUserName);
		Log.info(sUserName+" is entered in UserName text box");
		
		//Input Password
		
		String sPassword=Constants.BugAu_Password;
		Login_Page.txt_Password().clear();
		Login_Page.txt_Password().sendKeys(sPassword);
		Log.info(sPassword +"is entered in Password text box");
		
		//
		Login_Page.btn_Login().click();
		
	}

}
