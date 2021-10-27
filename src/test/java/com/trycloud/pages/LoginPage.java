package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
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

    public void goTo(){
        Driver.getDriver().get(ConfigurationReader.read("url"));
    }

    public void login(){
        usernameBox.sendKeys(ConfigurationReader.read("username1"));
        passwordBox.sendKeys(ConfigurationReader.read("password"));
        loginBtn.click();
    }

    public void login(String username, String password) {
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
    }

}