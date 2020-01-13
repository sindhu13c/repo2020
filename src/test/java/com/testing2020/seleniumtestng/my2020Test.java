package com.testing2020.seleniumtestng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class my2020Test 
{
	@Test
	public void Login_SFDC_02() throws InterruptedException
	{
		String driverPath="/Users/sindhu/Documents/testingjarfiles/geckodriver";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver=new FirefoxDriver();
		
		//launch url
		driver.get("https://login.salesforce.com/");
		
		driver.close();
	}
}