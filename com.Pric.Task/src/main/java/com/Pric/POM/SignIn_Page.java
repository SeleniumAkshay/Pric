package com.Pric.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {
	
	public SignIn_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="tel")
	private WebElement phoneNumberTextField;
	
	@FindBy(xpath = "//button[text()='Send OTP']")
	private WebElement sendOtpButton;

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getSendOtpButton() {
		return sendOtpButton;
	}

}
