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


public class Hotels {
	public static void main(String[] args) throws InterruptedException, AWTException {
		Adactin a= new Adactin();
		
		WebDriver driver =a.launchBrowser();
		a.launchUrl(driver, "https://adactinhotelapp.com/");
		Pojoclass pc = new Pojoclass();
		
		
		Thread.sleep(2000);
		
		a.type(pc.getTxtUsername(), "Roseslov");            
		
		a.type(pc.getTxtPass(), "Pooja@123");
	   
		a.btnClick(pc.getBtnClick());
	
	
		WebElement e =null;
		Actions acc =a.moveOver(e);
		
		WebElement hotelLoc = pc.getBtnClick();pc.getHotelLoc();
		a.btnClick(hotelLoc);
		acc.moveToElement(hotelLoc).perform();
		Robot r =a.robot();
		Select s =a.selectbyIndex(hotelLoc, 2);
	
WebElement selHotel = pc.getSelHotel();
	a.btnClick(selHotel);
	acc.moveToElement(selHotel).perform();
	a.robot();
	a.selectbyIndex(selHotel, 2);
	
	WebElement roomType = pc.getRoomType();
	a.btnClick(roomType);
	acc.moveToElement(roomType).perform();
	a.robot();
	a.selectbyIndex(roomType, 3);
	
	
	WebElement roomNos = pc.getRoomNos();
	a.btnClick(roomNos);
	acc.moveToElement(roomNos).perform();
	a.robot();
	a.selectbyIndex(roomNos, 3);
	
	
	WebElement checkDate = pc.getCheckDate();
	a.btnClick(checkDate);
	acc.moveToElement(checkDate).perform();
	a.robot();
	a.selectbyIndex(checkDate, 2);
	
	
	WebElement checkOut = pc.getCheckOut();
	a.btnClick(checkOut);
	acc.moveToElement(checkOut).perform();
	a.robot();
	a.selectbyIndex(checkOut, 2);
	
	WebElement adultRoom = pc.getAdultRoom();
	a.btnClick(adultRoom);
	acc.moveToElement(adultRoom).perform();
	a.robot();
	a.selectbyIndex(adultRoom, 2);
	
	WebElement childRoom = pc.getChildRoom();
	a.btnClick(childRoom);
	acc.moveToElement(childRoom).perform();
	a.robot();
	a.selectbyIndex(childRoom, 2);
	
	
		
		
	}

}
