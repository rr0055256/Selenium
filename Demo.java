package com.qpiders;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String[] args) {
		FirefoxDriver f = new FirefoxDriver();
		f.get("file:///home/raman/Desktop/Android%20Development/About%20-%20Git_files/About-Git.html");
		f.quit();
			}
	}

