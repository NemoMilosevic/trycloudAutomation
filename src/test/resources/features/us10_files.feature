@us_10
  Feature: As a user, I should be able to access to Files module

    Background:
      Given user on the login page


      Scenario: verify users can change the app Settings
        When user click Settings on the left bottom corner
        Then verify user can click any buttons

      Scenario: verify users see the app storage usage
        When user check the current storage usage
        And user upload a file
        And user refresh the page
        Then verify the storage usage is increased