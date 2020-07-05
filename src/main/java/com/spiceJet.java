package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class spiceJet {

    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "D://Java/chromeDriver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,15);
        driver.get("https://www.makemytrip.com");
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='fromCity']")));
        driver.findElement(By.xpath("//input[@id='fromCity']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']//input")));
        String textToEnter = "String";
        char[] charToENter = textToEnter.toCharArray();
        for(int i = 0; i<charToENter.length; i++) {
            driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']//input")).sendKeys(Character.toString(textToEnter.charAt(i)));

        }
        driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']//input")).sendKeys("Chennai");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='react-autowhatever-1']//li//p[contains(@class,'blackText')]")));
        List <WebElement> el = driver.findElements(By.xpath("//div[@id='react-autowhatever-1']//li//p[contains(@class,'blackText')]"));
        for(int i = 0; i<el.size(); i++){
            System.out.println("Text of suggestion " + i + ": " + el.get(i).getText());
            if(el.get(i).getText().contains("Chennai")){
                actions.moveToElement(el.get(i)).click().build().perform();
            }
        }
        System.out.println(el);
        //el.sendKeys("Chennai");
        //actions.moveToElement(el).click().build().perform();
    }
}
