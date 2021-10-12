package com.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	WebDriver driver;
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT-Lenovo\\Documents\\Maven1pm\\driver\\chromedriver.exe");
		
		 return driver = new ChromeDriver();
	}
	public void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void typa(WebElement e,String value) {
		e.sendKeys(value);
		}
	public void btnClick(WebElement e) {
		
	e.click();
	}
	public void quitBrowser() {
		driver.quit();
		
	}
	public String getPageUrl() {
	String url = driver.getCurrentUrl();
	return url;

}
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;

	}
}
