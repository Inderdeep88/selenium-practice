package com.newtours;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverManager {
    static String webDriverBasePath= "src/main/resources/";
    public static WebDriver createDriverInstance() {
        long id = Thread.currentThread().threadId();
        System.out.println(id+" CREATING INSTANCE..");
        WebDriver webDriver;
        if (System.getProperty("host") != null && System.getProperty("host").equals("grid")) {
            webDriver = createRemoteWebDriver();
        }
        else {
            webDriver = createLocalWebDriver();
        }
        System.out.println(id+" Created Webdriver instance "+webDriver);
        return webDriver;
    }

    private static WebDriver createLocalWebDriver(){
        WebDriver localWebDriver;
        if (System.getProperty("browser") != null && System.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver", webDriverBasePath + "chromedriver_112");
            System.setProperty("webdriver.chrome.logfile", webDriverBasePath + "chromedriver.log");
            System.setProperty("webdriver.chrome.verboseLogging", "true");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            localWebDriver = new ChromeDriver(options);
        }else if (System.getProperty("browser") != null && System.getProperty("browser").equals("firefox")){
            System.setProperty("webdriver.gecko.driver", webDriverBasePath + "geckodriver");
            localWebDriver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", webDriverBasePath + "chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            localWebDriver = new ChromeDriver(options);
        }
        return localWebDriver;
    }
    private static WebDriver createRemoteWebDriver() {
        MutableCapabilities capabilities ;
        WebDriver remoteWebDriver;

        String url = "http://"+System.getProperty("hubUrl")+":4444/wd/hub";

        if (System.getProperty("browser") != null && System.getProperty("browser").equals("chrome")){
            capabilities = new ChromeOptions();
        } else if (System.getProperty("browser") != null && System.getProperty("browser").equals("firefox")){
            capabilities = new FirefoxOptions();
        } else {
            capabilities = new ChromeOptions();
        }

        try {
            remoteWebDriver = new RemoteWebDriver(new URL(url),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return remoteWebDriver;
    }
}
