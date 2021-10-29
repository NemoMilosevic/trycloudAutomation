package com.trycloud.step_definitions;

import com.trycloud.pages.FileUploadPage;
import com.trycloud.pages.SettingsPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_FilesModuleStepDefs {

    SettingsPage settingsPage = new SettingsPage();
    FileUploadPage fileUploadPage = new FileUploadPage();

    @When("user click Settings on the left bottom corner")
    public void userClickSettingsOnTheLeftBottomCorner() {
        settingsPage.filesModule.click();
        settingsPage.settingsButton.click();
    }

    @Then("verify user can click any buttons")
    public void verifyUserCanClickAnyButtons() {
        BrowserUtils.waitFor(2);
        boolean beforeSelect = settingsPage.checkBoxesValue.get(2).isSelected();
        settingsPage.checkBoxesShow.get(2).click();
        BrowserUtils.waitFor(2);
        boolean afterSelect = settingsPage.checkBoxesValue.get(2).isSelected();

        Assert.assertTrue(!beforeSelect==afterSelect);
    }

    @When("user check the current storage usage")
    public void userCheckTheCurrentStorageUsage() {
        SettingsPage settingsPage = new SettingsPage();
        settingsPage.filesModule.click();
        String storageBeforeUpload = fileUploadPage.storage.getText();
        System.out.println("storageBeforeUpload = " + storageBeforeUpload);
        BrowserUtils.waitFor(3);
    }

    @And("user upload a file")
    public void userUploadAFile() {
        String path = "/Users/nemo/IdeaProjects/trycloudAutomation/src/test/resources/files/barCode.jpg";
        fileUploadPage.progressBar.click();
        fileUploadPage.fileUpload.sendKeys(path);
        BrowserUtils.waitFor(3);
    }

    @And("user refresh the page")
    public void userRefreshThePage() {
        Driver.getDriver().navigate().refresh();
    }

    @Then("verify the storage usage is increased")
    public void verifyTheStorageUsageIsIncreased() {
        String storageAfterUpload = fileUploadPage.storage.getText();
        System.out.println("storageAfterUpload = " + storageAfterUpload);
    }

}
