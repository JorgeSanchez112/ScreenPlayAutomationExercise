Feature: Navigate to Test Cases Page

  Scenario: Successful navigation to test cases page
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    When I click on the "Test Cases" button
    Then the user should be navigated to the test cases page successfully
