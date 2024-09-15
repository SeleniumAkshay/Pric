package com.Pric.GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Pric.POM.Home_Page;
import com.Pric.POM.SignIn_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test {

	public File_Utility file = new File_Utility();
	public WebDriver driver;
	public static WebDriver sdriver;
	public ExtentSparkReporter spark;
	public ExtentReports reports;
	public ExtentTest test;
	public Java_Utility javaUtility = new Java_Utility();
	public WebDriver_Utility webdriverUtility = new WebDriver_Utility();
	public WebDriverWait wait;
	public SignIn_Page signPage;
	public Home_Page homePage;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest");

		spark = new ExtentSparkReporter(FrameWorkConstants.extentReportsPath + javaUtility.localDateTime() + ".html");
		reports = new ExtentReports();
		reports.attachReporter(spark);

	}

	@BeforeClass
	public void beforeClass() throws IOException {
		System.out.println("@BeforeClass");

		String browserName = file.readPropertyData("browserName");
		String url = file.readPropertyData("url");

		if (browserName.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.contains("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser Name");
		}
		sdriver = driver;
		homePage = new Home_Page(driver);
		signPage = new SignIn_Page(driver);
		wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get(url);

	}

	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		System.out.println("@BeforeMethod");
//		signPage.getPhoneNumberTextField().sendKeys(file.readPropertyData("phoneNumber"));
//		signPage.getSendOtpButton().click();
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		System.out.println("@AfterMethod");
		Thread.sleep(2000);
//		webdriverUtility.javaScriptScrollToElement(homePage.getSignOutButton());
//		homePage.getSignOutButton().click();
//		homePage.getSignOutPopup().click();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		System.out.println("@AfterClass");

		Thread.sleep(3000);
		driver.quit();

	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest");

		reports.flush();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite");
	}

}
