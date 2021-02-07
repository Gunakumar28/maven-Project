package org.demoWebsite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenDay1.BaseClass;

public class DemoWebsite extends BaseClass{
	
	public DemoWebsite() {
		PageFactory.initElements(driver, this);
	}
		@FindAll({@FindBy(xpath = "//*[text()='Phones']"),@FindBy(xpath = "(//a[@id='itemc'])[1]")})
		private WebElement btnPhone;
		
		@FindAll({@FindBy(xpath = "(//a[@id='itemc'])[2]"),@FindBy(xpath = "//*[text()='Laptops']")})
		private WebElement btnLaptop;
		
		@FindAll({@FindBy(xpath = "(//a[@id='itemc'])[3]"),@FindBy(xpath = "//a[text()='Monitors']")})
		private WebElement btnMoniter;
		
		@FindBy(xpath = "//a[@class='hrefch']")
		private WebElement txtMobileName;
		
		@FindBy(xpath = "//*[@class='card-block']/h5")
		private WebElement txtMobilePrice;
		
		@FindBy(xpath = "//a[@class='hrefch']")
		private WebElement txtLaptopName;
		
		@FindBy(xpath = "//*[@class='card-block']/h5")
		private WebElement txtLaptopPrice;
		
		@FindBy(xpath = "//*[@class='hrefch']")
		private WebElement txtMoniterName;
		
		@FindBy(xpath = "//*[@class='card-block']/h5")
		private WebElement txtMoniterPrice;
		
		@FindAll({@FindBy(xpath = "//button[@id='next2']"),@FindBy(xpath = "//button[text()='Next']")})
		private WebElement btnNext;
		
		@FindAll({@FindBy(xpath = "//a[text()='Add to cart']"),@FindBy(xpath = "//a[@class='btn btn-success btn-lg']")})
		private WebElement btnAddToCart;
		
		@FindBy(xpath = "//*[text()='Cart']")
		private WebElement btnCart;
		
		@FindAll({@FindBy(xpath = "//*[@id='login2']"),@FindBy(xpath = "(//*[text()='Log in'])[3]")})
		private WebElement btnLogIn;
		
		@FindAll({@FindBy(xpath = "//input[@id='loginusername']"),@FindBy(xpath = "(//*[@type='text'])[4]")})
		private WebElement txtUserName;
		
		@FindBy(xpath = "//input[@id='loginpassword']")
		private WebElement txtPassWord;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
