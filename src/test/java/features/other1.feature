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