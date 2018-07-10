package com.oracle.peoplesoft.bass2.qe.pageObjects.bugau;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.oracle.peoplesoft.bass2.qe.pageObjects.BaseClass;

public class Home_Page extends BaseClass{
	
	private static WebElement element;

	public Home_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static WebElement lnk_CreateRequest() {
		element=null;		
		
		try {
			
			element=findElement("link_text=>Create Request", "Create Request link is found on BugAU Home page", "Create Request link is not found on BugAU Home page");
		} catch (Exception e) {
			// TODO: handle exception
			throw(e);			
		}
		
		return element;
		
	}

}
