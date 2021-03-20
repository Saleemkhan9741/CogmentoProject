package com.crm.cogmento.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public Login_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='text']")
	private WebElement Usernametbox;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Passwordtbox;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement Loginbttn;

	@FindBy(xpath="//span[@class='user-display']")
	private WebElement DispalyUsername;
	
	public WebElement getUsernametbox() {
		return Usernametbox;
	}

	public WebElement getPasswordtbox() {
		return Passwordtbox;
	}

	public WebElement getLoginbttn() {
		return Loginbttn;
	}

	public WebElement getDispalyUsername() {
		return DispalyUsername;
	}
}

