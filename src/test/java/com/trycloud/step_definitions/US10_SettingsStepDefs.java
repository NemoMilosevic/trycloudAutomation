package com.trycloud.step_definitions;

import com.trycloud.pages.SettingsPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_SettingsStepDefs {

    SettingsPage settingsPage = new SettingsPage();

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
}
