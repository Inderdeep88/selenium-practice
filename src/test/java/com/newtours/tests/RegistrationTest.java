package com.newtours.tests;

import com.newtours.PageManager;
import com.newtours.utils.Log;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends BaseTest {

    @Test
    @Description("Test for Registration Flow 1")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow1() {
        Log.info("Start of TestRegistrationFlow1");
        PageManager pageManager = new PageManager(getWebDriver());
        pageManager.getRegistrationPage().open();
        pageManager.getRegistrationPage().enterContactInfo("Inder1","Singh1","9654110337","inderdeep88@gmail.com");
        pageManager.getRegistrationPage().enterUserInfo("isingh88_1","hello@123","hello@123");
        pageManager.getRegistrationPage().submitInfo();
        String actConfText = pageManager.getRegistrationConfirmationPage().getConfTextValue();
        String refConfText = "Note: Your user name is isingh88_1.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page "+getWebDriver());
    }

    @Test
    @Description("Test for Registration Flow 2")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow2() {
        Log.info("Start of TestRegistrationFlow2");
        PageManager pageManager = new PageManager(getWebDriver());
        pageManager.getRegistrationPage().open();
        pageManager.getRegistrationPage().enterContactInfo("Inder2","Singh2","9654110337","inderdeep88@gmail.com");
        pageManager.getRegistrationPage().enterUserInfo("isingh88_2","hello@123","hello@123");
        pageManager.getRegistrationPage().submitInfo();
        String actConfText = pageManager.getRegistrationConfirmationPage().getConfTextValue();
        String refConfText = "Note: Your user name is isingh88_2.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page "+ getWebDriver());
    }


    @Test
    @Description("Test for Registration Flow 3")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow3() {
        Log.info("Start of TestRegistrationFlow3");
        PageManager pageManager = new PageManager(getWebDriver());
        pageManager.getRegistrationPage().open();
        pageManager.getRegistrationPage().enterContactInfo("Inder3","Singh3","9654110337","inderdeep88@gmail.com");
        pageManager.getRegistrationPage().enterUserInfo("isingh88_3","hello@123","hello@123");
        pageManager.getRegistrationPage().submitInfo();
        String actConfText = pageManager.getRegistrationConfirmationPage().getConfTextValue();
        String refConfText = "Note: Your user name is isingh88_3.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page "+ getWebDriver());
    }

    @Test
    @Description("Test for Registration Flow 4")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow4() {
        Log.info("Start of TestRegistrationFlow4");
        PageManager pageManager = new PageManager(getWebDriver());
        pageManager.getRegistrationPage().open();
        pageManager.getRegistrationPage().enterContactInfo("Inder4","Singh4","9654110337","inderdeep88@gmail.com");
        pageManager.getRegistrationPage().enterUserInfo("isingh88_4","hello@123","hello@123");
        pageManager.getRegistrationPage().submitInfo();
        String actConfText = pageManager.getRegistrationConfirmationPage().getConfTextValue();
        String refConfText = "Note: Your user name is isingh88_4.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page "+ getWebDriver());
    }
    @Test
    @Description("Test for Registration Flow 5")
    @Severity(SeverityLevel.CRITICAL)
    public void TestRegistrationFlow5() {
        Log.info("Start of TestRegistrationFlow5");
        PageManager pageManager = new PageManager(getWebDriver());
        pageManager.getRegistrationPage().open();
        pageManager.getRegistrationPage().enterContactInfo("Inder5","Singh5","9654110337","inderdeep88@gmail.com");
        pageManager.getRegistrationPage().enterUserInfo("isingh88_5","hello@12","hello@123");
        pageManager.getRegistrationPage().submitInfo();
        String actConfText = pageManager.getRegistrationConfirmationPage().getConfTextValue();
        String refConfText = "Note: Your user name is isingh88_5.";
        Assert.assertEquals(actConfText, refConfText,"User Name miss match on Confirmation page "+ getWebDriver());
    }
}
