package com.newtours.tests;

import com.newtours.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    abstract public void setupPages();

    @BeforeMethod
    @Step("Step to Setup Driver")
    public void createDriver(){
        long id = Thread.currentThread().threadId();
        System.out.println("Before test-method. Thread id is: " + id);
        webDriverThreadLocal.set(WebDriverManager.createDriverInstance());
        setupPages();
    }

    @AfterMethod
    @Step("Step to Quit Driver")
    public void quitDriver() {
        long id = Thread.currentThread().threadId();
        System.out.println("QuitDriver method. Thread id is: " + id);
        webDriverThreadLocal.get().quit();
    }

}
