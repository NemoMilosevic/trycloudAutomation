package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id]")
    public List <WebElement> modules;

    @FindBy (xpath = "//ul[@id='appmenu']/li[@data-id='files']")
    public WebElement filesModule;

    Actions actions = new Actions(Driver.getDriver());

    public void goToFiles(){
        actions.moveToElement(filesModule).pause(1000).perform();
        BrowserUtils.waitFor(3);
    }






}
