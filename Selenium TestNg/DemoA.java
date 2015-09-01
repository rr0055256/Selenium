package com.qpiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoA {

	@Test
	public void demo(){
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebElement errMsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		
		boolean x = errMsg.isDisplayed();
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(x);
		sa.assertAll();
		
	}
}