package com.Pric_testScripts;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.Pric.GenericUtility.Base_Test;
import com.Pric.POM.CreateLockedMessage_Page;
import com.Pric.POM.LockedMessage_Page;

public class VerifyUserIsAbleToCreateLockedMessage extends Base_Test {

	@Test
	public void createLockedMessage() throws IOException, InterruptedException {

		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(homePage.getLockedMessage()));
		Thread.sleep(2000);
		homePage.getLockedMessage().click();
		
		LockedMessage_Page lockedMessage=new LockedMessage_Page(driver);
		lockedMessage.getCreateLockedMessage().click();

		CreateLockedMessage_Page createLockedMessage = new CreateLockedMessage_Page(driver);
		createLockedMessage.getAmountTextField().sendKeys(file.readPropertyData("amount"));
		createLockedMessage.getVisibleMessageTextField().sendKeys(file.readPropertyData("visibleMessage"));
		createLockedMessage.getPremiumContentTextField().sendKeys(file.readPropertyData("premiumContent"));
		createLockedMessage.getIsFomoToggle().click();
		webdriverUtility.selectByIndex(createLockedMessage.getSelectTimeDropDown(),2);
		webdriverUtility.selectByIndex(createLockedMessage.getSelectDiscountDropDown(),5);
		createLockedMessage.getSubmitButton().click();
		
		Thread.sleep(3000);
		webdriverUtility.takeWebPageScreenShot();

	}

}
