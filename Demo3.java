package com.qpiders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cricbuzz.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
