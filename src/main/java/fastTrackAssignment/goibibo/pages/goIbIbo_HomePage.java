package fastTrackAssignment.goibibo.pages;

import org.openqa.selenium.By;

public interface goIbIbo_HomePage {

    public static String Url = "www.goibibo.com/";
    public static By buttonRoundTrip = By.xpath("//span[@id='roundTrip']");
    public static By fieldFrom = By.xpath("//input[@id='gosuggest_inputSrc']");
    public static By fieldTo = By.xpath("//input[@id='gosuggest_inputDest']");

    public static By departureDate = By.xpath("//input[@id='departureCalendar']");
    public static final By buttonSubmit = By.xpath("//button[@id='gi_search_btn']");

}
