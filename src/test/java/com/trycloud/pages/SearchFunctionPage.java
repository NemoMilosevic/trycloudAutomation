package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionPage {

    @FindBy(xpath = "//*[@class='material-design-icon__svg']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchBox;

    @FindBy(partialLinkText = "Talk")
    public WebElement expectedResult;


    public SearchFunctionPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
