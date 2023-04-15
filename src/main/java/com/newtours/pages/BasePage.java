package com.newtours.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.newtours.utils.Utilities.addAttachment;

public class BasePage {

    WebDriver webDriver;

    BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @Step("Step to open the web URL")
    public void goTo (String url){
        long id = Thread.currentThread().threadId();
        System.out.println("\n"+id+" inside goTo" + webDriver + this);
        webDriver.get(url);
    }

}
