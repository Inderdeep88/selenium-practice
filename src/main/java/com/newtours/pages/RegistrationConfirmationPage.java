package com.newtours.pages;

import com.newtours.elements.RegistrationConfirmationPageElement;
import org.openqa.selenium.WebDriver;

import static com.newtours.utils.Utilities.addAttachment;

public class RegistrationConfirmationPage {

    private RegistrationConfirmationPageElement registrationConfirmationPageElement;

    public RegistrationConfirmationPage() {
        this.registrationConfirmationPageElement = new RegistrationConfirmationPageElement();
    }

    public String getConfTextValue(WebDriver driver){
        long id = Thread.currentThread().threadId();
        System.out.println(id+" inside getConfTextValue - before attach" + driver);
        addAttachment("ScreenShot on Registration Conf page", driver);
        System.out.println(id+" inside getConfTextValue - after attach" + driver);
        return registrationConfirmationPageElement.getConfText(driver).getText();
    }
}
