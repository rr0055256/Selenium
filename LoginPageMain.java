package com.qpiders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageMain {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage lp = new LoginPage();
		
		PageFactory.initElements(driver, lp);
		
		lp.clickLoginButton();
		
		//span[contains(text(),'expired')]
		//span[starts-with[text(),'The session']
		lp.getErrorMessage();
		
//		WebDriverWait wait= new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'expired')]")));
//		ErrorMessage errMsg = new ErrorMessage(driver);
//		errMsg.getErrorMessage();
	}

}
