Feature: User Registration on Automation Exercise Website

  Background:
    Given the user has launched the browser
    And the user navigates to 'https://automationexercise.com/'
    Then the home page should be visible successfully

  Scenario: Enter User Details
    When the user clicks on the SignupLogin button
    And the user enters the name 'loco' and email 'loco@test.com' address
    And the user clicks the Signup button
    Then ENTER ACCOUNT INFORMATION should be visible

  Scenario: Fill Account Information
    When the user clicks on the SignupLogin button
    And the user enters the name 'loco1' and email 'loco1@test.com' address
    And the user clicks the Signup button
    And the user fills in the details: Title, Name, Email, Password, Date of birth
    And the user selects all checkbox in Enter Account Information
    And the user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And the user clicks the Create Account button
    Then ACCOUNT CREATED! should be visible

  Scenario: Complete Registration
    When the user clicks on the SignupLogin button
    And the user enters the name 'loco2' and email 'loco2@test.com' address
    And the user clicks the Signup button
    And the user fills in the details: Title, Name, Email, Password, Date of birth
    And the user selects all checkbox in Enter Account Information
    And the user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And the user clicks the Create Account button
    And the user clicks the Continue button
    Then Logged in as username should be visible

#Otherssssssssssssssssssssssssssss-------------------------------------------------------------------------------------------------

  Scenario: Navigate to Signup Page
    When the user clicks on the SignupLogin button
    Then 'New User Signup!' should be visible

  Scenario: Navigate to Signup Page
    When I click on "Signup / Login" button
    Then "New User Signup!" should be visible

  Scenario: Unsuccessful signup with already registered email
    When I enter name and an already registered email address
    And  I click the "Signup" button
    Then the error message "Email Address already exist!" should be visible

  Scenario: Signup and login
    When I click the "Signup / Login" button
    And I fill all details in Signup and create an account
    Then "ACCOUNT CREATED!" should be visible
    And I click the "Continue" button
    And "Logged in as username" should be visible at the top

  Scenario: Create an account
    When I click the "Signup / Login" button
    And I fill all details in Signup and create an account
    Then "ACCOUNT CREATED!" should be visible
    And I click the "Continue" button
    And "Logged in as username" should be visible at the top