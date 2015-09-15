package com.seleniumhq;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowAlert {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.seleniumhq.org/download/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("2.47")).click();
		
		Robot r = new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
			

	}

}
