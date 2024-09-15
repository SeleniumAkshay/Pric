package com.Pric_testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Pric.GenericUtility.Base_Test;
import com.Pric.POM.OnBoarding_Page;

public class VerifyUserIsAbleToSignUp extends Base_Test {

	@Test
	public void createLockedMessage() throws IOException, InterruptedException {

		signPage.getSignUpButton().click();

		OnBoarding_Page onBoardingPage = new OnBoarding_Page(driver);
		onBoardingPage.getEducation().click();
		onBoardingPage.getLockedMessage().click();
		onBoardingPage.getTermsCheckBox().click();
		onBoardingPage.getAcceptButton().click();
		onBoardingPage.getNameTextField().sendKeys(file.readPropertyData("name"));
		onBoardingPage.getMobileNumberTextField().sendKeys(file.readPropertyData("phoneNumber"));
		onBoardingPage.getVerifyPhoneNumberButton().click();
		onBoardingPage.getEmailTextField().sendKeys(file.readPropertyData("email"));
		onBoardingPage.getVerifyEmailButton().click();
		onBoardingPage.getCityTextField().sendKeys(file.readPropertyData("city"));
		webdriverUtility.selectByValue(onBoardingPage.getStateDropDown(),file.readPropertyData("state"));
		onBoardingPage.getSubmitButton().click();
		
		Thread.sleep(3000);
		webdriverUtility.takeWebPageScreenShot();

	}

}
