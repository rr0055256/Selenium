package com.qpiders;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ErrorMessage {
//	private WebElement loginButton;
	private WebElement errMsg;
	
	public ErrorMessage(WebDriver driver)
	{
//		err = driver.findElement(By.id("loginButton"));
		errMsg = driver.findElement(By.xpath("//span[contains(text(),'expired')]"));
	}
	

	public void getErrorMessage(){
//		errMsg = driver.findElement(By.xpath("//span[contains(text(),'expired')]"));
		System.out.println(errMsg.getText());
	}

}
