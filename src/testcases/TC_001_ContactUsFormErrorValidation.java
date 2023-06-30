package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.ContactUsPage;
import pages.HomePage;


public class TC_001_ContactUsFormErrorValidation extends TestBase{

	HomePage homePage = new HomePage(driver);
	ContactUsPage contactUsPage = new ContactUsPage(driver);
	
	@Test
	public void TC_001_ContactUsFormErrorValidation(){
	HomePage homePage = new HomePage(driver);
	ContactUsPage contactUsPage = new ContactUsPage(driver);
	homePage.clickOnContactUs();
	contactUsPage.clickOnSubmitButton();
	contactUsPage.validateForNameErrorMessage();
	contactUsPage.validateEmailErrorMessage();
	contactUsPage.validateMessageErrorMessage();
	contactUsPage.enterForename();
	contactUsPage.enterEmail();
	contactUsPage.enterMessage();
	contactUsPage.validateNoErrorMessage();
	}
	}