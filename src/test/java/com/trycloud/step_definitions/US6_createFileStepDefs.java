package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesModulePage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US6_createFileStepDefs {
    FilesModulePage filesModulePage = new FilesModulePage();
    Faker faker = new Faker();
    String fileName="";
    DashboardPage dashboardPage = new DashboardPage();

    @When("User click on {string} module")
    public void user_click_on_module(String moduleName) {
        BrowserUtils.waitFor(3);
        switch (moduleName){
            case "Files":
                dashboardPage.files.click();
                break;
            case "Contacts":
                dashboardPage.contacts.click();
                break;
            case "Talk":
                dashboardPage.talk.click();
                break;
            default:
                System.out.println("Give the right module name");
        }
    }

    @When("Click {string} from + options")
    public void click(String option) {
        filesModulePage.clickOnPlusIconOption(option);
    }

    @When("Write a folder name")
    public void write_a_folder_name() {
        fileName=faker.app().name();
        filesModulePage.fileNameInput.sendKeys(fileName);
        BrowserUtils.waitFor(2);
    }
    @When("Click the + icon on top")
    public void click_the_icon_on_top() {
        BrowserUtils.waitFor(2);
        filesModulePage.plusIcon.click();
    }

    @When("Click submit icon")
    public void click_submit_icon() {
        filesModulePage.submitButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        Assert.assertTrue(filesModulePage.getTextFromAllFiles().contains(fileName));
    }
    @When("Choose a folder from the page")
    public void choose_a_folder_from_the_page() {
        if (filesModulePage.allFolders.isEmpty()){
            filesModulePage.clickOnPlusIconOption("New folder");
            filesModulePage.fileNameInput.sendKeys(faker.app().name());
            filesModulePage.submitButton.click();
        }else {
            filesModulePage.allFolders.get(0).click();
        }
    }
    @When("Click upload file with upload file option")
    public void click_upload_file_with_upload_file_option() {
        fileName = "rKU8iR89_400x400";
        String projectDir = System.getProperty("user.dir");
        //String path = "/Users/nadimavafoeva/IdeaProjects/trycloudAutomation/src/test/resources/files/rKU8iR89_400x400.png";
        System.out.println("projectDir = " + projectDir);
        String file = "src/test/resources/files/rKU8iR89_400x400.png";
        filesModulePage.uploadFileButton.sendKeys(projectDir+"/"+file);
        BrowserUtils.waitFor(4);
    }
}
