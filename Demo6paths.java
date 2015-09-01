package com.qpiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6paths {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://irctc.com");
		//WebElement ph = driver.findElement(By.xpath("//label[text() = 'Mumbai']/../label[contains(text(),': 022')]"));
		WebElement ph = driver.findElement(By.xpath("//label[text() = 'Mumbai']/../label[starts-with(text(),': 022')]"));
		System.out.println(ph.getText());
	}

}
