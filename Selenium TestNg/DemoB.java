package com.qpiders;

import org.junit.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoB {
	
	@BeforeClass
	public void test(){
		Reporter.log("this is before class",true);
	}
	
	@org.testng.annotations.AfterClass
	public void test2(){
		Reporter.log("This is after class",true);
	}
	
	@AfterMethod
	public void test3(){
		Reporter.log("This is after method",false);
	}
	
	@BeforeMethod
	public void test4(){
		Reporter.log("This is before method",true);
	}
	
	@Test(priority=-1)
	public void test5(){
		Reporter.log("This is test method with priority -1",true);
	}
	
	@Test(priority=9)
	public void test6(){
		Reporter.log("This is after method with priority 9",true);
	}
}