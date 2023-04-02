package com.newtours.pages;

import com.newtours.WebDriverManager;
import com.newtours.elements.RegistrationConfirmationPageElement;
import com.newtours.elements.RegistrationPageElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.newtours.utils.Utilities.addAttachment;

public class RegistrationPage {

    private RegistrationPageElement registrationPageElement;
    private RegistrationConfirmationPageElement registrationConfirmationPageElement;

    public RegistrationPage(){
        this.registrationPageElement = new RegistrationPageElement();
        this.registrationConfirmationPageElement = new RegistrationConfirmationPageElement();
    }

    @Step("Step to open the web URL")
    public void goTo (WebDriver driver){
        long id = Thread.currentThread().threadId();
        System.out.println("\n"+id+" inside goTo" + driver);
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(registrationPageElement.getFirstNameTxt(driver)));
        addAttachment("ScreenShot after opening URL", driver);
    }

    @Step("Step to Enter the Contact info")
    public void enterContactInfo(String fname, String lname, String phone, String email, WebDriver driver){
        long id = Thread.currentThread().threadId();
        System.out.println(id+" inside enterContactInfo" + driver);
        registrationPageElement.getFirstNameTxt(driver).sendKeys(fname);
        registrationPageElement.getLastNameTxt(driver).sendKeys(lname);
        registrationPageElement.getPhoneTxt(driver).sendKeys(phone);
        registrationPageElement.getEmailTxt(driver).sendKeys(email);
        addAttachment("ScreenShot enterContactInfo", driver);
    }

    @Step("Step to Enter the User info")
    public void enterUserInfo(String uname, String pass, String cpass, WebDriver driver){
        long id = Thread.currentThread().threadId();
        System.out.println(id+" inside enterUserInfo" + driver);
        registrationPageElement.getUsernameTxt(driver).sendKeys(uname);
        registrationPageElement.getPasswordTxt(driver).sendKeys(pass);
        registrationPageElement.getConfirmPasswordTxt(driver).sendKeys(cpass);
        addAttachment("ScreenShot enterUserInfo", driver);
    }

    @Step("Step to Click Submit")
    public void submitInfo(WebDriver driver){
        long id = Thread.currentThread().threadId();
        System.out.println(id+" inside submitInfo" + driver);
        registrationPageElement.getSubmitBtn(driver).click();
        System.out.println(id+" inside submitInfo - After click" + driver);
        new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOf(registrationConfirmationPageElement.getConfText(driver)));
        System.out.println(id+" inside submitInfo - After conftext wait" + driver);
    }
}
