package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.*;

public class TC_003_ProductValidation extends TestBase{

	@Test
	public void TC_003_ProductValidation() throws Exception{

		HomePage homePage = new HomePage(driver);
		ShopPage shopPage = new ShopPage(driver);
		CartPage cartPage = new CartPage(driver);
		
		homePage.clickOnShop();
		shopPage.buyBunny();
		shopPage.buyFrog();
		shopPage.buyValentineBear();
		homePage.clickOnCart();
		cartPage.enterFrogQuantity();
		cartPage.enterBunnyQuantity();
		cartPage.enterBearQuantity();
		cartPage.validateTotal();
	}
	}