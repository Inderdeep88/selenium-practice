package com.newtours.elements;

import com.newtours.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageElement {

    WebDriver driver;

    public RegistrationPageElement(){
        this.driver = WebDriverManager.getDriverInstance();
    }

    public WebElement getFirstNameTxt() {
        return driver.findElement(By.name("firstName"));
    }

    public WebElement getLastNameTxt() {
        return driver.findElement(By.name("lastName"));
    }

    public WebElement getPhoneTxt() {
        return driver.findElement(By.name("phone"));
    }

    public WebElement getEmailTxt() {
        return driver.findElement(By.name("userName"));
    }

    public WebElement getUsernameTxt() {
        return driver.findElement(By.name("email"));
    }

    public WebElement getPasswordTxt() {
        return driver.findElement(By.name("password"));
    }

    public WebElement getConfirmPasswordTxt() {
        return driver.findElement(By.name("confirmPassword"));
    }

    public WebElement getSubmitBtn() {
        return driver.findElement(By.name("submit"));
    }

}
