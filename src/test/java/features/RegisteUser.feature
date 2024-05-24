Feature: User Registration on Automation Exercise Website

  Background:
    Given the user has launched the browser
    And the user navigates to 'https://automationexercise.com/'
    Then the home page should be visible successfully

  Scenario: Navigate to Signup Page
    When the user clicks on the 'SignupLogin' button
    Then 'New User Signup!' should be visible

  Scenario: Enter User Details
    When the user clicks on the 'SignupLogin' button
    And the user enters the name and email address
    And the user clicks the 'Signup' button
    Then 'ENTER ACCOUNT INFORMATION' should be visible

  Scenario: Fill Account Information
    When the user clicks on the 'SignupLogin' button
    And the user enters the name and email address
    And the user clicks the 'Signup' button
    And the user fills in the details: Title, Name, Email, Password, Date of birth
    And the user selects the checkbox 'Sign up for our newsletter!'
    And the user selects the checkbox 'Receive special offers from our partners!'
    And the user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And the user clicks the 'Create Account' button
    Then 'ACCOUNT CREATED!' should be visible

  Scenario: Complete Registration
    When the user clicks on the 'SignupLogin' button
    And the user enters the name and email address
    And the user clicks the 'Signup' button
    And the user fills in the details: Title, Name, Email, Password, Date of birth
    And the user selects the checkbox 'Sign up for our newsletter!'
    And the user selects the checkbox 'Receive special offers from our partners!'
    And the user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And the user clicks the 'Create Account' button
    When the user clicks the 'Continue' button
    Then 'Logged in as username' should be visible

  Scenario: Delete Account
    When the user clicks on the 'SignupLogin' button
    And the user enters the name and email address
    And the user clicks the 'Signup' button
    And the user fills in the details: Title, Name, Email, Password, Date of birth
    And the user selects the checkbox 'Sign up for our newsletter!'
    And the user selects the checkbox 'Receive special offers from our partners!'
    And the user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And the user clicks the 'Create Account' button
    And the user clicks the 'Continue' button
    And the user clicks the 'Delete Account' button
    And the user clicks the 'Continue' button