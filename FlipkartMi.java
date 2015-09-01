package com.qpiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartMi {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Open the browser
		driver.get("http://www.flipkart.com/");
		
		driver.findElement(By.id("fk-top-search-box")).sendKeys("MI");
		driver.findElement(By.xpath("//input[@class =  'search-bar-submit fk-font-13 fk-font-bold']")).click();
		
		//Class - click on Add to Compare
		
		
		//print price home work
		String xp = "//a[@title = 'Mi 4i (White, 16 GB) ']/../../div[4]/div/div/span";
		String price = driver.findElement(By.xpath(xp)).getText();
		
		System.out.println(price);
	}

}
