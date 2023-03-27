package com.newtours.pages;

import com.newtours.elements.RegistrationConfirmationPageElement;
import com.newtours.elements.RegistrationPageElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.qameta.allure.Step;

import static com.newtours.utils.Utilities.addAttachment;

public class RegistrationPage extends BasePage{

    private RegistrationPageElement registrationPageElement;
    private RegistrationConfirmationPageElement registrationConfirmationPageElement;

    public RegistrationPage(){
        this.registrationPageElement = new RegistrationPageElement();
        this.registrationConfirmationPageElement = new RegistrationConfirmationPageElement();
    }

    @Step("Step to open the web URL")
    public void goTo (){
        webDriver.get("https://demo.guru99.com/test/newtours/register.php");
        webDriverWait.until(ExpectedConditions.visibilityOf(registrationPageElement.getFirstNameTxt()));
        addAttachment("ScreenShot after opening URL");
    }

    @Step("Step to Enter the Contact info")
    public void enterContactInfo(String fname, String lname, String phone, String email){
        registrationPageElement.getFirstNameTxt().sendKeys(fname);
        registrationPageElement.getLastNameTxt().sendKeys(lname);
        registrationPageElement.getPhoneTxt().sendKeys(phone);
        registrationPageElement.getEmailTxt().sendKeys(email);
        addAttachment("ScreenShot enterContactInfo");
    }

    @Step("Step to Enter the User info")
    public void enterUserInfo(String uname, String pass, String cpass){
        System.out.println("Hello");
        registrationPageElement.getUsernameTxt().sendKeys(uname);
        registrationPageElement.getPasswordTxt().sendKeys(pass);
        registrationPageElement.getConfirmPasswordTxt().sendKeys(cpass);
        addAttachment("ScreenShot enterUserInfo");
    }

    @Step("Step to Click Submit")
    public void submitInfo(){
        registrationPageElement.getSubmitBtn().click();
        webDriverWait.until(ExpectedConditions.visibilityOf(registrationConfirmationPageElement.getConfText()));
    }
}
