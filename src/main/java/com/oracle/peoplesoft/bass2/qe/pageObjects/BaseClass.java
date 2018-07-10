package com.oracle.peoplesoft.bass2.qe.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oracle.peoplesoft.bass2.qe.utility.Constants;
import com.oracle.peoplesoft.bass2.qe.utility.Log;

public class BaseClass {
	
	public static  WebDriver driver;
	public static boolean bResult;
	
	/**
	 * 
	 * @param driver
	 */
	
	public BaseClass(WebDriver driver) {
		this.driver=driver;
		this.bResult=true;
	}
	
	
	public static void waitForElement(WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver,Constants.ElementWaitTimeSecond);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static WebElement findElement(String selector,String info,String error) {
		
		//这个地方为什么是根据=>来切割字符串，请看页面里定位元素的方法 
        //submit_btn = "id=>su" 
        //login_lnk = "xpath => //*[@id='u1']/a[7]"  # 百度首页登录链接定位 
		
		WebElement element=null;
		
		if(selector.length()>0 && selector.indexOf("=>")>0) {
			//selector format like "xpath=>//*[@id="DERIVED_UOW_UOW_RELNAME"]"
			//System.out.println(selector);
			String[] arraySelector=selector.split("=>"); 
			//selector type
			String selector_by=arraySelector[0];
			//selector value
			String selector_value=arraySelector[1];
			
			if(selector_by.equalsIgnoreCase("id")) {
				try {

					element=driver.findElement(By.id(selector_value));
					Log.info(info);
				} catch (Exception e) {
					Log.error(error);
					throw(e);
					// TODO: handle exception
				}
			}else if (selector_by.equalsIgnoreCase("name")) {
				try {
					element=driver.findElement(By.name(selector_value));
					Log.info(info);
				} catch (Exception e) {
					Log.error(error);
					throw(e);
					// TODO: handle exception
				}
				
			}else if (selector_by.equalsIgnoreCase("class_name")) {
				try {
					element=driver.findElement(By.className(selector_value));
					Log.info(info);
				} catch (Exception e) {
					Log.error(error);
					throw(e);
					// TODO: handle exception
				}
				
			}else if (selector_by.equalsIgnoreCase("link_text")){
				try {
					element=driver.findElement(By.linkText(selector_value));
					Log.info(info);
				} catch (Exception e) {
					Log.error(error);
					throw(e);
					// TODO: handle exception
				}
				
			}else if (selector_by.equalsIgnoreCase("partial_link_text")) {
				try {
					element=driver.findElement(By.partialLinkText(selector_value));
					Log.info(info);
				} catch (Exception e) {
					Log.error(error);
					throw(e);
					// TODO: handle exception
				}
				
			}else if (selector_by.equalsIgnoreCase("tag_name")) {
				try {
					element=driver.findElement(By.tagName(selector_value));
					Log.info(info);
				} catch (Exception e) {
					Log.error(error);
					throw(e);
					// TODO: handle exception
				}
				
			}else if (selector_by.equalsIgnoreCase("xpath")){
				try {
					element=driver.findElement(By.xpath(selector_value));
					Log.info(info);
				} catch (Exception e) {
					Log.error(error);
					throw(e);
					// TODO: handle exception
				}
				
			}else {
				Log.info("Please enter a valid type of targeting elements.");
			}
			
		}else {
			Log.info("Please enter a valid type of targeting elements.");
			
		}
		return element;
		
		
	}
	
	
	
	

}
