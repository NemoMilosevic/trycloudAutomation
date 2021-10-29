Feature: As a user, I should be able to access to Talks module.

  Background:
    Given Login as user

  Scenario: verify users can access to Talks module
    When user Click Talks module
    Then Verify the page title is Talks module’s title

  Scenario: verify users can send message
    When user Click Talks module
    And Search a user from search box on the left
    And Write a message
    And Click submit button
    Then Verify the message is displayed on the conversation log
