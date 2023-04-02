package com.newtours.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationConfirmationPageElement {

    public WebElement getConfText(WebDriver driver) {
        return driver.findElement(By.xpath("//b[contains(text(),\"Note\")]"));
    }

    public WebElement getFlightsLink(WebDriver driver) {
        return driver.findElement(By.linkText("Flights"));
    }
}
