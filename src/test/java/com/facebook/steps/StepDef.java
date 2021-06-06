package com.facebook.steps;

import com.facebook.pages.BasePage;
import com.facebook.pages.HomePage;
import io.appium.java_client.MobileDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.net.MalformedURLException;

public class StepDef extends BasePage {

    static MobileDriver driver;
    static HomePage homePage;

    @Before
    public static void initDriver() throws MalformedURLException {
        driver = getDriver();
        homePage = new HomePage(driver);
    }

    @After
    public static void afterScenarioAction(){
        driver.closeApp();
    }

}
