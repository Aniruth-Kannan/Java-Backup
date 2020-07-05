package com;

import com.driverMethods.driverMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class seleniumTest_03 extends driverMethods {
	
	public static void main(String[] args) {
		driverMethods dr = new driverMethods();
		WebDriver driver = dr.invokeWebDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		//selectDemoDatePickerDisabled(driver);
		//driver.quit();
		/*driver.findElement(By.xpath("//span[@class='fb ico11  hpyBlueLt ']")).click();
		driver.findElement(By.xpath("//img[contains(@src,'/calendar.gif')]")).click();
		int actualyear = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
		System.out.println("Actual Year In UI: " + actualyear);
		int expectedYear = 2010;
		//
		if (actualyear == expectedYear){

		}
		else if(expectedYear < actualyear){
			for(int i = 0; expectedYear == actualyear; i++) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				actualyear = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
			}
		}
		else if(expectedYear > actualyear){
			for(int i = 0; expectedYear == actualyear; i++) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				actualyear = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
			}
		}*/
		//datePickerArrival(driver,"Sun Sep 13 2020");
		//selectLeastPrice(driver);
		///typeTextArrival(driver,"Mumbai");
		//driver.quit();
	}

	public static void datePickerDeparture(WebDriver driver, String dateToSelect){
		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();
		List<WebElement> currentMonthLoc = new ArrayList<>();
		List<String> fullformat = new ArrayList<>();
		currentMonthLoc = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		for(int i = 0; i<currentMonthLoc.size();){
			fullformat.add(currentMonthLoc.get(i).getAttribute("aria-label").toString());
			if(fullformat.get(i).equals(dateToSelect)){
				currentMonthLoc.get(i).click();
				break;
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

	public static void datePickerArrival(WebDriver driver, String dateToSelect){
		driver.findElement(By.xpath("//input[@id='returnCalendar']")).click();
		List<WebElement> currentMonthLoc = new ArrayList<>();
		List<String> fullformat = new ArrayList<>();
		currentMonthLoc = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		for(int i = 0; i<currentMonthLoc.size();){
			fullformat.add(currentMonthLoc.get(i).getAttribute("aria-label").toString());
			if(fullformat.get(i).equals(dateToSelect)){
				currentMonthLoc.get(i).click();
				break;
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

	public static void typeTextDeparture(WebDriver driver, String departureCity){
		driver.findElement(By.xpath("//input[@id='gosuggest_inputSrc']")).sendKeys(departureCity);
		List <WebElement> suggestionsWebElements = new ArrayList<>();
		ArrayList <String> suggestionsText = new ArrayList<>();
		suggestionsWebElements = driver.findElements(By.xpath("//ul[@id='react-autosuggest-1']/li"));
		for(int i = 0; i < suggestionsWebElements.size(); i++){
			suggestionsText.add(suggestionsWebElements.get(i).getText());
		}
		for(int i = 0; i < suggestionsWebElements.size();){
			if(suggestionsText.get(i).contains(departureCity)){
				suggestionsWebElements.get(i).click();
				break;
			}
			else{
				i++;
			}
		}

			System.out.println(suggestionsText);

	}

	public static void typeTextArrival(WebDriver driver, String arrivalCity){
		driver.findElement(By.xpath("//input[@id='gosuggest_inputDest']")).sendKeys(arrivalCity);
		List <WebElement> suggestionsWebElements = new ArrayList<>();
		ArrayList <String> suggestionsText = new ArrayList<>();
		suggestionsWebElements = driver.findElements(By.xpath("//ul[@id='react-autosuggest-1']/li"));
		for(int i = 0; i < suggestionsWebElements.size(); i++){
			suggestionsText.add(suggestionsWebElements.get(i).getText());
		}
		for(int i = 0; i < suggestionsWebElements.size();){
			if(suggestionsText.get(i).contains(arrivalCity)){
				suggestionsWebElements.get(i).click();
				break;
			}
			else{
				i++;
			}
		}

		System.out.println(suggestionsText);

	}

	public static void selectLeastPrice (WebDriver driver) {
		List<WebElement> leastPriceLoc = driver.findElements(By.xpath("//span[@class='ico20 fb quicks']"));
		ArrayList<String> leastPriceText = new ArrayList<>();
		for(int i = 0; i < leastPriceLoc.size(); i++){
			leastPriceText.add(leastPriceLoc.get(i).getText());
		}
		Collections.sort(leastPriceText);
		System.out.println(leastPriceText);
		String leastPrice = leastPriceText.get(0);
		System.out.println(leastPrice);
		By leastPriceFinalLoc = By.xpath(String.format("//span[@class='ico20 fb quicks' and (text()='"+leastPrice+"')]//ancestor::div[@class='clr']//input"));
		driver.findElement(leastPriceFinalLoc).click();
	}

	public static void selectDemoDatePickerDisabled(WebDriver driver){
		int expectedYr = 2020; int expectedMonth = 7; int expectedDate = 20;
		driver.findElement(By.xpath("//img[contains(@src,'/images/calendar.gif')]")).click();
		int actualYr = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
		int actualMonth = convertMonthsToNumbers(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
		System.out.println("Actual Year: " + actualYr + " Actual Month: " + actualMonth);
		if(actualYr < expectedYr) {
			while (actualYr != expectedYr) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				actualYr = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
			}
			System.out.println("Actual Year: " + actualYr);
			actualMonth = convertMonthsToNumbers(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
			while(actualMonth != expectedMonth){
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				actualMonth = convertMonthsToNumbers(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
			}
			String locFormat = "//td[@data-handler='selectDay']/a[text()='"+expectedDate+"']";
			By dateLoc = By.xpath(String.format(locFormat));
			driver.findElement(dateLoc).click();
		}
		else if(actualYr > expectedYr){
			while (actualYr != expectedYr) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				actualYr = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
			}
			System.out.println("Actual Year: " + actualYr);
			actualMonth = convertMonthsToNumbers(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
			while(actualMonth != expectedMonth){
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				actualMonth = convertMonthsToNumbers(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
			}
			String locFormat = "//td[@data-handler='selectDay']/a[text()='"+expectedDate+"']";
			By dateLoc = By.xpath(String.format(locFormat));
			driver.findElement(dateLoc).click();
		}
		else if(actualYr == expectedYr){
			if(actualMonth < expectedMonth){
				while(actualMonth != expectedMonth){
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
					actualMonth = convertMonthsToNumbers(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
				}
				String locFormat = "//td[@data-handler='selectDay']/a[text()='"+expectedDate+"']";
				By dateLoc = By.xpath(String.format(locFormat));
				driver.findElement(dateLoc).click();
			}
			else if(actualMonth > expectedMonth){
				while(actualMonth != expectedMonth){
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
					actualMonth = convertMonthsToNumbers(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
				}
				String locFormat = "//td[@data-handler='selectDay']/a[text()='"+expectedDate+"']";
				By dateLoc = By.xpath(String.format(locFormat));
				driver.findElement(dateLoc).click();
			}
			else if(actualMonth == expectedMonth){
				String locFormat = "//td[@data-handler='selectDay']/a[text()='"+expectedDate+"']";
				By dateLoc = By.xpath(String.format(locFormat));
				driver.findElement(dateLoc).click();
			}
		}
		actualYr = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
		actualMonth = convertMonthsToNumbers(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
		System.out.println("Actual Year: " + actualYr + " Actual Month: " + actualMonth);

	}

	public static int convertMonthsToNumbers (String monthName){
		int monthNuber = 0;
		switch (monthName.toLowerCase()){
			case "january": { monthNuber = 1;} break;
			case "february": { monthNuber = 2;} break;
			case "March": { monthNuber = 3;} break;
			case "april": { monthNuber = 4;} break;
			case "may": { monthNuber = 5;} break;
			case "june": { monthNuber = 6;} break;
			case "july": { monthNuber = 7;} break;
			case "august": { monthNuber = 8;} break;
			case "september": { monthNuber = 9;} break;
			case "october": { monthNuber = 10;} break;
			case "november": { monthNuber = 11;} break;
			case "december": { monthNuber = 12;} break;
			default: { monthNuber = 0; }
		}
		return monthNuber;
	}

	public static void selectDemoDatePickerEnabled(WebDriver driver){
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		String expectedMonth = "August"; String expectedYr = "2021"; String expectedDate = "20";
		String dateFormatLoc = "//a[contains(@title,'Select') and (text()='"+expectedDate+"')]";
		By dateLoc = By.xpath(String.format(dateFormatLoc));
		driver.findElement(dateLoc).click();
	}
}
