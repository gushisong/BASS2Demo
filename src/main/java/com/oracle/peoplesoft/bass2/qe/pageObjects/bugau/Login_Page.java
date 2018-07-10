package com.oracle.peoplesoft.bass2.qe.pageObjects.bugau;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.oracle.peoplesoft.bass2.qe.pageObjects.BaseClass;

public class Login_Page extends BaseClass {
	
	private static WebElement element;

	public Login_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public static WebElement txt_UserName() {
		
		element =null;
		
		try {
			element=findElement("id=>sso_username", "UserName input filed is found on Login Page", "UserName input filed is not found on Login Page");
		} catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}
	
	public static WebElement txt_Password() {
		element=null;
		
		try {
			element=findElement("id=>ssopassword", "Password input field is found on Login Page", "Password input field is not found on Login Page");
		} catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		
		return element;
	}
	
	public static WebElement btn_Login() {
		element =null;
		try {
			element=findElement("class_name=>submit_btn", "Login button is found on Login Page", "Login button is not found on Login Page");
			
		} catch (Exception e) {
			// TODO: handle exception
			throw(e);
		}
		return element;
	}

}
