package com.qpiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTime {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//open actitime
		driver.get("http://demo.actitime.com");
		
		//login to actitime
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//click on tasks
		driver.findElement(By.xpath("//a[@class = 'content tasks']")).click();
		
		//retrive the deadline date and store in a string variable
		String dd = driver.findElement(By.xpath("//a[contains(text(),'Page design')]/../../../../../../td[4]")).getText();
		System.out.println(dd);
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}

}
