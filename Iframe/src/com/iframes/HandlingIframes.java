package com.iframes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingIframes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//default time setup for find element methods
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//to open the demo page
		driver.get("file:///home/raman/Desktop/Selenium/demo.html");
		
		driver.findElement(By.id("t1")).sendKeys("abc");
		//switch to the iframe
		driver.switchTo().frame(0);
		
		//enter value in the box allowed
		driver.findElement(By.id("t2")).sendKeys("xyz");
		
		//go back to default content
//		driver.switchTo().defaultContent();
		
		//go to the parent browser
		driver.switchTo().parentFrame();
		
		//enter an additional value in the t1 box
		driver.findElement(By.id("t1")).sendKeys("12345");
		
		//close the browser
		driver.close();
	}

}
