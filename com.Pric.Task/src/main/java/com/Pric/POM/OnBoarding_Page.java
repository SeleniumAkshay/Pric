package com.Pric.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnBoarding_Page {
	
	public OnBoarding_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Education']")
	private WebElement education;
	
	@FindBy(xpath = "//img[@alt='Locked Message']")
	private WebElement lockedMessage;
	
	@FindBy(id = "termsCheckbox")
	private WebElement termsCheckBox;
	
	@FindBy(id = "bigButton")
	private WebElement acceptButton;
	
	@FindBy(name = "name")
	private WebElement nameTextField;
	
	@FindBy(name="mobileNumber")
	private WebElement mobileNumberTextField;
	
	@FindBy(xpath = "//button[text()='VERIFY']")
	private WebElement verifyPhoneNumberButton;
	
	@FindBy(name="email")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//button[text()='VERIFY']")
	private WebElement verifyEmailButton;
	
	@FindBy(name="city")
	private WebElement cityTextField;	
	
	public WebElement getEducation() {
		return education;
	}

	public WebElement getLockedMessage() {
		return lockedMessage;
	}

	public WebElement getTermsCheckBox() {
		return termsCheckBox;
	}

	public WebElement getAcceptButton() {
		return acceptButton;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getMobileNumberTextField() {
		return mobileNumberTextField;
	}

	public WebElement getVerifyPhoneNumberButton() {
		return verifyPhoneNumberButton;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getVerifyEmailButton() {
		return verifyEmailButton;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	@FindBy(name="state")
	private WebElement stateDropDown;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitButton;

}
