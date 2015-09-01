package com.qpiders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectItem {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = 	new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///home/raman/Desktop/Selenium/sample.html");
		
		
//		driver.findElement(By.id("mtr")).click();
		
		WebElement listBox = driver.findElement(By.id("mtr"));
//		driver.findElement(By.xpath("//option[text()='Idly']"));
		Select select = new Select(listBox);
		
		//selecting by value
		select.selectByValue("f2");
		
		Thread.sleep(1000);
		//select by the text
		select.selectByVisibleText("Idly");
		
		List<WebElement> allOptions = select.getOptions();
		
		ArrayList<String> arr = new ArrayList<String>();
//		System.out.println(allOptions.size());
		
		for(int i=0;i<allOptions.size();i++)
		{
			String x = allOptions.get(i).getText();
			arr.add(x);
		}
		
		Collections.sort(arr);
		
		for(String text:arr)
		{
			System.out.println(text);
		}
		
	}
	
}