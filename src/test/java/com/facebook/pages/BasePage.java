package com.facebook.pages;

import com.facebook.utils.PropertyUtil;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import static com.facebook.constants.EnvironmentConstants.*;

public class BasePage {

    static MobileDriver driver;

    public static MobileDriver getDriver() throws MalformedURLException {
        if(PropertyUtil.getProperty(PLATFORM_NAME).equalsIgnoreCase("android"))
            driver = getAndroidDriver();
        else if(PropertyUtil.getProperty(PLATFORM_NAME).equalsIgnoreCase("ios"))
            driver = getiOSDriver();
        else
            throw new RuntimeException("Invalid Platform type-->"+PropertyUtil.getProperty(PLATFORM_NAME));
        return  driver;
    }

    private static AndroidDriver getAndroidDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        AndroidDriver driver = new AndroidDriver(new URL(PropertyUtil.getProperty(APPIUM_SERVER)),capabilities);
        return driver;
    }

    private static IOSDriver getiOSDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        IOSDriver driver = new IOSDriver(new URL(PropertyUtil.getProperty(APPIUM_SERVER)),capabilities);
        return driver;
    }
}
