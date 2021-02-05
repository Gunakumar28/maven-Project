package pom.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenDay1.BaseClass;

public class BookingPage extends BaseClass{
		public BookingPage() {
			PageFactory.initElements(driver, this);
		}
	@FindBy(id="location")
	private WebElement txtloction;
	
	@FindBy (id = "hotels")
	private WebElement txtHotel;	
	
	@FindBy (xpath = "//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy (xpath = "//select[@id='room_nos']")
	private WebElement noOfrooms;
	
	@FindBy (id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy (xpath = "//input[@id='datepick_out']")
	private WebElement checkOutDate;
	
	@FindBy (xpath = "//select[@id='adult_room']")
	private WebElement adultPerRoom;
	
	@FindBy (xpath = "//*[@id='child_room']")
	private WebElement childPerRoom;
	
	
	@FindBy (xpath = "//*[@id='Submit']")
	private WebElement btnSubmit;


	public WebElement getTxtloction() {
		return txtloction;
	}


	public WebElement getTxtHotel() {
		return txtHotel;
	}


	public WebElement getRoomType() {
		return roomType;
	}


	public WebElement getNoOfrooms() {
		return noOfrooms;
	}


	public WebElement getCheckInDate() {
		return checkInDate;
	}


	public WebElement getCheckOutDate() {
		return checkOutDate;
	}


	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}


	public WebElement getChildPerRoom() {
		return childPerRoom;
	}


	public WebElement getBtnSubmit() {
		return btnSubmit;
	}























}


