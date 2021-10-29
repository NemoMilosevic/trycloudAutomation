package com.trycloud.pages;

import com.github.javafaker.Faker;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class FilesPage {

    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[normalize-space(.)='Files']/..")
    public WebElement filesBtn;

    public void clickFilesBtn() {
        filesBtn.click();
        BrowserUtils.waitFor(3);
    }


    public boolean isFavoriteFile(String fileName) {
        boolean result = true;
        try {
            String sXpath = "//tr[@data-file='" + fileName + "']//span[.='Favorited']";
            Driver.getDriver().findElement(By.xpath(sXpath)).getText().equals("Favorited");
        } catch (Exception e) {
            result = false;
            System.out.println("Attention: No Favorite files in the list, please add favorite file first.");
            throw e;
        }
        return result;
    }


    @FindBy(xpath = "//li[@class=' action-favorite-container']")
    WebElement removeFromFavorite;

    @FindBy(id = "view13-input-folder")
    public WebElement newFolderInputNameBox;

    @FindBy(xpath = "//tbody[@id='fileList']/tr")
    public List<WebElement> fileList;


    @FindBy(xpath = "//div[@id='app-content-favorites']//tbody[@id='fileList']/tr")
    List<WebElement> allFavoriteFilesList;


    public static String removedFileName;

    public void clickRemoveFromFavorite(){//issue method, need modify
        for (WebElement eachFile : fileList) {
            BrowserUtils.waitFor(3);
            removedFileName = eachFile.getAttribute("data-file");
            if (isFavoriteFile(removedFileName)){
                String fileNameXpath="//tr[@data-file='"+removedFileName+"']//span[.='Actions']/..";
                Driver.getDriver().findElement(By.xpath(fileNameXpath)).click();
                removeFromFavorite.click();
                System.out.println("Removed file name: "+removedFileName);
                break;
            }
        }

    }



    @FindBy(xpath = "//a[.='Favorites']")
    WebElement favoriteTab;

    public void clickFavoriteTab(){
        BrowserUtils.waitFor(3);
        favoriteTab.click();
    }

    public boolean checkIsSameFileInFavoriteList(){
        favoriteList();
        BrowserUtils.waitFor(1);
        System.out.println("Favorite list: "+favoriteList());
        return favoriteList().contains(removedFileName);
    }

    public List<String> favoriteList(){
        List<String> favoriteFileNameList = new ArrayList<>();
        for (WebElement each : allFavoriteFilesList) {
            favoriteFileNameList.add( each.getAttribute("data-file"));
        }
        return favoriteFileNameList;
    }

























}
