package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {

    public FileUploadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@id='quota']//p")
    public WebElement storage;

    @FindBy(id = "uploadprogressbar")
    public WebElement progressBar;

    @FindBy(css = "#file_upload_start")
    public WebElement fileUpload;

}
