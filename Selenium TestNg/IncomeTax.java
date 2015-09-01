package com.qpiders;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.win32.NTSecApi.LSA_FOREST_TRUST_RECORD.ByReference;


public class IncomeTax {
	
	@Test
	public void test(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://incometaxindiaefiling.gov.in/e-Filing/UserLogin");
		
		driver.findElement(By.xpath("//input[@id='Login_userName']")).sendKeys("BIJPR4275G");
		
		driver.findElement(By.xpath("//input[@id='Login_password']")).sendKeys("SR@00335372");
		
		driver.findElement(By.xpath("//input[@id='dateField']")).sendKeys("14/02/1991");
		
		
		
	}
}
