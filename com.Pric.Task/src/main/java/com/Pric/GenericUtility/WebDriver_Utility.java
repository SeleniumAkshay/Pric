package com.Pric.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {

	Java_Utility javaUtility = new Java_Utility();

	public void takeWebPageScreenShot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) Base_Test.sdriver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotPath + javaUtility.localDateTime() + ".png");
		FileHandler.copy(temp, dest);

	}

	public void takeWebElementScreenshot(WebElement element) throws IOException {

		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotPath + javaUtility.localDateTime() + ".png");
		FileHandler.copy(temp, dest);

	}

	public void selectByValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByValue(value);

	}

	public void selectByIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);;

	}
	
	public void actionsScrollToElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element);
	}
	
	public void javaScriptScrollToElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) Base_Test.sdriver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
