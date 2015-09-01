package com.qpiders;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectFacebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	
		//find the year select element
		WebElement listYear =  driver.findElement(By.id("year"));
		
		Select select = new Select(listYear);
		
		select.selectByVisibleText("1987");
		
		List<WebElement> allOptions = select.getOptions();
		
//		ArrayList<E>
		
	}

}
