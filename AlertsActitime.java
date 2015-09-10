package alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsActitime {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.actitime.com");
		
		//wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		driver.findElement(arg0)
		
		//login
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//click on tasks
		driver.findElement(By.xpath("//a[@class = 'content tasks']")).click();
		
		//click on delete tasks
		driver.findElement(By.xpath("//td[1]/input[@class='hierarchy_element_wide_button']")).click();
		
		//handle alert pop up
		try{
		Alert alert = driver.switchTo().alert();
		//print text
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("Alert is displayed");
		}catch(NoAlertPresentException e){
			System.out.println("Alert is not displayed");
		}
		
		//select two elements
		String xp1 = "//td[2][contains(text(),'Updating the')]/../..//input[@name='taskSelected[65]']";
		
		driver.findElement(By.xpath(xp1)).click();
		
		String xp2 = "//td[3][@id='taskNameCell15']/../../..//input[@name='taskSelected[15]']";
		
		driver.findElement(By.xpath(xp2)).click();
		
		//click on delete tasks
		driver.findElement(By.xpath("//td[1]/input[@class='hierarchy_element_wide_button']")).click();
		
		
		WebElement hdpopup = driver.findElement(By.xpath("//input[@class='confirmDialogApplyButton']"));
		
		if(hdpopup.isDisplayed()){
			System.out.println("The hidden division is displayed");
			hdpopup.click();
		}
		else{
			System.out.println("The hidden division pop up is not displayed");
		}
		
		//click on logout
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		
	}
	
}
