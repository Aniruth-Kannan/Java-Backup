package com;
import com.driverMethods.driverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class seleniumTest_02 extends driverMethods {
	
	public static void main(String[] args) {
		driverMethods dr = new driverMethods();
		WebDriver driver = dr.invokeWebDriver();
		driver.get("https://www.facebook.com/");
		//Actions action = new Actions(driver); 
		//WebElement signInInHP = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		//action.moveToElement(signInInHP).build().perform();
		//driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']/a")).click();
		//typeTextInCAPage(driver);
		//openNewTab(driver, "https://www.flipkart.com/");
		//Select sl = new Select(driver.findElement(By.xpath("//select[@id='speed']")));
		//sl.selectByVisibleText("Slower");
		//selectElement(driver,"Slower");


		
		}
	
	public  WebDriver invokeWebDriver() {
		System.setProperty("webdriver.chrome.driver", "D://Java/chromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static double generateRandomNo() {
		double randomNo = (Math.random() * ( 900000 - 100000 )) + 100000;
		System.out.println("Random no Generated: " + randomNo);
		return randomNo;
	}
	
	public static String generateRandomEmail (double generateRandomNo) {
		String randomEmail = "aniruth"+generateRandomNo+"@gmail.com";
		System.out.println("Random no Generated: " + randomEmail);
		return randomEmail;
	}
	public static void typeTextInCAPage(WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Aniruth Kannan");
		String randomEmail = generateRandomEmail(generateRandomNo());
		System.out.println("Random email Generated: " + randomEmail);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(randomEmail);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("psre323lq300+2@A");
		driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("psre323lq300+2@A");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	public static void openNewTab(WebDriver driver, String url) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open();");
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("windows: "  + windows);
		driver.switchTo().window(windows.get(1));
		driver.get(url);	 
	}
	
	//Select elements
	public static void selectElement(WebDriver driver, String name) {
		Select sl = new Select(driver.findElement(By.xpath("//select[@id='speed']")));
		sl.selectByVisibleText("Slower");
	}
}
