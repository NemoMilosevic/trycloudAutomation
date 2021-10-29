package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFileToFavoritesPage {

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]")
    public WebElement fileBtn;

    //*[@id="fileList"]/tr[3]/td[2]/a/span[3]/a[2]
    //*[@id="fileList"]/tr[1]/td[1]/a/span[3]/a[2]
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[5]/td[2]/a/span[3]/a[2]")
    public WebElement actionIcon;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[2]/div/ul/li[3]/a/span[2]")
    public WebElement addToFavoritesBtn;

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[3]")
    public WebElement favoritesBtn;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr/td[1]/a/span[1]")
    public WebElement verifyNameText;


    public AddFileToFavoritesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }




}
