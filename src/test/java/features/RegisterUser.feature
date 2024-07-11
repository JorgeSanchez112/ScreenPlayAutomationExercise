Feature: User Registration

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Enter User Details
    When The user clicks on SignupLogin button
    And The user enters the name 'loco' and email 'loco@test.com' address
    And The user clicks the Signup button
    Then ENTER ACCOUNT INFORMATION should be visible

#  Scenario: Fill Account Information
#    When The user clicks on SignupLogin button
#    And The user enters the name 'loco1' and email 'loco1@test.com' address
#    And The user clicks the Signup button
#    And The user fills in the details: Title, Name, Email, Password, Date of birth
#    And The user selects all checkbox in Enter Account Information
#    And The user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#    And The user clicks the Create Account button
#    Then ACCOUNT CREATED! should be visible
#
#  Scenario: Complete Registration
#    When The user clicks on SignupLogin button
#    And The user enters the name 'loco2' and email 'loco2@test.com' address
#    And The user clicks the Signup button
#    And The user fills in the details: Title, Name, Email, Password, Date of birth
#    And The user selects all checkbox in Enter Account Information
#    And The user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#    And The user clicks the Create Account button
#    And The user clicks the Continue button
#    Then Logged in as username should be visible
#
##Otherssssssssssssssssssssssssssss-------------------------------------------------------------------------------------------------
#
#  Scenario: Navigate to Signup Page
#    When The user clicks on SignupLogin button
#    Then New User Signup! should be visible
#
#  Scenario: Unsuccessful signup with already registered email
#    When The user clicks on SignupLogin button
#    And The user enter name and an already registered email address
#    And  The user clicks the Signup button
#    Then The error message Email Address already exist! should be visible
#
#  Scenario: Create an account
#    When The user clicks on SignupLogin button
#    And The user enters the name 'try' and email 'tryOther@thing.com' address
#    And The user clicks the Signup button
#    And The user fill all details in Signup and create an account
#    Then ACCOUNT CREATED! should be visible
#    And The user clicks the Continue button
#    And Logged in as 'try' should be visible at the top