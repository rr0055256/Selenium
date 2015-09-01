package com.qpiders;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SortElements {
	
	public static void main(String[] args) {
		
	
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
	//find the year select element
			WebElement listYear =  driver.findElement(By.id("year"));
			
			Select select = new Select(listYear);
			
			select.selectByVisibleText("1987");
			
			List<WebElement> allOptions = select.getOptions();
			//before sort
			ArrayList<String> arrBeforeSort = new ArrayList<String>(); 
			for(int i=0; i<allOptions.size();i++)
			{	
				String text = allOptions.get(i).getText();
				arrBeforeSort.add(text);
			}
			
			ArrayList<String> arrAfterSort = new ArrayList<String>(); 
			for(int i=0; i<allOptions.size();i++)
			{	
				String text = allOptions.get(i).getText();
				arrAfterSort.add(text);
			}
			
			//after sort
			Boolean x= true;
			Collections.sort(arrAfterSort);
			
			Collections.sort(arrBeforeSort);
			for(String aSort:arrAfterSort)
			{
				for(String bSort:arrBeforeSort)
				{
					if(!aSort.equals(bSort))
					{
						x=false;
					}
				}
			}
			if(x==true)
			{
				System.out.println("sorted");
			}
			else{
				System.out.println("Not sorted");
			}
	}
}