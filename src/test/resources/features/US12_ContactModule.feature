

Feature:  As a user, I should be able to access to Contacts module

  Background:
    Given user on the login page
    When Click “Contacts” module

Scenario:  verify users can access to Talks module


    Then Verify the page tile is "Contacts - Trycloud QA" module tile


  @us_12
Scenario:  verify users can add contacts

And Click “New Contact” button
And Fill out the contact info like : Title, Phone, email, address , etc
And Verify the contact name is added to the contact list



