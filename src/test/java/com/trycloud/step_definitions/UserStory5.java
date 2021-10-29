package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.MainPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertFalse;

public class UserStory5 {

        FilesPage filesPage = new FilesPage();
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();

        @Given("Login as a user")
        public void login_as_a_user() {
          loginPage.goTo();
          loginPage.login();
        }

        @When("Click action-icon from any file on the page")
        public void click_action_icon_from_any_file_on_the_page() {

            filesPage.clickFilesBtn();
            BrowserUtils.checkVisibilityOfElement(By.xpath("//tbody[@id='fileList']/tr"), 1);
        }

        @When("Click “Remove from Favorites” option")
        public void click_remove_from_favorites_option() {
            filesPage.clickRemoveFromFavorite();
        }

        @Then("Verify that the file is removed from Favorites sub-module’s table.")
        public void verify_that_the_file_is_removed_from_favorites_sub_module_s_table() {
                filesPage.clickFavoriteTab();
                assertFalse(filesPage.checkIsSameFileInFavoriteList());
        }






}
