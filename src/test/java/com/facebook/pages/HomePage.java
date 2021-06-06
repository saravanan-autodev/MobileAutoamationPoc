package com.facebook.pages;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @AndroidFindBy(xpath="")
    @iOSXCUITFindBy(xpath = "")
    public WebElement createAccountBtn;

    @AndroidFindBy(xpath = "")
    @iOSXCUITFindBy(xpath = "")
    public WebElement loginBtn;

    public HomePage(MobileDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickOnCreateAccountBtn(){
        createAccountBtn.click();
    }

    public void clickOnLoginBtn(){
        loginBtn.click();
    }


}
