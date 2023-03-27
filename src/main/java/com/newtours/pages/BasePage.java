package com.newtours.pages;

import com.newtours.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    protected BasePage(){
        this.webDriver = WebDriverManager.getDriverInstance();
        this.webDriverWait = new WebDriverWait(webDriver,30);
    }
}
