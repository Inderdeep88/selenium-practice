package com.newtours.tests;

import com.newtours.WebDriverManager;
import com.newtours.utils.Utilities;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

abstract public class BaseTest {

    public WebDriver driver;
    abstract void setupPages() ;

    @Step("Step to Setup WebDriver")
    public void setupDriver(){
        this.driver = WebDriverManager.getDriverInstance();
    }

    @BeforeTest
    public void setup(){
        setupDriver();
        setupPages();
    }

    @AfterTest
    public void quitDriver() throws FileNotFoundException {
       // Utilities.captureBrowserLogs(LogType.BROWSER);
        // Utilities.captureBrowserLogs(LogType.DRIVER);
        //Utilities.captureWebDriverLogs();
        this.driver.quit();
    }


}
