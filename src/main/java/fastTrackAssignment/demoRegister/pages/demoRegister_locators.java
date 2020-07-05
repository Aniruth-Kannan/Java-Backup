package fastTrackAssignment.demoRegister.pages;

import org.openqa.selenium.By;

public interface demoRegister_locators {

    static By firstName = By.xpath("//input[@ng-model='FirstName']");
    static By lastName = By.xpath("//input[@ng-model='LastName']");
    static By email = By.xpath("//input[@ng-model='EmailAdress']");
    static By phone = By.xpath("//input[@ng-model='Phone']");
    static By genderMale = By.xpath("//input[@value='Male']");
    static By genderFemale = By.xpath("//input[@value='FeMale']");
    static By hobbiesCricket = By.xpath("//input[@value='Cricket']");
    static By hobbiesMovies = By.xpath("//input[@value='Movies']");
    static By hobbiesHockey = By.xpath("//input[@value='Hockey']");
    static By country = By.xpath("//select[@ng-model='country']");
    static By submitButton = By.xpath("//button[@id='submitbtn']");
    static By refreshButton = By.xpath("//button[@id='Button1']");
    static By selectYear = By.xpath("//select[@id='yearbox']");
    static By selectMonth = By.xpath("//select[@ng-model='monthbox']");
    static By selectDate = By.xpath("//select[@id='daybox']");
    static By fieldPassword = By.xpath("//input[@id='firstpassword']");
    static By fieldConfirmPassword = By.xpath("//input[@id='secondpassword']");
    static By webTableHeader = By.xpath("//div[@class='ui-grid-header-cell-wrapper']");

}
