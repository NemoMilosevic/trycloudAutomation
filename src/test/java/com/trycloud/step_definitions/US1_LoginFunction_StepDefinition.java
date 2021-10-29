package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US1_LoginFunction_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.goTo();
    }
    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
        loginPage.loginWithCredentials(username,password);
    }
    @When("user click login button")
    public void user_click_login_button() {

    }
    @Then("Verify user launched to the dashboard")
    public void verify_user_launched_to_the_dashboard() {
        BrowserUtils.waitFor(4);
        loginPage.isAtLoginPage();
    }
    @Then("TEST user logs out")
    public void test_user_logs_out() {
        loginPage.logout();
    }

    @When("user enter invalid credentials")
    public void user_enter_invalid_credentials() {
       loginPage.loginWithCredentials("abcdfgda","12341wfa");
    }
    @Then("“Wrong username or password.” message should be displayed")
    public void wrong_username_or_password_message_should_be_displayed() {
        loginPage.errorMsgDisplayed();
        //us1 is done
    }




}
