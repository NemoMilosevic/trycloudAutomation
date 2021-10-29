package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "user")
    public WebElement usernameBox;

    @FindBy (id ="password")
    public WebElement passwordBox;

    @FindBy (id ="submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    private WebElement errorMsg;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    private WebElement logoutDrop;

    @FindBy(xpath = "//li[@ data-id='logout']")
    private WebElement logoutBtn;

    public void goTo(){
        Driver.getDriver().get(ConfigurationReader.read("url"));
    }

    public void loginWithCredentials(String username , String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBtn.click();
    }

    public void login(){
        usernameBox.sendKeys(ConfigurationReader.read("username1"));
        passwordBox.sendKeys(ConfigurationReader.read("password"));
        loginBtn.click();
    }

    public void isAtLoginPage() {
            String homePage = "http://qa3.trycloud.net/index.php/apps/dashboard/";

            Assert.assertEquals(homePage, Driver.getDriver().getCurrentUrl());

    }

    public void errorMsgDisplayed() {
        Assert.assertTrue(errorMsg.isDisplayed());
    }

    public void logout(){
        logoutDrop.click();
        logoutBtn.click();
    }





}