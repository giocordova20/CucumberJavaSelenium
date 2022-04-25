# Author:
# Date:
@SmokeFeature
Feature: Test login functionality

  @SmokeTest
  Scenario Outline: Test login is successful with valid credentials
    Given user is on login page2
    When user enters <username> and <password>
    And clicks on login button2
    Then user is navigated to the home page2

    Examples:
      | username | password |
      | Garry    | 12345    |
      | Elen     | 12345    |