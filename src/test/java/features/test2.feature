Feature: User Login and Account Deletion

  Scenario: Successful login and account deletion
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    When I click on "Signup / Login" button
    Then "Login to your account" should be visible
    When I enter the correct email address and password
    And I click the "login" button
    Then "Logged in as username" should be visible
    When I click the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible