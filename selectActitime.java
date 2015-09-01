package com.qpiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selectActitime {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com/");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.id("ext-gen7")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Moss')]")).click();
		
	}
}
//		<span class="userName">Moss, Bruno (frontender)</span>