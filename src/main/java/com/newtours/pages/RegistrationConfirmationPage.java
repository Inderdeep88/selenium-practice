package com.newtours.pages;

import com.newtours.elements.RegistrationConfirmationPageElement;
import org.openqa.selenium.WebDriver;

import static com.newtours.utils.Utilities.addAttachment;

public class RegistrationConfirmationPage extends BasePage{

//    private WebDriver webDriver;
    private RegistrationConfirmationPageElement registrationConfirmationPageElement;

    public RegistrationConfirmationPage(WebDriver webDriver) {
        super(webDriver);
        this.registrationConfirmationPageElement = new RegistrationConfirmationPageElement(webDriver);
        this.webDriver = webDriver;
    }

    public synchronized String getConfTextValue(){
        long id = Thread.currentThread().threadId();
        addAttachment(id + " ScreenShot on Registration Conf page " +webDriver, webDriver);
        System.out.println(id + " inside getConfTextValue - after attach" + webDriver);
        return registrationConfirmationPageElement.getConfText().getText();
    }
}
