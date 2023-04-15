package com.newtours.tests;

import com.newtours.pages.RegistrationConfirmationPage;
import com.newtours.pages.RegistrationPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class RegistrationTest extends BaseTest {

    RegistrationPage registrationPage;
    RegistrationConfirmationPage registrationConfirmationPage;

    @Override
    public void setupPages() {
        this.registrationPage = new RegistrationPage();
        this.registrationConfirmationPage = new RegistrationConfirmationPage();
        long id = Thread.currentThread().threadId();
        System.out.println(id+ " try bro");
    }

    @Test
    @Description("Test for Registration Flow 1")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow1() {
        long id = Thread.currentThread().threadId();
        registrationPage.goTo(webDriverThreadLocal.get());
        registrationPage.enterContactInfo("Inder1","Singh1","9654110337","inderdeep88@gmail.com",webDriverThreadLocal.get());
        registrationPage.enterUserInfo("isingh88_1","hello@123","hello@123",webDriverThreadLocal.get());
        registrationPage.submitInfo(webDriverThreadLocal.get());
        String actConfText = registrationConfirmationPage.getConfTextValue(webDriverThreadLocal.get());
        String refConfText = "Note: Your user name is isingh88_1.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page");
    }

    @Test
    @Description("Test for Registration Flow 2")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow2() {
        long id = Thread.currentThread().threadId();
        registrationPage.goTo(webDriverThreadLocal.get());
        registrationPage.enterContactInfo("Inder2","Singh2","9654110337","inderdeep88@gmail.com",webDriverThreadLocal.get());
        registrationPage.enterUserInfo("isingh88_2","hello@123","hello@123",webDriverThreadLocal.get());
        registrationPage.submitInfo(webDriverThreadLocal.get());
        String actConfText = registrationConfirmationPage.getConfTextValue(webDriverThreadLocal.get());
        String refConfText = "Note: Your user name is isingh88_2.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page");
    }

    @Test
    @Description("Test for Registration Flow 3")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow3() {
        long id = Thread.currentThread().threadId();
        registrationPage.goTo(webDriverThreadLocal.get());
        registrationPage.enterContactInfo("Inder3","Singh3","9654110337","inderdeep88@gmail.com",webDriverThreadLocal.get());
        registrationPage.enterUserInfo("isingh88_3","hello@123","hello@123",webDriverThreadLocal.get());
        registrationPage.submitInfo(webDriverThreadLocal.get());
        String actConfText = registrationConfirmationPage.getConfTextValue(webDriverThreadLocal.get());
        String refConfText = "Note: Your user name is isingh88_3.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page");
    }

    @Test
    @Description("Test for Registration Flow 4")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow4() {
        long id = Thread.currentThread().threadId();
        registrationPage.goTo(webDriverThreadLocal.get());
        registrationPage.enterContactInfo("Inder4","Singh4","9654110337","inderdeep88@gmail.com",webDriverThreadLocal.get());
        registrationPage.enterUserInfo("isingh88_4","hello@123","hello@123",webDriverThreadLocal.get());
        registrationPage.submitInfo(webDriverThreadLocal.get());
        String actConfText = registrationConfirmationPage.getConfTextValue(webDriverThreadLocal.get());
        String refConfText = "Note: Your user name is isingh88_4.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page");
    }

    @Test
    @Description("Test for Registration Flow 5")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow5() {
        long id = Thread.currentThread().threadId();
        registrationPage.goTo(webDriverThreadLocal.get());
        registrationPage.enterContactInfo("Inder5","Singh5","9654110337","inderdeep88@gmail.com",webDriverThreadLocal.get());
        registrationPage.enterUserInfo("isingh88_5","hello@123","hello@123",webDriverThreadLocal.get());
        registrationPage.submitInfo(webDriverThreadLocal.get());
        String actConfText = registrationConfirmationPage.getConfTextValue(webDriverThreadLocal.get());
        String refConfText = "Note: Your user name is isingh88_5.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page");
    }


}
