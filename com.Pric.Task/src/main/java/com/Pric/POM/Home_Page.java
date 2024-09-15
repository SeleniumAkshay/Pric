package com.Pric.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Locked Message']")
	private WebElement lockedMessage;
	
	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement signOutButton;
	
	@FindBy(xpath = "//button[text()='Sign Out']")
	private WebElement signOutPopup;
	
	public WebElement getSignOutPopup() {
		return signOutPopup;
	}

	public WebElement getLockedMessage() {
		return lockedMessage;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}

}
