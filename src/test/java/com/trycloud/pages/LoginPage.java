package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy (id = "user")
    private WebElement usernameBox;

    @FindBy (id ="password")
    private WebElement passwordBox;

    @FindBy (id ="submit-form")
    private WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
        Driver.getDriver().get(ConfigurationReader.read("url"));
    }

    public void login(String username, String password){
        this.usernameBox.sendKeys(username);
        this.passwordBox.sendKeys(password);
        this.loginBtn.click();
    }


}