package cTSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class assignment6 extends seleniumMethods{
	static seleniumMethods seleniumMethods = new seleniumMethods();
	static WebDriver driver = seleniumMethods.invokeDriver();
	public static void main(String[] args) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		launchAndLoginToApp(driver);
		searchAndSelectProduct(driver);
		seleniumMethods.readFromExcel();
		
	}
	
	static void launchAndLoginToApp(WebDriver driver) {
		seleniumMethods.invokeUrl(driver, "https://demo.opencart.com/");
		seleniumMethods.clickElement(driver, "//a[(@class='dropdown-toggle') and (@href='https://demo.opencart.com/index.php?route=account/account')]");
		seleniumMethods.clickElement(driver, "//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Login']");
		seleniumMethods.enterText(driver, "//input[@id='input-email']", "openCartTest001@bh.exacttarget.com");
		seleniumMethods.enterText(driver, "//input[@id='input-password']", "Password1");
		seleniumMethods.clickElement(driver, "//input[@class='btn btn-primary']");
	}
	
	static void searchAndSelectProduct(WebDriver driver) {
		seleniumMethods.enterText(driver, "//input[@class='form-control input-lg']", "keyword");
		driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys(Keys.ENTER);
		seleniumMethods.checkElementIsPresent(driver, "//select[@class='form-control']");
		seleniumMethods.selectElementByName(driver, "//select[@class='form-control']", "      Monitors");
		seleniumMethods.clickElement(driver, "//ul[@class='nav navbar-nav']//a[text()='Phones & PDAs']");
		seleniumMethods.selectElementByName(driver, "//select[@id='input-sort']", "Price (High > Low)");
		seleniumMethods.selectRepeatedly(driver, "//i[@class='fa fa-exchange']");
		seleniumMethods.clickElement(driver, "//a[@id='compare-total']");
		seleniumMethods.clickElement(driver, "//table[@class='table table-bordered']/tbody[1]/tr/td[2]/a");
		seleniumMethods.clickElement(driver, "//button[@id='button-cart']");
		seleniumMethods.clickElement(driver, "//span[@id='cart-total']");
		seleniumMethods.clickElement(driver, "//p[@class='text-right']//a[contains(@href,'route=checkout/checkout')]");
	}



}
