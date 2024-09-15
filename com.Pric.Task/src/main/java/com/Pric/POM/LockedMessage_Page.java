package com.Pric.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LockedMessage_Page {

	public LockedMessage_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[contains(@class,'eye')]")
	private WebElement eyeButton;

	@FindBy(xpath = "//button[text()='Create Locked Message']")
	private WebElement createLockedMessage;

	@FindBy(xpath = "//i[contains(@class,'edit')]")
	private WebElement editButton;
	
	@FindBy(xpath = "//i[contains(@class,'trash')]")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//i[contains(@class,'share')]")
	private WebElement shareButton;
	
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement deletePopup;

	public WebElement getEditButton() {
		return editButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getShareButton() {
		return shareButton;
	}

	public WebElement getDelete() {
		return deletePopup;
	}

	public WebElement getEyeButton() {
		return eyeButton;
	}

	public WebElement getCreateLockedMessage() {
		return createLockedMessage;
	}
}
