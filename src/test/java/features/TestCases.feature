Feature: TestCases

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario Outline: Register user
    When User clicks on Signup Login button
    And User enters name '<Name>' and email '<Email>' address
    And User clicks SignUp button
    And User fills details of account information '<Title>' '<Name>' '<Password>' '<day of birth>' '<month of birth>' '<year of birth>'
    And User selects checkbox 'Sign up for our newsletter!'
    And User selects checkbox 'Receive special offers from our partners!'
    And User fills in the details of information '<First name>' '<Last name>' '<Company>' '<Address>' '<Address2>' '<Country>' '<State>' '<City>' '<Zipcode>' '<Mobile Number>'
    And User clicks Create Account button
    And User clicks Continue button
    And User clicks Delete Account button
    Then User verifies that account has been deleted
    And User clicks Continue button
    Examples: Account Information fields
      |     Title       |     Name     |     Email           |       Password       | day of birth | month of birth | year of birth | First name     |  Last name    |  Company         |  Address          | Address2          | Country | State   | City           | Zipcode   | Mobile Number |
      |   testTitle     |  testName    |  testloco4@test.com |   testPassword       | 2            | 12             |    2000       |FirstName Test | LastName Test | NameCompany Test | Street #1 address | Street #2 address | Canada  | State 1 | Capital Canada | #22024#22 | 1002334531    |


