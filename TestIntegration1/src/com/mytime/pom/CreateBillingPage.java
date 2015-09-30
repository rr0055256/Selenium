package com.mytime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateBillingPage extends BasePage
{
	@FindBy(id="name")
	private WebElement txbName;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnCreateBillingType;
	
	public CreateBillingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void createNewBilling(String name)
	{
		txbName.sendKeys(name);
		btnCreateBillingType.click();
	}
}
