package org.hotel.login;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import mavenDay1.BaseClass;
import pom.pageobjectmodel.MakeMyTripLocator;

public class TicketBookingMakeMyTrip extends BaseClass {
	
	public static void main(String[] args) throws AWTException {
		
		BaseClass baseClass= new BaseClass();
		baseClass.getDriver();
		baseClass.maximizeWindow();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		baseClass.launchUrl("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!makemytrip&ef_id=Cj0KCQiA0-6ABhDMARIsAFVdQv-CBWK4At2oDqwosI5PBM89E42pWksvSPYfQAOGGhooF9cVSSoqWO0aAsYJEALw_wcB:G:s&gclid=Cj0KCQiA0-6ABhDMARIsAFVdQv-CBWK4At2oDqwosI5PBM89E42pWksvSPYfQAOGGhooF9cVSSoqWO0aAsYJEALw_wcB");
	
		MakeMyTripLocator locator = new MakeMyTripLocator();
	//	baseClass.btnClick(locator.getLoginmakeMytrip());
		
		/*	baseClass.btnClick(locator.getClickFromCity());
		//baseClass.sendkey(locator.getClickFromCity(), "Chennai");
		baseClass.txtPassword(locator.getClickFromCity(), "chennai");
		baseClass.downKey();
		baseClass.enterkey();
		
		baseClass.btnClick(locator.getClickToCity());
		baseClass.sendkey(locator.getClickToCity(), "Bangalore");
		baseClass.downKey();
		baseClass.enterkey();                               */
		baseClass.btnClick(locator.getBtnSearch());                                                 
		
		
	//	baseClass.scrollDown(locator.getScrolldown());
		baseClass.findelements("//span[@class='actual-price']");
		baseClass.findelements("//span[@class='actual-price']");
		//baseClass.scrollUp(locator.getScrollp());
		
		
	}

}
