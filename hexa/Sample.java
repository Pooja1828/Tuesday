package com.hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args)  {
		
	Base b = new Base();
	 WebDriver driver = b.launchBrowser();
	b.launchUrl("https://www.facebook.com/");
	
		System.out.println(b.getPageUrl());
		System.out.println(b.getPageTitle());
		

		WebElement txtUsername = driver.findElement(By.id("email"));
		b.typa(txtUsername, "Greens");
		WebElement txtPass = driver.findElement(By.id("pass"));
		b.typa(txtPass, "123456");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		b.btnClick(btnLogin);
		b.quitBrowser();
		
		
		
	}
	
	
	
	}

