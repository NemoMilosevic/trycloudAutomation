package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TalksModule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US11_TalksModule_StepDefs {

    TalksModule talksModule = new TalksModule();

    @Given("Login as user")
    public void login_as_user() {
        new LoginPage().goTo();
        new LoginPage().login();
    }


    @When("user Click Talks module")
    public void user_click_talks_module() {
        talksModule.TalkBtn();
    }

    @Then("Verify the page title is Talks module’s title")
    public void verify_the_page_title_is_talks_module_s_title() {
        talksModule.verifyTitle();
    }

    @When("Search a user from search box on the left")
    public void search_a_user_from_search_box_on_the_left() {
        talksModule.searchBoxClick();
        talksModule.userName();
    }
    @When("Write a message")
    public void write_a_message() {
        talksModule.sendMessage("This is for testing");
    }
    @When("Click submit button")
    public void click_submit_button() {
        talksModule.submitBtn();
    }
    @Then("Verify the message is displayed on the conversation log")
    public void verify_the_message_is_displayed_on_the_conversation_log() {
        talksModule.verifyMessageIsDisplayed();
    }
// its done


}