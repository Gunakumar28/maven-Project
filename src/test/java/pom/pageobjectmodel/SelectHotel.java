package pom.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenDay1.BaseClass;

public class SelectHotel extends BaseClass{
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@id='radiobutton_0']")
	private WebElement rdoBtnSelect;
	
	@FindBy(xpath = "//*[@id='continue']")
	private WebElement btnContinue;
	
	@FindBy (xpath = "//*[@id='first_name']")
	private WebElement txtFirstName;
	
	@FindBy (id = "last_name")
	private WebElement txtLastName;
	
	@FindBy (id = "address")
	private WebElement txtAddress;
	
	
	@FindBy (xpath = "//*[@id='cc_num']")
	private WebElement txtCreaditCardNumber;
	
	@FindBy (xpath = "//*[@id='cc_type']")
	private WebElement creaditCardType;
	
	@FindBy (xpath = "//*[@id='cc_exp_month']")
	private WebElement expiryMonth;
	
	@FindBy (id = "cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy (xpath = "//*[@id='cc_cvv']")
	private WebElement 	cvvNumber;
	
	@FindBy (xpath = "//*[@id='book_now']")
	private WebElement btnBookNow;
	
	
	@FindBy (xpath = "//*[@id='order_no']")
	private WebElement getOrderNumber;
	
	
	@FindBy (xpath = "//*[@id='logout']")
	private WebElement btnLogOut;


	public WebElement getRdoBtnSelect() {
		return rdoBtnSelect;
	}


	public WebElement getBtnContinue() {
		return btnContinue;
	}


	public WebElement getTxtFirstName() {
		return txtFirstName;
	}


	public WebElement getTxtLastName() {
		return txtLastName;
	}


	public WebElement getTxtAddress() {
		return txtAddress;
	}


	public WebElement getTxtCreaditCardNumber() {
		return txtCreaditCardNumber;
	}


	public WebElement getCreaditCardType() {
		return creaditCardType;
	}


	public WebElement getExpiryMonth() {
		return expiryMonth;
	}


	public WebElement getExpiryYear() {
		return expiryYear;
	}


	public WebElement getCvvNumber() {
		return cvvNumber;
	}


	public WebElement getBtnBookNow() {
		return btnBookNow;
	}


	public WebElement getGetOrderNumber() {
		return getOrderNumber;
	}


	public WebElement getBtnLogOut() {
		return btnLogOut;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
