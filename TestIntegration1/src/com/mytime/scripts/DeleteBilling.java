package com.mytime.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mytime.pom.BasePage;
import com.mytime.pom.LoginPage;

public class DeleteBilling extends SuperTestNG
{
	@Test
	public void testDeleteBilling()
	{
		LoginPage lPage=new LoginPage(driver);
		lPage.login("admin", "manager");
		
		BasePage bPage=new BasePage(driver);
		bPage.gotoBillingTypesPage();
		
		String xp="//a[text()='Testing']/../..//a[contains(text(),'delete')]";
		driver.findElement(By.xpath(xp)).click();
		
		driver.switchTo().alert().accept();
		
		bPage.logout();

	}
}










