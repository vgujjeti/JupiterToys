package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import base.TestBase;

public class CartPage extends TestBase{

	WebDriver driver;
	public CartPage(WebDriver driver){
	this.driver=driver;
	}
	
	By frogQuantity = By.xpath("/html/body/div[2]/div/form/table/tbody/tr[1]/td[3]/input");
	public void enterFrogQuantity(){
		fluentWaitForElement(frogQuantity);
		driver.findElement(frogQuantity).clear();
		driver.findElement(frogQuantity).sendKeys("2");
	}
	
	By bunnyQuantity = By.xpath("/html/body/div[2]/div/form/table/tbody/tr[2]/td[3]/input");
	public void enterBunnyQuantity(){
		fluentWaitForElement(bunnyQuantity);
		driver.findElement(bunnyQuantity).clear();
		driver.findElement(bunnyQuantity).sendKeys("5");
	}
	
	By bearQuantity = By.xpath("/html/body/div[2]/div/form/table/tbody/tr[3]/td[3]/input");
	public void enterBearQuantity(){
		fluentWaitForElement(bearQuantity);
		driver.findElement(bearQuantity).clear();
		driver.findElement(bearQuantity).sendKeys("3");
	}
	
	
	By total = By.xpath("//strong[@class='total ng-binding']");
	public void validateTotal() throws Exception{
		fluentWaitForElement(total);
		Thread.sleep(1500);
		String expectedValue =driver.findElement(total).getText();
		Assert.assertEquals(expectedValue, "Total: 119.9");
	}
}
