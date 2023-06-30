package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import base.TestBase;

public class HomePage extends TestBase{
	
	WebDriver driver;
	public HomePage(WebDriver driver){
	this.driver=driver;
	}
	
	
	By contactUs =By.xpath("//a[normalize-space()='Contact']");
	public void clickOnContactUs(){
		fluentWaitForElement(contactUs);
		driver.findElement(contactUs).click();
	}
	
	
	By shop =By.xpath("//a[normalize-space()='Shop']");
	public void clickOnShop(){
		fluentWaitForElement(shop);
		driver.findElement(shop).click();
	}
	
	
	
	By chart =By.xpath("//a[@href='#/cart']");
	public void clickOnCart(){
		fluentWaitForElement(chart);
		driver.findElement(chart).click();
	}
	}