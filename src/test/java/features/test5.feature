Feature: New User Signup with Existing Email

  Scenario: Unsuccessful signup with already registered email
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Navigate to Signup Page
    When I click on "Signup / Login" button
    Then "New User Signup!" should be visible

  Scenario: Unsuccessful signup with already registered email
    When I enter name and an already registered email address
    And  I click the "Signup" button
    Then the error message "Email Address already exist!" should be visible
