@ui
Feature: As a user, I should be able to access to Files module - Create file

  Background:
    Given user on the login page
    And User click on "Files" module

  Scenario: Verify users can create a folder
    When Click the + icon on top
    And Click "New folder" from + options
    And Write a folder name
    And Click submit icon
    Then Verify the file is displayed on the page

  Scenario: Verify users can upload a file inside a folder
    When Choose a folder from the page
    And Click the + icon on top
    And Click upload file with upload file option
    Then Verify the file is displayed on the page