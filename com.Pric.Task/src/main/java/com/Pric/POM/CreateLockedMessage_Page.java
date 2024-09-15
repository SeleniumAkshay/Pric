package com.Pric.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLockedMessage_Page {
	
	public CreateLockedMessage_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Amount']")
	private WebElement amountTextField;
	
	@FindBy(name = "visibleMessage")
	private WebElement visibleMessageTextField;
	
	@FindBy(name = "premiumContent")
	private WebElement premiumContentTextField;
	
	@FindBy(name = "isFomo")
	private WebElement isFomoToggle;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitButton;
	
	@FindBy(name = "fomoTimeSelection")
	private WebElement selectTimeDropDown;

	@FindBy(name = "fomoDiscount")
	private WebElement selectDiscountDropDown;
	
	public WebElement getSelectDiscountDropDown() {
		return selectDiscountDropDown;
	}

	public WebElement getSelectTimeDropDown() {
		return selectTimeDropDown;
	}

	public WebElement getAmountTextField() {
		return amountTextField;
	}

	public WebElement getVisibleMessageTextField() {
		return visibleMessageTextField;
	}

	public WebElement getPremiumContentTextField() {
		return premiumContentTextField;
	}

	public WebElement getIsFomoToggle() {
		return isFomoToggle;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
