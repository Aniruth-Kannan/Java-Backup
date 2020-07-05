package com.driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class driverMethods implements driverMethodsInt{
	
	public WebDriver invokeWebDriver () {
		System.setProperty("webdriver.chrome.driver", "D://Java/chromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	

	
}
