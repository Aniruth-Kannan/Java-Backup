package com;

import com.driverMethods.driverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class seleniumTest_01 extends driverMethods {
	
	public static void main(String[] args) {
		driverMethods dr = new driverMethods();
		WebDriver driver = dr.invokeWebDriver();
		driver.get("https://www.makemytrip.com");
        datePicker(driver,"Wed Sep 02 2020");
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

		List<WebElement> rawLocator = new ArrayList<WebElement>();
		rawLocator = driver.findElements(By.xpath(""));
		ArrayList <String> rawString = new ArrayList<>();
		for (int i = 0; i< rawLocator.size(); i++){
			rawString.add(rawLocator.get(i).getText());
		}

		System.out.println(rawString);
	}

	public static void getListElementText(WebDriver driver){
		List<WebElement> rawLocator = new ArrayList<WebElement>();
		rawLocator = driver.findElements(By.xpath(""));
		ArrayList <String> rawString = new ArrayList<>();
		for (int i = 0; i< rawLocator.size(); i++){
			rawString.add(rawLocator.get(i).getText());
		}
		System.out.println(rawString);
		for (int i = 0; i<rawString.size(); i++){
			rawString.add(rawString.get(i).toString().split("$")[0]);
		}
		System.out.println(rawString);
		ArrayList <Double> no = new ArrayList<>();
		for (int i = 0; i<rawString.size(); i++){
			no.add(Double.parseDouble(rawString.get(i)));
		}
		Collections.sort(no);
		String leastPrice = no.get(0).toString();
		String leastPriceLocator = ".//(text(),'"+leastPrice+"'";
		driver.findElement(By.xpath(String.format(leastPrice))).click();
	}

	public static void datePicker(WebDriver driver, String month){
	    driver.findElement(By.xpath("//label[@for='departure']/span[(@class='lbl_input latoBold appendBottom10')]")).click();
	    List<WebElement> currentMonthLoc = new ArrayList<>();
        List<String> fullformat = new ArrayList<>();
        currentMonthLoc = driver.findElements(By.xpath("//div[@class='  DayPicker-Day']"));
	    for(int i = 0; i<currentMonthLoc.size();){
            fullformat.add(currentMonthLoc.get(i).getAttribute("aria-label").toString());
	        if(fullformat.get(i).equals(month)){
                currentMonthLoc.get(i).click();
            }
	        else if(i == (currentMonthLoc.size()-1)){
	            driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	            i = 0;
	            currentMonthLoc.clear();
	            fullformat.clear();
                currentMonthLoc = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
            }
	        else{
	            i++;
            }
        }

    }
}
