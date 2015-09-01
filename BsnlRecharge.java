package com.qpiders;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.AcceptAlert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BsnlRecharge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://portal.bsnl.in/rc/aspxfiles/login.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("rr0055256");
		driver.findElement(By.id("txtPassword")).sendKeys("Yezdi@664");
		driver.findElement(By.id("btnSubmit")).click();
		
		driver.findElement(By.id("rblService_0")).click();
		driver.findElement(By.id("txtMobileNo")).sendKeys("9945767399");
		driver.findElement(By.id("txtMobileNoConf")).sendKeys("9945767399");
	
		//Click on "Select type of voucher"
//		driver.findElement(By.id("rdlBillType_0")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rdlBillType_0")));
		//Enter top up amount
		driver.findElement(By.id("rdlBillType_0")).click();
		//tags
		driver.findElement(By.id("tags")).sendKeys("50");
		driver.findElement(By.className("tableheading")).click();
		//btnSubmit
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSubmit")));
		
		driver.findElement(By.id("btnSubmit")).click();
	
		//BD-0 - To click on credit card payment
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label")));
		//driver.findElement(By.id("BD-0")).click();
//		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[8]/td/span/table/tbody/tr[2]/td/section/div[1]/label")).click();
		//The click on the payment section is not working on the BSNL website
		driver.findElement(By.xpath("//label")).click();
		
		//Click ok on the pop up
		Alert al = driver.switchTo().alert();
		al.accept();
				
		//Bill desk payment
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cnumber")));
		driver.findElement(By.id("cnumber")).sendKeys("4893771602814525");
		driver.findElement(By.id("expmon")).sendKeys("04");
		driver.findElement(By.id("expyr")).sendKeys("2018");
		
		driver.findElement(By.id("cvv2")).sendKeys("615");
		driver.findElement(By.id("cname2")).sendKeys("RAMAN");
		driver.findElement(By.id("proceedForm")).click(); 
		
		//The next page of transaction
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("sbmtBtn")));
		driver.findElement(By.name("sbmtBtn")).click();
		
		//Last page details
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPassword")));
		driver.findElement(By.id("txtPassword")).sendKeys("Yezdi@664");
		driver.findElement(By.id("cmdSubmit")).click();
		
		al.accept();
	}
}