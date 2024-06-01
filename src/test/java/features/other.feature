Feature: Home scenarios

  Background:
    Given the user has launched the browser
    And the user navigates to 'https://automationexercise.com/'
    Then the home page should be visible successfully

  Scenario: Home page is loaded successfully
    Then the home page should be visible successfully

  Scenario: Navigate to Signup Page
    When the user clicks on the SignupLogin button
    Then 'New User Signup!' should be visible