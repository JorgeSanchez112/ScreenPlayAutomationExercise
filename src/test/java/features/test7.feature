Feature: Navigate to Test Cases Page

  Background:
    Given the user has launched the browser
    And the user navigates to 'https://automationexercise.com/'
    Then the home page should be visible successfully

  Scenario: Successful navigation to test cases page
    When I click on the "Test Cases" button
    Then the user should be navigated to the test cases page successfully
