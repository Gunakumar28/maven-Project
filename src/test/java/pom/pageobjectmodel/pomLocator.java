package pom.pageobjectmodel;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import mavenDay1.BaseClass;

public class pomLocator extends BaseClass{
	public pomLocator() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	@FindBy  (id = "username")
	private WebElement txtUserName;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement txtPassWord;
	
	@FindBy(id="login")
	private WebElement btnClick;
	
	
	
		

	
	
	
	
		

	
	
	

}
