package com.mytime.scripts;

import org.testng.annotations.Test;
import com.mytime.pom.BasePage;
import com.mytime.pom.BillingTypesPage;
import com.mytime.pom.CreateBillingPage;
import com.mytime.pom.LoginPage;

public class CreateBilling extends SuperTestNG
{
	@Test
	public void testCreateBilling()
	{
		LoginPage lPage=new LoginPage(driver);
		lPage.login("admin", "manager");
		
		BasePage bPage=new BasePage(driver);
		bPage.gotoBillingTypesPage();
		
		BillingTypesPage btPage=new BillingTypesPage(driver);
		btPage.clickCreateBillingType();
		
		CreateBillingPage cbPage=new CreateBillingPage(driver);
		cbPage.createNewBilling("Testing");
		
		btPage.verifySuccessMsg();
		
		btPage.logout();
		
	}
}










