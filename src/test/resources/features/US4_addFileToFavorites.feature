@us4
Feature: Add file to favorites

  As a user,
  I should be able to add file to favorites

  Background:
  Given user on the login page

  Scenario: user can add a file to favorites
    Given user is at file page
    When click action-icon from any file on the page
    And choose “Add to Favorites” option
    And click “Favorites” sub-module on the lest side
    Then verify the chosen file is listed on the table

