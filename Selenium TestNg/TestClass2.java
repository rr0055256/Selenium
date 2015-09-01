package com.qpiders;

import java.sql.Driver;

import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass2 {
	
	@Test
	public void test1(){
//		Reporter.log("Hi",true);
//	}
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///home/raman/Desktop/Android%20Jawa%20project/jawa/index.html");
	
	SoftAssert sa = new SoftAssert();
	String atitle = "java";
	String etitle = driver.getTitle();
	
	//SoftAssert sa = new SoftAssert();
	Assert.assertEquals(atitle, etitle);
	
	sa.assertAll();
//	if(atitle.equals(etitle))
//	{
//		Reporter.log("The test passed",true);
//		driver.close();
//	}
//	{
//		Reporter.log("The test has failed",true);
//		sa.fail();
//		sa.assertAll();
//		driver.close();
//	
//	}
	driver.close();
	

	}
}
