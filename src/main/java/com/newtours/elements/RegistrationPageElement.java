package com.newtours.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageElement {

    public WebElement getFirstNameTxt(WebDriver driver) {
        return driver.findElement(By.name("firstName"));
    }

    public WebElement getLastNameTxt(WebDriver driver) {
        return driver.findElement(By.name("lastName"));
    }

    public WebElement getPhoneTxt(WebDriver driver) {
        return driver.findElement(By.name("phone"));
    }

    public WebElement getEmailTxt(WebDriver driver) {
        return driver.findElement(By.name("userName"));
    }

    public WebElement getUsernameTxt(WebDriver driver) {
        return driver.findElement(By.name("email"));
    }

    public WebElement getPasswordTxt(WebDriver driver) {
        return driver.findElement(By.name("password"));
    }

    public WebElement getConfirmPasswordTxt(WebDriver driver) {
        return driver.findElement(By.name("confirmPassword"));
    }

    public WebElement getSubmitBtn(WebDriver driver) {
        return driver.findElement(By.name("submit"));
    }

}
