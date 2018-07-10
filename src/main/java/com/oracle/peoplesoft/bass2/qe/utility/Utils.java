package com.oracle.peoplesoft.bass2.qe.utility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
	
	private static WebDriver driver=null;
	
	public static WebDriver openBrowser(String sUrl) {
		
		String sBrowser=Constants.BrowserName;
		if(sBrowser.equals("Chrome")) {
			try {
				String chromePath = System.getProperty("user.dir") + File.separator + "drivers" + File.separator
						+ "chromedriver.exe";
				File chromeDriver = new File(chromePath);
				if (chromeDriver.exists()) {
//					Log.info("webdriver is found");
					System.setProperty("webdriver.chrome.driver", chromePath);
					driver = new ChromeDriver();
					System.out.println(driver);
					Thread.sleep(1000);
					driver.get(sUrl);
					System.out.println(driver.getCurrentUrl());
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//					Log.info("Web application lunched successfully");
				} else {
					System.out.println("Chrome driver doesn't exist");
//					Log.error("Chrome driver doesn't exist");
					System.exit(0);

				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return driver;
		
		
		
	}

}
