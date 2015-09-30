package com.mytime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage
{
	@FindBy(id="username")
	private WebElement txbUserName;
	
	@FindBy(name="pwd")
	private WebElement txbPassword;
	
	@FindBy(id="loginButton")
	private WebElement btnLogin;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement msgError;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void login(String un,String pw)
	{
		txbUserName.sendKeys(un);
		txbPassword.sendKeys(pw);
		btnLogin.click();
	}
	
	public void verifyErrorMsg()
	{
		Assert.assertTrue(msgError.isDisplayed());
	}
  }
