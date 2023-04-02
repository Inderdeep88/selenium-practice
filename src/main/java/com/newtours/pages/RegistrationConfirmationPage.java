package com.newtours.pages;

import com.newtours.elements.RegistrationConfirmationPageElement;

import static com.newtours.utils.Utilities.addAttachment;

public class RegistrationConfirmationPage extends BasePage{

    private RegistrationConfirmationPageElement registrationConfirmationPageElement;

    public RegistrationConfirmationPage() {
        this.registrationConfirmationPageElement = new RegistrationConfirmationPageElement();
    }

    public String getConfTextValue(){
        System.out.println("inside getConfTextValue - before attach");
        addAttachment("ScreenShot on Registration Conf page");
        System.out.println("inside getConfTextValue - after attach");
        return registrationConfirmationPageElement.getConfText().getText();
    }

    public void openFlightsPage(){
        registrationConfirmationPageElement.getFlightsLink().click();
    }

}
