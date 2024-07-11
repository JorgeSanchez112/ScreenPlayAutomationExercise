Feature: User Registration

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Enter User Details
    When The user clicks on SignupLogin button
    And The user enters the name 'loco' and email 'loco@test.com' address
    Then is 200