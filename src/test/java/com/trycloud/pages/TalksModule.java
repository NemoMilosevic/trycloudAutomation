package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TalksModule {


    @FindBy(xpath = "(//li[@data-id='spreed'])[1]")
    private WebElement talkBtn;

    @FindBy(partialLinkText = "talk - Trycloud")
    private WebElement title;

    @FindBy(xpath = "//input[@type='text']" )
    private WebElement searchBox;



    public TalksModule(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void TalkBtn(){
        talkBtn.click();
    }

    public void verifyTitle(){
        String expected = "Talk - Trycloud QA";
        String actual = Driver.getDriver().getTitle();

        assertEquals(expected,actual);

    }

    public void searchBoxClick(){
        searchBox.click();
    }

    public void userName(){
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("admin" );
        Driver.getDriver().findElement(By.xpath("//span[@class='acli__content__line-one__title']")).click();
    }

    public void sendMessage(String message){
        Driver.getDriver().findElement(By.xpath("//div[@class='new-message-form__advancedinput']")).sendKeys(message);
    }

    public void submitBtn(){
        Driver.getDriver().findElement(By.xpath("//button[@class='new-message-form__button submit icon-confirm-fade']")).click();
    }

    public void verifyMessageIsDisplayed(){
                assertTrue(Driver.getDriver().findElement(By.xpath("//div[@class='message']")).isDisplayed());
    }


}