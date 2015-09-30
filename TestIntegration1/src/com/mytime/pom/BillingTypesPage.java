package com.mytime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BillingTypesPage extends BasePage
{
	@FindBy(xpath="//span[text()='Create Billing Type']")
	private WebElement btnCreateBillingType;

	@FindBy(xpath="//span[contains(text(),'successfully')]")
	private WebElement msgSuccess;
	
	public BillingTypesPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickCreateBillingType()
	{
		btnCreateBillingType.click();
	}
	
	public void verifySuccessMsg()
	{
		Assert.assertTrue(msgSuccess.isDisplayed());
	}
}
