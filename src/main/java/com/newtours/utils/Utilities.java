package com.newtours.utils;

import com.newtours.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;

public class Utilities {

    static WebDriver driver = WebDriverManager.getDriverInstance();

    public static void addAttachment(String name) {
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    public static void captureBrowserLogs(String logType) {
        LogEntries logEntries = driver.manage().logs().get(logType);
        StringBuilder logs = new StringBuilder();

        for (org.openqa.selenium.logging.LogEntry entry : logEntries) {
            logs.append(new Date(entry.getTimestamp()) + " "
                    + entry.getLevel() + " " + entry.getMessage());
            logs.append(System.lineSeparator());
        }
        Allure.addAttachment(logType + " Logs :", String.valueOf(logs));
    }

    public static void captureWebDriverLogs() throws FileNotFoundException {
        Allure.addAttachment( "WebDriver Logs :", new FileInputStream("/Users/inderdeep.singh/PersonalWorkspace/WebDrivers/chromedriver.log"));
    }

}
