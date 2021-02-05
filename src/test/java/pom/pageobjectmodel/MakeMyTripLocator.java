package pom.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenDay1.BaseClass;

public class MakeMyTripLocator extends BaseClass {
	
	public MakeMyTripLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath = "//a[text()='Search']"),@FindBy(xpath = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")})
	private WebElement btnSearch;

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	@FindBy(xpath = "//span[@class='actual-price']")
	private WebElement ticketPrice;

	public WebElement getTicketPrice() {
		return ticketPrice;
	}
	
	@FindBy(xpath = "(//span[@class='actual-price'])[1]")
	private WebElement scrollp;
	
	@FindBy(xpath = "(//span[@class='actual-price'])[20]")
	private WebElement scrolldown;

	public WebElement getScrollp() {
		return scrollp;
	}

	public WebElement getScrolldown() {
		return scrolldown;
	}
	
	@FindBy(xpath = "//li[@data-cy='account']")
	private WebElement loginmakeMytrip;

	public WebElement getLoginmakeMytrip() {
		return loginmakeMytrip;
	}
	
	@FindBy (xpath = "//*[@id='fromCity']")
	private WebElement fromCity;
	
	@FindBy(xpath = "(//*[@type='text'])[2]")
	private WebElement toCity;

	public WebElement getFromCity() {
		return fromCity;
	}

	public WebElement getToCity() {
		return toCity;
	}
	
	@FindAll({@FindBy(xpath = "(//*[@class='fsw_inputField lineHeight36 latoBlack font30'])[1]"),@FindBy(xpath = "//*[@id='fromCity']")})
	private WebElement clickFromCity;
	
	
	@FindAll({@FindBy(xpath = "(//*[@class='fsw_inputField lineHeight36 latoBlack font30'])[2]"),@FindBy(xpath = "//*[@id='toCity']")})
	private WebElement clickToCity;

	public WebElement getClickFromCity() {
		return clickFromCity;
	}

	public WebElement getClickToCity() {
		return clickToCity;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
