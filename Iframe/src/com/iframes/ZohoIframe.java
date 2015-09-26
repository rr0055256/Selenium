package com.iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZohoIframe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//open firefox browser
		WebDriver driver = new FirefoxDriver();
		
		//set implicit timeouts
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open url
		driver.get("http://www.zoho.com/crm/lp/login.html");
		
		//switch to the loogin block
		driver.switchTo().frame("zohoiam");
		
		//send the values
		driver.findElement(By.id("lid")).sendKeys("raph_rahul@yahoo.co.in");
		
		//close the browser
		driver.close();
	}

}
