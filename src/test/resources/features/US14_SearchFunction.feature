@us_14
Feature:  As a user, I should be able to access search any item/ users from the homepage

  Background:
    Given user on the login page

  Scenario: Verify user can search any files folder users from the search box
    When user click magnifier icon on the right top
    And user search any existing file folder user name
    Then verify the app displays the expected result option

