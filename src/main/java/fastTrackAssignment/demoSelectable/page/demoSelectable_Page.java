package fastTrackAssignment.demoSelectable.page;

import org.openqa.selenium.By;

public interface demoSelectable_Page {

    public static final By tabDefaultFunctionality = By.xpath("//a[@class='analystic' and (text()='Default Functionality ')]");
    public static final By tabSerialize = By.xpath("//a[@class='analystic' and (text()='Serialize ')]");

    public static final By listDefaultFunctionalityCommonLoc = By.xpath("//div[@id='Default']//li[contains(@class,'ui-widget-content')]");
    public static final By listSerizlieCommonLoc = By.xpath("//div[@id='Serialize']//li[contains(@class,'ui-widget-content')]/b");

    public static final By textVerify = By.xpath("//div[@id='Serialize']//p[@id='feedback']");
}
