package com.qpiders;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.asprise.ocr.Ocr;



public class Irctc {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://portal.bsnl.in");
		driver.findElement(By.id("usernameId")).sendKeys("rr0055256");
		driver.findElement(By.name("j_password")).sendKeys("Yezdi@664");
		
		String imageUrl = driver.findElement(By.id("cimage")).getAttribute("src");
		System.out.println(imageUrl);
		
		URL url = new URL(imageUrl);
		System.out.println(url);
		
		Image image = ImageIO.read(url);
		String s = new Ocr().recognize((RenderedImage)image, imageUrl, imageUrl, driver);
		System.out.println(s);
	}
	
}
