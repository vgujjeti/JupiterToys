 package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.*;

public class TC_002_ContactUsFormSubmittion extends TestBase{

	@Test
	public void TC_002_ContactUsFormSubmittion() throws Exception{

		HomePage homePage = new HomePage(driver);
		ContactUsPage contactUsPage = new ContactUsPage(driver);
		homePage.clickOnContactUs();
		contactUsPage.enterForename();
		contactUsPage.enterEmail();
		contactUsPage.enterMessage();
		contactUsPage.clickOnSubmitButton();
		contactUsPage.validateSuccessMessage();
	}
	}