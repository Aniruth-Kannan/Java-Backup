package cTSelenium;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.util.ArrayList;

public class seleniumMethods {

	public static WebDriver invokeDriver() {
		System.setProperty("webdriver.chrome.driver", "D://Java/chromeDriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void invokeUrl (WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void clickElement (WebDriver driver, String xPath) {
		driver.findElement(By.xpath(xPath)).click();
	}
	
	public static void enterText (WebDriver driver, String xPath, String text) {
		driver.findElement(By.xpath(xPath)).sendKeys(text);
	}
	
	public boolean checkElementIsPresent (WebDriver driver, String xPath) {
		boolean status = false;
		if(driver.findElement(By.xpath(xPath)).isDisplayed()) {
			return status = true;
		}
		else {
			return status = false;
		}
	}
	
	public static void selectElementByName (WebDriver driver, String xPath, String name) {
		Select sl = new Select(driver.findElement(By.xpath(xPath)));
		sl.selectByVisibleText(name);
	}
	
	public static void selectRepeatedly (WebDriver driver, String xPath) {
		ArrayList <WebElement> elements = new ArrayList<WebElement>();
		elements = (ArrayList<WebElement>) driver.findElements(By.xpath(xPath));
		for(int i = 0; i <= elements.size(); i++) {
			elements.get(i).click();
		}
		
	}
	
	public static void test (WebDriver driver) {
		Actions actions = new Actions(driver);
		//actions.dr
		
	}
	
	public static String readFromExcel() {
		String cell1 = null;
		try {
		FileInputStream fis = new FileInputStream("D:\\Java\\seleniumExampleworkbook.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("seleniumExample");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell);
		cell1 = cell.toString();

		}
		catch(Exception e) {
			System.out.println("Exception captured" + e.getMessage());
		}
		return cell1;
		
	}

	static String returnTextOfElement(WebDriver driver, String xPath){
		String textOfElement = driver.findElement(By.xpath(xPath)).getText();
		return textOfElement;
	}

}
