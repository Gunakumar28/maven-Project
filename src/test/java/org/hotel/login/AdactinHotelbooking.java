package org.hotel.login;

import java.awt.AWTException;
import java.io.IOException;

import mavenDay1.BaseClass;
import pom.pageobjectmodel.BookingPage;
import pom.pageobjectmodel.SelectHotel;
import pom.pageobjectmodel.pomLocator;

public class AdactinHotelbooking extends BaseClass {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		   BaseClass baseClass = new BaseClass();
		   baseClass.getDriver();
		    baseClass.launchUrl("https://adactinhotelapp.com/index.php");
		    pomLocator locator = new pomLocator();
			BookingPage bookingPage = new BookingPage(); 
			baseClass.txtUserName(locator.getTxtUserName(),baseClass.readValueFromExcel("C:\\Users\\intel\\eclipse-workspace\\mavenDay1\\Excel Workbook\\AdactinWorkBook1.xlsx", "Sheet1", 0, 1));
			baseClass.txtPassword(locator.getTxtPassWord(),baseClass.readValueFromExcel("C:\\Users\\intel\\eclipse-workspace\\mavenDay1\\Excel Workbook\\AdactinWorkBook1.xlsx","Sheet1", 1, 1));
			baseClass.btnClick(locator.getBtnClick());
			baseClass.selectParticularValue(bookingPage.getTxtloction(),baseClass.readValueFromExcel("C:\\Users\\intel\\eclipse-workspace\\mavenDay1\\Excel Workbook\\AdactinWorkBook1.xlsx","Sheet1",2,1));
			baseClass.selectParticularValue(bookingPage.getTxtHotel(), baseClass.readValueFromExcel("C:\\Users\\intel\\eclipse-workspace\\mavenDay1\\Excel Workbook\\AdactinWorkBook1.xlsx", "Sheet1", 3, 1));
			baseClass.selectParticularValue(bookingPage.getRoomType(), baseClass.readValueFromExcel("C:\\Users\\intel\\eclipse-workspace\\mavenDay1\\Excel Workbook\\AdactinWorkBook1.xlsx", "Sheet1", 4, 1));
			baseClass.selectVisibleText(bookingPage.getNoOfrooms(),baseClass.readValueFromExcel("C:\\Users\\intel\\eclipse-workspace\\mavenDay1\\Excel Workbook\\AdactinWorkBook1.xlsx", "Sheet1", 5, 1));
			baseClass.selectParticularValue(bookingPage.getAdultPerRoom(), "2");
			baseClass.selectParticularValue(bookingPage.getChildPerRoom(), "1");
			baseClass.btnClick(bookingPage.getCheckInDate());
			baseClass.controlAll(bookingPage.getCheckInDate());
			baseClass.btnClick(bookingPage.getBtnSubmit());
			SelectHotel hotel = new  SelectHotel();
			baseClass.btnClick(hotel.getRdoBtnSelect());
			baseClass.btnClick(hotel.getBtnContinue());
			baseClass.sendkey(hotel.getTxtFirstName(), "guna");
			baseClass.sendkey(hotel.getTxtLastName(), "kumar");
			baseClass.sendkey(hotel.getTxtAddress(), "2.greens tech,omr chennai");
			baseClass.sendkey(hotel.getTxtCreaditCardNumber(), "5000500255231111");
			baseClass.selectParticularValue(hotel.getCreaditCardType(),"VISA");
			baseClass.selectParticularValue(hotel.getExpiryMonth(),"5");
			baseClass.selectParticularValue(hotel.getExpiryYear(),"2022");
			baseClass.sendkey(hotel.getCvvNumber(), "888");
			baseClass.btnClick(hotel.getBtnBookNow());
			Thread.sleep(8000);
			baseClass.getAttribute(hotel.getGetOrderNumber());
			baseClass.btnClick(hotel.getBtnLogOut());
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
