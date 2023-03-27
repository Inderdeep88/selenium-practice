package com.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverManager {
    private static WebDriver webDriver = null;
    static String webDriverBasePath= "/Users/inderdeep.singh/PersonalWorkspace/WebDrivers/";

    public static synchronized WebDriver getDriverInstance()
    {
        if (webDriver == null) {
            System.out.println("CREATING INSTANCE..");
            webDriver = createDriverInstance();
        }
        return webDriver;
    }

    private static WebDriver createDriverInstance(){
        if (System.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver", webDriverBasePath + "chromedriver");
            System.setProperty("webdriver.chrome.logfile", webDriverBasePath + "chromedriver.log");
            System.setProperty("webdriver.chrome.verboseLogging", "true");
            return new ChromeDriver();
        } else if (System.getProperty("browser").equals("firefox")){
            System.setProperty("webdriver.gecko.driver", webDriverBasePath + "geckodriver");
            return new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", webDriverBasePath + "chromedriver");
            return new ChromeDriver();
        }
    }
}
