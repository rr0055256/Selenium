package com.mytime.scripts;

import org.testng.annotations.Test;
import com.mytime.pom.LoginPage;

public class InvalidLogin extends SuperTestNG
{
	
	@Test
	public void testInvalidLogin()
	{
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("abc","xyz");
		loginPage.verifyErrorMsg();
	}
}




