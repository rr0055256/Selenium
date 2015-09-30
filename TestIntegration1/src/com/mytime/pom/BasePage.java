package com.mytime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
	@FindBy(id="logoutLink")
	private WebElement lnkLogout;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[1]")
	private WebElement mnSettings;
	
	@FindBy(linkText="Billing Types")
	private WebElement smBillingTypes;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logout()
	{
		lnkLogout.click();
	}
	
	public void gotoBillingTypesPage()
	{
		mnSettings.click();
		smBillingTypes.click();
	
	}
}
