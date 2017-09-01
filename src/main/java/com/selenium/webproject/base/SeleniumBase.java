package com.selenium.webproject.base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The base selenium class which creates the driver and holds methods used in all tests extending this class
 */
public class SeleniumBase {
    public final static int WEBDRIVER_TIME_OUT_SECONDS = 15;
    public final static int WEBDRIVER_SLEEP_IN_MILLIS = 100;


    private Logger logger = LoggerFactory.getLogger(SeleniumBase.class);

    public WebDriverWait getWait() {
        return wait;
    }

    private final WebDriverWait wait;

    private WebDriver driver;

    /**
     * uses a property file to grab browser type, the property file can use extended for other purposes
     */
    public SeleniumBase() {

        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream("config.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String BrowserType = prop.getProperty("browsertype");

        if(BrowserType.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
            driver = new FirefoxDriver();
            this.setDriver(driver);
        }else if(BrowserType.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/chromedriver");
            driver = new ChromeDriver();
            this.setDriver(driver);
        }
        this.getDriver().manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, WEBDRIVER_TIME_OUT_SECONDS, WEBDRIVER_SLEEP_IN_MILLIS);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


    public void fillinText(String xPath, String text) {
        this.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath))).sendKeys(text);
    }

    public void clickElement(String xPath) {
        this.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath))).click();
    }

    public void clearElement(String xPath){
        this.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath))).clear();
    }

    public boolean verifyElementExists(String xPath) {

        try {
            WebElement element = this.getElement(xPath);
            if (element != null) {
                logger.debug("FindElementByXpath = true = " + xPath);
                return true;
            } else {
                logger.debug("FindElementByXpath = false = " + xPath);
                return false;
            }
        } catch (NoSuchElementException e) {
            logger.error("FindElementByXpath() = false = " + e.getMessage());
            return false;
        } catch (Exception e) {
            logger.error("FindElementByXpath() = false = " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public WebElement getElement(String xPath) {
        try {
            WebElement element = getWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
            return element;
        } catch (TimeoutException e) {
            logger.error("TimeoutException: Can not find the element {}", xPath);
            return null;
        }
    }

}
