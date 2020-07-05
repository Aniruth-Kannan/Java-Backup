package fastTrackAssignment.demoRegister.methods;

import fastTrackAssignment.commonMethods.base;
import fastTrackAssignment.commonMethods.commonMethods;
import fastTrackAssignment.demoRegister.pages.demoRegister_locators;
import org.openqa.selenium.WebDriver;

public class demoRegister_Steps implements fastTrackAssignment.demoRegister.pages.demoRegister_locators {

    static commonMethods commonMethods = new commonMethods();
    static demoRegister_locators demoRegister_locators = new demoRegister_Steps();
    static demoRegister_Steps demoRegister_Steps = new demoRegister_Steps();
    static WebDriver driver = null;
    static String url = "demo.automationtesting.in/Register.html";

    public static WebDriver invokeDriverFordemoRegister(){
        return driver = base.invokeDriver();
    }

    public static void enterDetailsTodemoRegisterForm(WebDriver driver){
        commonMethods.openUrl(driver, url,false);
        commonMethods.typeTextInTextBox(driver,firstName,"Fname");
        commonMethods.typeTextInTextBox(driver,lastName,"Lname");
        commonMethods.typeTextInTextBox(driver,email,commonMethods.generateRandomEmail());
        commonMethods.typeTextInTextBox(driver,phone,commonMethods.generateRandomPhoneNo());
        commonMethods.clickElement(driver, genderMale);
        commonMethods.clickElement(driver, hobbiesCricket);
        commonMethods.selectElementByName(driver, country, "India");
        commonMethods.selectElementByName(driver, selectYear, "1990");
        commonMethods.selectElementByName(driver, selectMonth, "April");
        commonMethods.selectElementByName(driver, selectDate, "13");
        commonMethods.typeTextInTextBox(driver,fieldPassword,"Abcd@1234");
        commonMethods.typeTextInTextBox(driver,fieldConfirmPassword,"Abcd@1234");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void closeTest(){
        commonMethods.closeDriverConnection(driver);
    }



}
