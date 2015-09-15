package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.makemytrip.com/");
		
		driver.findElement(By.cssSelector("a#start_date_sec")).click();
		
		String xp = "//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']";
		
		WebElement hdPop = driver.findElement(By.xpath(xp));
		
		if(hdPop.isDisplayed()){
			System.out.println("The pop up is displayed!!");
//			Thread.sleep(1000);
//			hdPop.click();
		}
		else{
			System.out.println("The pop up is not displayed");
		}
		
		driver.findElement(By.xpath("//button[text()='CLOSE']")).click();
		
		driver.close();
		
		
		
	}
}
