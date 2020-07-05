package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNgExample2 {
    static seleniumMethods seleniumMethods = new seleniumMethods();
    static WebDriver driver;

    @BeforeClass
    static void invokeDriverBeforeTest(){
        driver = seleniumMethods.invokeDriver();
    }

    @Test(priority = 0)
    static void launchAndLoginToApp(){
        seleniumMethods.invokeUrl(driver, "https://demo.opencart.com/");
        seleniumMethods.clickElement(driver, "//a[(@class='dropdown-toggle') and (@href='https://demo.opencart.com/index.php?route=account/account')]");
        seleniumMethods.clickElement(driver, "//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Login']");
        seleniumMethods.enterText(driver, "//input[@id='input-email']", "openCartTest001@bh.exacttarget.com");
        seleniumMethods.enterText(driver, "//input[@id='input-password']", "Password1");
        seleniumMethods.clickElement(driver, "//input[@class='btn btn-primary']");
    }

    @Test(priority = 1)
    static void searchAndSelectProduct(WebDriver driver) {
        seleniumMethods.enterText(driver, "//input[@class='form-control input-lg']", "Samsung Galaxy Tab 10.1");
        driver.findElement(By.xpath("//input[@class='form-control input-lg']")).sendKeys(Keys.ENTER);
        seleniumMethods.checkElementIsPresent(driver, "//div[@class='product-thumb']/div[1]");
        seleniumMethods.clickElement(driver, "///div[@class='product-thumb']/div[1]");
        seleniumMethods.checkElementIsPresent(driver, "//div[@id='product']//input[@name='quantity']");
        seleniumMethods.enterText(driver, "//div[@id='product']//input[@name='quantity']", "2");
        seleniumMethods.clickElement(driver, "//div[@id='product']//button[@id='button-cart']");
    }

    @Test(priority = 2)
    static void compareTotalAndLogout(WebDriver driver){
        seleniumMethods.clickElement(driver, "//span[@id='cart-total']");
        String textOfElement = seleniumMethods.returnTextOfElement(driver,"//table[@class='table table-bordered']/tbody/tr[2]/td[2]");
        textOfElement = textOfElement.split("$")[1];
        Double textOfElementDouble = Double.parseDouble(textOfElement);
        if(textOfElementDouble<200){
            seleniumMethods.clickElement(driver, "//div[@class='buttons clearfix']//a[@class='btn btn-default']");
        }
        else{
            seleniumMethods.clickElement(driver, "//a[(@class='dropdown-toggle') and (@href='https://demo.opencart.com/index.php?route=account/account')]");
            seleniumMethods.clickElement(driver, "///a[(@class='dropdown-toggle') and (@href='https://demo.opencart.com/index.php?route=account/account')]/../ul/li[5]/a");
        }
    }

    @AfterClass
    static void closeDriver(){
        seleniumMethods.quitWebDriver(driver);
    }







}
