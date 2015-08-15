package com.qpiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		try{
			driver.get("http://demo.actitime.com/");
			System.out.println("The page loads in 5 secs");
		}catch(TimeoutException e)
		{
			System.out.println("The page does not load in 5secs");
		}

	}

}
