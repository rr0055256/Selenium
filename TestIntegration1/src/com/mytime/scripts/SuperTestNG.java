package com.mytime.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuperTestNG
{
	public WebDriver driver;
	@BeforeClass
	public void preCondtion()
	{
		driver=new FirefoxDriver();
		driver.get("http://localhost");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterClass
	public void postCondtion()
	{
		driver.close();
	}
}
