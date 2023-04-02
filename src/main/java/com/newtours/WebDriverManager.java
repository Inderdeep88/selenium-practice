package com.newtours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

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

    private static WebDriver createDriverInstance() {
        if (System.getProperty("host") != null && System.getProperty("host").equals("grid")) {
            return createRemoteWebDriver();
        }
        else {
            return createLocalWebDriver();
        }
    }

    private static WebDriver createLocalWebDriver(){
        WebDriver localWebDriver;
        if (System.getProperty("browser") != null && System.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver", webDriverBasePath + "chromedriver");
            System.setProperty("webdriver.chrome.logfile", webDriverBasePath + "chromedriver.log");
            System.setProperty("webdriver.chrome.verboseLogging", "true");
            localWebDriver = new ChromeDriver();
        }else if (System.getProperty("browser") != null && System.getProperty("browser").equals("firefox")){
            System.setProperty("webdriver.gecko.driver", webDriverBasePath + "geckodriver");
            localWebDriver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", webDriverBasePath + "chromedriver");
            localWebDriver = new ChromeDriver();
        }
        return localWebDriver;
    }
    private static WebDriver createRemoteWebDriver() {
        DesiredCapabilities dc = null;
        WebDriver remoteWebDriver;
        String url = "http://"+System.getProperty("hubUrl")+":4444/wd/hub";

        if (System.getProperty("browser") != null && System.getProperty("browser").equals("chrome")){
            dc = DesiredCapabilities.chrome();

        } else if (System.getProperty("browser") != null && System.getProperty("browser").equals("firefox")){
            dc = DesiredCapabilities.firefox();
        }

        try {
            remoteWebDriver = new RemoteWebDriver(new URL(url),dc);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return remoteWebDriver;
    }
}
