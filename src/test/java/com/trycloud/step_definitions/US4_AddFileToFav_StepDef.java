package com.trycloud.step_definitions;

import com.trycloud.pages.AddFileToFavoritesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import java.time.format.SignStyle;

public class US4_AddFileToFav_StepDef {


    AddFileToFavoritesPage addFile = new AddFileToFavoritesPage();

 //   @Given("user on the login page")
 //   public void user_on_the_login_page() {
     //   LoginPage loginPage = new LoginPage();
      //  Driver.getDriver().get("http://qa3.trycloud.net/");
     //   loginPage.login("User12","Userpass123");
    //    loginPage.goTo();
      //  loginPage.login(ConfigurationReader.read("username1"), ConfigurationReader.read("password"));
     //   loginPage.login("User12","Userpass123");

  //  }

    @When("user is at file page")
    public void userIsAtFilePage() {
       addFile.fileBtn.click();
    }

    @When("click action-icon from any file on the page")
    public void click_action_icon_from_any_file_on_the_page() {
        addFile.actionIcon.click();
    }
    @When("choose “Add to Favorites” option")
    public void choose_add_to_favorites_option() {
        addFile.addToFavoritesBtn.click();
    }
    @When("click “Favorites” sub-module on the lest side")
    public void click_favorites_sub_module_on_the_lest_side() {
        addFile.favoritesBtn.click();

    }
    @Then("verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        String expectedResult = "http://qa3.trycloud.net/index.php/apps/files/?dir=/&view=favorites";
        String actualResult = Driver.getDriver().getCurrentUrl();

        assertEquals(expectedResult, actualResult);

        System.out.println("addFile.verifyNameText.isDisplayed() = " + addFile.verifyNameText.isDisplayed());


    }



}
