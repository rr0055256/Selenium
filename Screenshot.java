package com.qpiders;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {
	public static void main(String[] args) {
		//open the browser
		WebDriver driver = new FirefoxDriver();
		//set implicit timeouts
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open the URL
		driver.get("http://www.softwaretestinghelp.com/selenium-interview-questions-answers/");
		
		driver.manage().window().maximize();
		
		try{
			//code to capture a screenshot
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//code to copy the screenshot to the desired location
			FileUtils.copyFile(scrFile, new File("/home/raman/Desktop/Screenshot.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		driver.close();
		
	}
}
