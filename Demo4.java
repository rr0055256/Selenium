package com.qpiders;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	
	public static void main(String[] args) {
		
		Dimension d = new Dimension(300, 400);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().setSize(d);
		
		Point p = new Point(200, 300);
		driver.manage().window().setPosition(p );
		
		driver.manage().window().maximize();
	}

}
