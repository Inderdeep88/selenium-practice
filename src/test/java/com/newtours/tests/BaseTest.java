package com.newtours.tests;

import com.newtours.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.newtours.utils.Utilities.addAttachment;

public abstract class BaseTest {

    WebDriver webDriver;
    ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    abstract public void setupPages();

    @BeforeMethod
    @Step("Step to Setup Driver")
    public void createDriver(){
        long id = Thread.currentThread().threadId();
        webDriverThreadLocal.set(WebDriverManager.createDriverInstance());
        webDriver = webDriverThreadLocal.get();
        System.out.println(id + " creating WTL " +webDriverThreadLocal.get());
        System.out.println(id + " creating normal WD " +webDriver);
        setupPages();
    }

    @AfterMethod
    @Step("Step to Quit Driver")
    public void quitDriver() {
        long id = Thread.currentThread().threadId();
        addAttachment("ScreenShot before Quit", webDriverThreadLocal.get());
        System.out.println(id + " quiting  WTL " +webDriverThreadLocal.get());
        System.out.println(id + " quiting normal WD" +webDriver);
        webDriverThreadLocal.get().quit();
    }

}
