package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.MainPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UserStory2 {

        LoginPage page = new LoginPage();
        MainPage mainPage = new MainPage();

    @Given("user at the login page")
    public void user_at_the_login_page() {
        page.goTo();

    }


    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModules) {
        System.out.println("expectedModules = " + expectedModules);
        //System.out.println("mainPage.modules.size() = " + mainPage.modules.size());
        List<String> actualModules =new ArrayList<>();

        mainPage.goToFiles();
        for (WebElement module : mainPage.modules) {
            actualModules.add(module.getText());
        }

        System.out.println("actualModules = " + actualModules);

        Assert.assertEquals("Names of the module do not match",expectedModules,actualModules);
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
        page.login();
        BrowserUtils.waitFor(3);
    }
}
