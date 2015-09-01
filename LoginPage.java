package com.qpiders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	final String str = "loginButton";
	
	@FindBy(id=str)
	private WebElement loginButton;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMsg;
	
	/*public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
//		loginButton = driver.findElement(By.id("loginButton"));
//		errMsg = driver.findElement(By.xpath("//span[contains(text(),'expired')]"));
	}*/
	//span[contains(text(),'expired')]
			//span[starts-with[text(),'The session']
	public void clickLoginButton(){
		loginButton.click();
	}


	public void getErrorMessage(){
//		errMsg = driver.findElement(By.xpath("//span[contains(text(),'expired')]"));
		System.out.println(errMsg.getText());
	}


}
