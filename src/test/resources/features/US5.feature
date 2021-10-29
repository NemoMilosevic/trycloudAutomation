Feature: Access files module function test
  As a user
  I should be able to able to access to Files module.

  Background:
    Given Login as a user

  Scenario: Verify users can remove a file from favorites.
    When Click action-icon from any file on the page
    And Click “Remove from Favorites” option
    Then Verify that the file is removed from Favorites sub-module’s table.

