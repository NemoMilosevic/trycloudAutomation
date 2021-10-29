package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactModulePage {

    public ContactModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[7]")
    public WebElement contact ;

    @FindBy(xpath = "//*[@id=\"everyone\"]/a/span")
    public WebElement addedContect ;

    @FindBy(xpath = "//*[@id=\"new-contact-button\"]")
    public WebElement newContact ;


    @FindBy(xpath = "//input[@id='contact-fullname']")
    public WebElement name;


    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement phone ;

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement email ;

    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[2]/input")
    public WebElement postOfficeBox ;


   @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[3]/input")
    public WebElement  address  ;


    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[4]/input")
    public WebElement extendedAddress   ;

    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[5]/input")
    public WebElement  postalCode  ;


    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[6]/input")
    public WebElement  city  ;


    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[7]/input")
    public WebElement state   ;


    @FindBy(xpath = "//*[@id=\"app-content-wrapper\"]/div[2]/section/div[3]/div/div[8]/input")
    public WebElement  country  ;



@FindBy(xpath = "//*[@id=\"M2FiYmViMjYtZjYxNy00YTgzLWJkNWEtZTQyNGIzOGU0MDZkfmNvbnRhY3\"]/div[2]")

public WebElement contactName;

}