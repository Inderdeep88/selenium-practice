package com.newtours.elements;

import com.newtours.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationConfirmationPageElement {

    WebDriver driver ;

    public RegistrationConfirmationPageElement() {
        this.driver = WebDriverManager.getDriverInstance();
    }

    public WebElement getConfText() {
        return driver.findElement(By.xpath("//b[contains(text(),\"Note\")]"));
    }

    public WebElement getFlightsLink() {
        return driver.findElement(By.linkText("Flights"));
    }
}
