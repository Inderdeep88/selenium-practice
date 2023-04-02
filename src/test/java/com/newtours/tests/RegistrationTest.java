package com.newtours.tests;

import com.newtours.pages.RegistrationConfirmationPage;
import com.newtours.pages.RegistrationPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class RegistrationTest extends BaseTest{

    RegistrationPage registrationPage;
    RegistrationConfirmationPage registrationConfirmationPage;

    @Step("Step to Setup Pages")
    @Override
    void setupPages() {
        this.registrationPage = new RegistrationPage();
        this.registrationConfirmationPage = new RegistrationConfirmationPage();
    }

    @Test
    @Description("Test for Registraion Flow 1")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow1() throws IOException {
        registrationPage.goTo();
        registrationPage.enterContactInfo("Inder","Singh","9654110337","inderdeep88@gmail.com");
        registrationPage.enterUserInfo("isingh88_1","hello@123","hello@123");
        registrationPage.submitInfo();
        String actConfText = registrationConfirmationPage.getConfTextValue();
        String refConfText = "Note: Your user name is isingh88_1.";
        System.out.println("before assertion");
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page");
        System.out.println("after assertion");
    }

    @Test
    @Description("Test for Registraion Flow 2")
    @Severity(SeverityLevel.BLOCKER)
    public void TestRegistrationFlow2() throws IOException {
        registrationPage.goTo();
        registrationPage.enterContactInfo("Gattu","Singh","9654111337","inderdeep88@gmail.com");
        registrationPage.enterUserInfo("isingh88_2","hello@123","hello@123");
        registrationPage.submitInfo();
        String actConfText = registrationConfirmationPage.getConfTextValue();
        String refConfText = "Note: Your user name is isingh88_2.";
        System.out.println("before assertion");
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page");
        System.out.println("after assertion");
    }


}
