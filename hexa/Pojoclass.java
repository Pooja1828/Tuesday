package com.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends Adactin {
	public Pojoclass() {
		WebDriver driver = null;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="//input[@type='text']")	
private WebElement txtUsername;
@FindBy(id="//input[@type='password']")	
private WebElement txtPass;
@FindBy(id="login")	
private WebElement btnClick;
@FindBy(id="location")	
private WebElement hotelLoc;
@FindBy(id="hotels")	
private WebElement selHotel;
@FindBy(id="room_type")	
private WebElement roomType;
@FindBy(id="room_nos")	
private WebElement roomNos;
@FindBy(id="datepick_in")	
private WebElement checkDate;
@FindBy(id="datepick_out")	
private WebElement checkOut;
@FindBy(id="adult_room")	
private WebElement adultRoom;
@FindBy(id="child_room")	
private WebElement childRoom;
public WebElement getTxtUsername() {
	return txtUsername;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getBtnClick() {
	return btnClick;
}
public WebElement getHotelLoc() {
	return hotelLoc;
}
public WebElement getSelHotel() {
	return selHotel;
}
public WebElement getRoomType() {
	return roomType;
}
public WebElement getRoomNos() {
	return roomNos;
}
public WebElement getCheckDate() {
	return checkDate;
}
public WebElement getCheckOut() {
	return checkOut;
}
public WebElement getAdultRoom() {
	return adultRoom;
}
public WebElement getChildRoom() {
	return childRoom;
}

}
