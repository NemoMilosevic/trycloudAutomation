package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {


    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='files']")
    public WebElement files;

    @FindBy(xpath = "//ul[@id='appmenu']//li[@data-id='contacts']")
    public WebElement contacts;

    @FindBy(xpath = "(//li/a[normalize-space()='Talk'])[1]" )
    public WebElement talk;



    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
