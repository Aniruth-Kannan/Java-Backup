package fastTrackAssignment.commonMethods;

import org.openqa.selenium.WebDriver;

public interface commonMethodsInterface {

    public WebDriver invokeDriver();

    public void openUrl(WebDriver driver, String url, boolean securityType);

    public void closeDriverConnection(WebDriver driver);

}
