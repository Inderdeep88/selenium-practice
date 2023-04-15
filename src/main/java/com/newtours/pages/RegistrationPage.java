package com.newtours.pages;

import com.newtours.WebDriverManager;
import com.newtours.elements.RegistrationConfirmationPageElement;
import com.newtours.elements.RegistrationPageElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.newtours.utils.Utilities.addAttachment;

public class RegistrationPage extends BasePage{

   // private WebDriver webDriver;
    private RegistrationPageElement registrationPageElement;
    private RegistrationConfirmationPageElement registrationConfirmationPageElement;

    public RegistrationPage(WebDriver webDriver){
        super(webDriver);
        this.registrationPageElement = new RegistrationPageElement(webDriver);
        this.registrationConfirmationPageElement = new RegistrationConfirmationPageElement(webDriver);
        this.webDriver = webDriver;
    }

    @Step("Step to open the web URL")
    public void goTo (){
        long id = Thread.currentThread().threadId();
        super.goTo("https://demo.guru99.com/test/newtours/register.php");
        new WebDriverWait(webDriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(registrationPageElement.getFirstNameTxt()));
        addAttachment(id + " ScreenShot after opening URL "+ webDriver, webDriver);
    }

    @Step("Step to Enter the Contact info")
    public void enterContactInfo(String fname, String lname, String phone, String email){
        long id = Thread.currentThread().threadId();
        System.out.println(id+" inside enterContactInfo" + webDriver + this);
        registrationPageElement.getFirstNameTxt().sendKeys(fname);
        registrationPageElement.getLastNameTxt().sendKeys(lname);
        registrationPageElement.getPhoneTxt().sendKeys(phone);
        registrationPageElement.getEmailTxt().sendKeys(email);
        addAttachment(id +" ScreenShot enterContactInfo " +webDriver, webDriver);
    }

    @Step("Step to Enter the User info")
    public void enterUserInfo(String uname, String pass, String cpass){
        long id = Thread.currentThread().threadId();
        System.out.println(id+" inside enterUserInfo" + webDriver + this);
        registrationPageElement.getUsernameTxt().sendKeys(uname);
        registrationPageElement.getPasswordTxt().sendKeys(pass);
        registrationPageElement.getConfirmPasswordTxt().sendKeys(cpass);
        addAttachment(id+ " ScreenShot enterUserInfo " +webDriver, webDriver);
    }

    @Step("Step to Click Submit")
    public void submitInfo(){
        long id = Thread.currentThread().threadId();
        System.out.println(id+" inside submitInfo" + webDriver + this);
        registrationPageElement.getSubmitBtn().click();
        new WebDriverWait(webDriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(registrationConfirmationPageElement.getConfText()));
    }
}
