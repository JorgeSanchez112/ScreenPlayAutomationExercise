Feature: User Login with Incorrect Credentials

  Scenario: Unsuccessful login with incorrect credentials
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario:  A text on Signup / Login page is visible
    When I click on "Signup / Login" button
    Then "Login to your account" should be visible

  Scenario: Unsuccessful login with incorrect credentials
    When I enter an incorrect email address and password
    And I click the "login" button
    Then the error message "Your email or password is incorrect!" should be visible