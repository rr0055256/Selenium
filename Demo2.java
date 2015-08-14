package com.qpiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import bsh.Remote;

public class Demo2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/raman/Downloads/chromedriver");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String Title = driver.getTitle();
		System.out.println(Title);
		
		//get the url
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(driver.getClass());
			
		//System.out.println(driver.findElements((By)driver));
	}
}
