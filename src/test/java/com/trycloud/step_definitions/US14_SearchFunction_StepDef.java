package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.SearchFunctionPage;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class US14_SearchFunction_StepDef {



    @Given("user on the login page")
    public void user_on_the_login_page() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login();



    }
    @When("user click magnifier icon on the right top")
    public void user_click_magnifier_icon_on_the_right_top()  {
        SearchFunctionPage searchFunctionPage = new SearchFunctionPage();
        searchFunctionPage.searchIcon.click();



    }


    @When("user search any existing file folder user name")
    public void user_search_any_existing_file_folder_user_name() {
        SearchFunctionPage searchFunctionPage = new SearchFunctionPage();
       searchFunctionPage.searchBox.sendKeys("Talk", Keys.ENTER);

    }



    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {
        SearchFunctionPage searchFunctionPage = new SearchFunctionPage();
        assertTrue(searchFunctionPage.expectedResult.isDisplayed());


    }



}
