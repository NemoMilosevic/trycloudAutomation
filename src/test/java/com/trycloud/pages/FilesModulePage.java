package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FilesModulePage {


    @FindBy(xpath = "//td[@class]//a//span[contains(@class,'nametext')]/span[1]")
    ////td//a//span/span[1] // //td//a//span[contains(@class,'nametext')] //td//a//span[@class='nametext']
    public List<WebElement> allFiles;


    @FindBy(css = "#file_upload_start")////div[@class='newFileMenu popovermenu bubble menu open menu-left']//span[text()='Upload file']
    public WebElement uploadFileButton;

    @FindBy(xpath = "//div/a[@class='button new']")
    public WebElement plusIcon;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement fileNameInput;

    @FindBy(xpath = "//form[@class='filenameform']/input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@style='background-image:url(/index.php/apps/theming/img/core/filetypes/folder.svg?v=0);']")
    public List<WebElement> allFolders;


    public List<String> getTextFromAllFiles() {
        List<String> listOfFiles = new ArrayList<>();
        for (WebElement eachFile : allFiles) {
            if (!eachFile.getText().isEmpty()){
                if (eachFile.getText().contains(".")) {
                    listOfFiles.add(eachFile.getText().substring(0, eachFile.getText().indexOf(".")).trim());
                } else {
                    listOfFiles.add(eachFile.getText().trim());
                }

            }}
        return listOfFiles;
    }






    public void clickOnPlusIconOption(String option){
        Driver.getDriver().findElement(By.xpath("//div[@class='newFileMenu popovermenu bubble menu open menu-left']//span[text()='"+option+"']")).click();
    }


    public FilesModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
