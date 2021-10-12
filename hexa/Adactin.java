package com.hexa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	WebDriver driver;
	WebElement e;
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT-Lenovo\\Documents"
				+ "\\Maven1pm\\driver\\chromedriver.exe");
		return driver = new ChromeDriver();
		
	}
public void launchUrl(WebDriver driver, String url) {
	driver.get(url);
	driver.manage().window().maximize();
}
public void type(WebElement e,String value) {
e.sendKeys(value);
}
public void btnClick(WebElement e) {
e.click();
}
public Actions moveOver(WebElement e) {
	
Actions acc = new Actions(driver);
acc.moveToElement(e).perform();
return acc;

}
public Select selectbyIndex(WebElement e,int index) {
	Select s = new Select(e);
s.selectByIndex(index);
return s;
}
public Robot robot() throws AWTException {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	return r;


}

}




	



