Feature: Logging into TryCloud app
  As a user
  I should be able to login to TryCloud app

  #Background:
   #Given user on the login page http://qa3.trycloud.net/

  Scenario Outline: Login with valid credentials
  Given user is at TryCloud login page
  When user use username <username> and passcode <password>
  Then user should be at dashboard page
  Examples:
  | username | password    |
  | User12   | Userpass123 |
  | User42   | Userpass123 |
  | User72   | Userpass123 |
  | User102  | Userpass123 |