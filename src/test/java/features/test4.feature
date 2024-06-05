Feature: User Login and Logout

  Scenario: Successful login and logout
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Successful login and logout
    When I click on "Signup / Login" button
    Then "Login to your account" should be visible

  Scenario: Successful login
    When I enter the correct email address and password
    And I click the "login" button
    Then "Logged in as username" should be visible

  Scenario: Successful logout
    When I click the "Logout" button
    Then the user should be navigated to the login page