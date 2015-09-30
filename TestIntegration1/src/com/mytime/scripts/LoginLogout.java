package com.mytime.scripts;

import org.testng.annotations.Test;

import com.mytime.pom.BasePage;
import com.mytime.pom.LoginPage;

public class LoginLogout extends SuperTestNG
{
	@Test
	public void testLoginLogout()
	{
		
		LoginPage lPage=new LoginPage(driver);
		lPage.login("admin","manager");
		
		BasePage bPage=new BasePage(driver);
		bPage.logout();
		
	}
}
