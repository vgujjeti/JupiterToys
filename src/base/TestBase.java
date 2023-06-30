package base;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
	
	
	public class TestBase {
		
	public static WebDriver driver = null;
	
	@BeforeTest
	public void initialize(){	
	File file = new File(System.getProperty("user.dir") + "/src/drivers/chromedriver"); // Enable this for mac
	//File file = new File(System.getProperty("user.dir") + "//src//drivers//chromedriver.exe"); // Enable this for windows
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jupiter.cloud.planittesting.com/");
	}
	
	
	@AfterTest
	public void TeardownTest(){
	driver.quit();
	}
	
	public void fluentWaitForElement(By xpath) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(45L))
			       .pollingEvery(Duration.ofSeconds(1L))
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(xpath);
			     }
			   });
			 
	}
	}

