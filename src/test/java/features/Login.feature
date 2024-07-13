Feature: Login scenarios

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Delete Account
    When The user clicks on SignupLogin button
    And The user enters the name 'loco3' and email 'loco3@test.com' address
    And The user clicks the Signup button
    And The user fills in the details: Title, Name, Email, Password, Date of birth
    And The user selects all checkbox in Enter Account Information
    And The user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And The user clicks the Create Account button
    And The user clicks the Continue button
    And The user clicks the Delete Account button
    Then ACCOUNT DELETED! should be visible

#Otherssssssssssssssssssssssssssss-------------------------------------------------------------------------------------------------

  Scenario: A text on Signup / Login page is visible
    When The user clicks on SignupLogin button
    Then Login to your account should be visible

  Scenario: Successful logout
    When The user clicks on SignupLogin button
    And The user enter the correct email address and password
    And The user clicks the login button
    And The user clicks the Logout button
    Then The user should be navigated to the login page

  Scenario: Successful login
    When The user clicks on SignupLogin button
    And The user enter the correct email address and password
    And The user clicks the login button
    Then Logged in as username should be visible

  Scenario: Unsuccessful login with incorrect credentials
    When The user clicks on SignupLogin button
    And The user enter an incorrect email address and password
    And The user clicks the login button
    Then the error message Your email or password is incorrect! should be visible