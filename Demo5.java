package com.qpiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(20000);
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("logoutLink")).click();
	}

}
