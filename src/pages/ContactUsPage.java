package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import base.TestBase;

public class ContactUsPage extends TestBase{

	
	WebDriver driver;
	public ContactUsPage(WebDriver driver){
	this.driver=driver;
	}
	

	By forename = By.xpath("//input[@id='forename']");
	public void enterForename(){
		fluentWaitForElement(forename);
		driver.findElement(forename).sendKeys("Test Test");

	}
	
	By email = By.xpath("//input[@id='email']");
	public void enterEmail(){
		fluentWaitForElement(email);
		driver.findElement(email).sendKeys("Test@test.com");
		
	}
	
	By message = By.xpath("//textarea[@id='message']");
	public void enterMessage(){
		fluentWaitForElement(message);
		driver.findElement(message).sendKeys("Hello , this is fore testing only");
		
	}
	
	By submitButton =By.xpath("//a[@class='btn-contact btn btn-primary']");
	public void clickOnSubmitButton(){
		fluentWaitForElement(submitButton);
        driver.findElement(submitButton).click();
	}
		
	By information =By.xpath("//div[@class='alert alert-info ng-scope']");
	public void validateNoErrorMessage(){
		fluentWaitForElement(information);
		String expectedValue =driver.findElement(information).getText();
      Assert.assertEquals(expectedValue, "We welcome your feedback - tell it how it is.");
	}
	
	By forNameErrorMessage =By.id("forename-err");
	public void validateForNameErrorMessage(){
		fluentWaitForElement(forNameErrorMessage);
		String expectedValue =driver.findElement(forNameErrorMessage).getText();
      Assert.assertEquals(expectedValue, "Forename is required");
	}
	
	By emailErrorMessage =By.id("email-err");
	public void validateEmailErrorMessage(){
		fluentWaitForElement(emailErrorMessage);
		String expectedValue =driver.findElement(emailErrorMessage).getText();
      Assert.assertEquals(expectedValue, "Email is required");
	}
	
	By messageErrorMessage =By.id("message-err");
	public void validateMessageErrorMessage(){
		fluentWaitForElement(messageErrorMessage);
		String expectedValue =driver.findElement(messageErrorMessage).getText();
      Assert.assertEquals(expectedValue, "Message is required");
	}

	By successMessage =By.xpath("//div[@class='alert alert-success']");
	public void validateSuccessMessage(){
		fluentWaitForElement(successMessage);
		String expectedValue =driver.findElement(successMessage).getText();
      Assert.assertEquals(expectedValue, "Thanks Test Test, we appreciate your feedback.");
	}
}