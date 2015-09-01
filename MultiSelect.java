package com.qpiders;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.remote.server.handler.html5.Utils;
import org.openqa.selenium.support.ui.Select;
public class MultiSelect {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///home/raman/Desktop/Selenium/sample.html");
		
		WebElement listBox = driver.findElement(By.id("mtr"));
		
		Select select = new Select(listBox);
		
		select.getOptions().get(0).sendKeys(Keys.CONTROL);
		List<WebElement> allOptions = select.getOptions();
		
		ArrayList<WebElement> arr= new ArrayList<WebElement>();
		
			for(int i=0;i<allOptions.size();i++)
			{
				WebElement text= allOptions.get(i);
				arr.add(text);
			}
			
			//clicking on the elements
			for(WebElement e:arr)
			{
				e.click();
			}
		}
//		for(int i=0;i<allOptions.size();i++)
//		{
//			allOptions.get(0).sendKeys(Keys.CONTROL);
//		}
//		Utils
		/*
		for(int i=0;i<allOptions.size();i++){
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(select.getOptions().get(i)).keyUp(Keys.CONTROL);

		builder.build().perform();}*/
}

