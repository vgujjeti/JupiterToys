package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.TestBase;

public class ShopPage extends TestBase{

	WebDriver driver;
	public ShopPage(WebDriver driver){
	this.driver=driver;
	}
	
	By Frog = By.xpath("//li[@id='product-2']//a[@class='btn btn-success'][normalize-space()='Buy']");
	public void buyFrog(){
		fluentWaitForElement(Frog);
		driver.findElement(Frog).click();
	}
	
	By bunny = By.xpath("//li[@id='product-4']//a[@class='btn btn-success'][normalize-space()='Buy']");
	public void buyBunny(){
		fluentWaitForElement(bunny);
		driver.findElement(bunny).click();
	}
	
	By valentineBear = By.xpath("//li[@id='product-7']//a[@class='btn btn-success'][normalize-space()='Buy']");
	public void buyValentineBear(){
		fluentWaitForElement(valentineBear);
		driver.findElement(valentineBear).click();
	}
}
