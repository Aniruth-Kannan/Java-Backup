package cTSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class assignment1 extends seleniumMethods {
    static seleniumMethods seleniumMethods = new seleniumMethods();
    static WebDriver driver = seleniumMethods.invokeDriver();
    public static void main (String args[]){
        String temp, userName, password = null;
        seleniumMethods.invokeUrl(driver, "https://demo.opencart.com");
        seleniumMethods.clickElement(driver, "//a[(@class='dropdown-toggle') and (@href='https://demo.opencart.com/index.php?route=account/account')]");
        seleniumMethods.clickElement(driver, "//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Login']");
        temp = seleniumMethods.readFromExcel();
        userName = temp.split(",")[0];
        password = temp.split(",")[1];
        System.out.println("user name: " + userName + " Password: " + password );
        seleniumMethods.enterText(driver, "//input[@id='input-email']", userName);
        seleniumMethods.enterText(driver, "//input[@id='input-password']", password );
        seleniumMethods.clickElement(driver, "//input[@class='btn btn-primary']");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        seleniumMethods.clickElement(driver, "//a[(@class='dropdown-toggle') and (@href='https://demo.opencart.com/index.php?route=account/account')]");
        seleniumMethods.clickElement(driver, "//ul[contains(@class,'dropdown-menu-right')]/li/a[text()='Logout']");

    }
}
