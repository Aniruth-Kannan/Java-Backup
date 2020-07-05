package fastTrackAssignment.commonMethods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class base {
    public static WebDriver driver = null;

    public static WebDriver invokeDriver() {
        System.setProperty("webdriver.chrome.driver", "D://Java/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Webdriver is instantiated");
        return driver;
    }

    public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"\\Screenshot\\"+testCaseName+".png";
        FileUtils.copyFile(src, new File(destinationFile));
        return destinationFile;
    }


}
