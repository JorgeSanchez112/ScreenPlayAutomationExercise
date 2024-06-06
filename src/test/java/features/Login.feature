Feature: Login scenarios

  Scenario: Delete Account
    When the user clicks on the SignupLogin button
    And the user enters the name 'loco3' and email 'loco3@test.com' address
    And the user clicks the Signup button
    And the user fills in the details: Title, Name, Email, Password, Date of birth
    And the user selects all checkbox in Enter Account Information
    And the user fills in the details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And the user clicks the Create Account button
    And the user clicks the Continue button
    And the user clicks the Delete Account button
    And the user clicks the Continue button

#Otherssssssssssssssssssssssssssss-------------------------------------------------------------------------------------------------

  Scenario: A text on Signup / Login page is visible
    When I click on "Signup / Login" button
    Then "Login to your account" should be visible

  Scenario: Successful login
    When I enter the correct email address and password
    And I click the "login" button
    Then "Logged in as username" should be visible

  Scenario:  A text on Signup / Login page is visible
    When I click on "Signup / Login" button
    Then "Login to your account" should be visible

  Scenario: Unsuccessful login with incorrect credentials
    When I enter an incorrect email address and password
    And I click the "login" button
    Then the error message "Your email or password is incorrect!" should be visible

  Scenario: A text on Signup / Login page is visible
    When I click on "Signup / Login" button
    Then "Login to your account" should be visible

  Scenario: Successful login
    When I enter the correct email address and password
    And I click the "login" button
    Then "Logged in as username" should be visible

  Scenario: Login
    When I click the "Signup / Login" button
    And I fill email and password and click the "Login" button
    Then "Logged in as username" should be visible at the top