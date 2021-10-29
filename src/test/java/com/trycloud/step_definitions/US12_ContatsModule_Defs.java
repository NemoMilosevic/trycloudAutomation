package com.trycloud.step_definitions;

import com.github.javafaker.Faker;
import com.trycloud.pages.ContactModulePage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class US12_ContatsModule_Defs {

    @When("Click “Contacts” module")
    public void click_contacts_module() throws InterruptedException {

        ContactModulePage contacts = new ContactModulePage();
        BrowserUtils.waitFor(5);
        contacts.contact.click();

    }


    @Then("Verify the page tile is {string} module tile")
    public void verify_the_page_tile_is_module_tile(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }



    @Given("Click “New Contact” button")
    public void click_new_contact_button() {


        ContactModulePage newContactsBtn = new ContactModulePage();
        newContactsBtn.newContact.click();
        BrowserUtils.waitFor(6);


    }


    @Given("Fill out the contact info like : Title, Phone, email, address , etc")
    public void fill_out_the_contact_info_like_title_phone_email_address_etc() throws InterruptedException {

        Faker faker = new Faker();



        ContactModulePage contactModulePage = new ContactModulePage();


        contactModulePage.name.clear();
        contactModulePage.name.sendKeys("Gurkan G. Bilal");
        contactModulePage.phone.sendKeys(faker.phoneNumber().cellPhone());

        contactModulePage.email.sendKeys("tr19@gmail.com");

        contactModulePage.postOfficeBox.sendKeys(faker.address().zipCode());

        contactModulePage.address.sendKeys(faker.address().fullAddress());

        contactModulePage.extendedAddress.sendKeys(faker.address().fullAddress());

        contactModulePage.postalCode.sendKeys(faker.address().zipCode());

        contactModulePage.city.sendKeys(faker.address().city());

        contactModulePage.state.sendKeys(faker.address().state());

        contactModulePage.country.sendKeys(faker.address().country());
        Thread.sleep(3000);

    }
    @Given("Verify the contact name is added to the contact list")
    public void verify_the_contact_name_is_added_to_the_contact_list() {


        ContactModulePage contactName = new ContactModulePage();

        String expected =  contactName.contactName.getText();

        String actual = "Gurkan G. Bilal";

        Assert.assertEquals(expected,actual);


    }



}




