Feature: User Registration

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Enter User Details
    When User clicks on Signup Login button
    And User enters name 'loco' and email 'loco@test.com' address
    And User clicks SignUp button
    Then ENTER ACCOUNT INFORMATION should be visible

  Scenario Outline: Fill Account Information
    When User clicks on Signup Login button
    And User enters name '<Name>' and email '<Email>' address
    And User clicks SignUp button
    And User fills details of account information '<Title>' '<Name>' '<Password>' '<day of birth>' '<month of birth>' '<year of birth>'
    And User selects checkbox 'Sign up for our newsletter!'
    And User selects checkbox 'Receive special offers from our partners!'
    And User fills in the details of information '<First name>' '<Last name>' '<Company>' '<Address>' '<Address2>' '<Country>' '<State>' '<City>' '<Zipcode>' '<Mobile Number>'
    And User clicks Create Account button
    Then ACCOUNT CREATED! should be visible
    Examples:
      |     Title       | Name  |     Email                 | Password | day of birth | month of birth | year of birth | First name     |  Last name    |  Company         |  Address          | Address2          | Country | State   | City           | Zipcode   | Mobile Number |
      |   testTitle     | loco1 |  loco1@test.com |   a      | 12           | 10             |    2000       |FirstName Test  | LastName Test | NameCompany Test | Street #1 address | Street #2 address | Canada  | State 1 | Capital Canada | #22024#22 | 1002334531    |

  Scenario Outline: Complete Registration
    When User clicks on Signup Login button
    And User enters name '<Name>' and email '<Email>' address
    And User clicks SignUp button
    And User fills details of account information '<Title>' '<Name>' '<Password>' '<day of birth>' '<month of birth>' '<year of birth>'
    And User selects checkbox 'Sign up for our newsletter!'
    And User selects checkbox 'Receive special offers from our partners!'
    And User fills in the details of information '<First name>' '<Last name>' '<Company>' '<Address>' '<Address2>' '<Country>' '<State>' '<City>' '<Zipcode>' '<Mobile Number>'
    And User clicks Create Account button
    And User clicks Continue button
    Then Logged in as username '<Name>' should be visible
    Examples:
      |     Title       | Name  |     Email       | Password | day of birth | month of birth | year of birth | First name     |  Last name    |  Company         |  Address          | Address2          | Country | State   | City           | Zipcode   | Mobile Number |
      |   testTitle     | loco2 |  loco2@test.com | a        | 12           | 10             |    2000       |FirstName Test  | LastName Test | NameCompany Test | Street #1 address | Street #2 address | Canada  | State 1 | Capital Canada | #22024#22 | 1002334531    |

#Otherssssssssssssssssssssssssssss-------------------------------------------------------------------------------------------------

  Scenario: Navigate to Signup Page
    When User clicks on Signup Login button
    Then New User Signup! should be visible

  Scenario: Unsuccessful signup with already registered email
    When User clicks on Signup Login button
    And User enters name 'loco1' and email 'noDelete@thisAccount.com' address
    And  User clicks SignUp button
    Then User verifies Email Address already exist! message is visible

  Scenario Outline: Create an account
    When User clicks on Signup Login button
    And User enters name '<Name>' and email '<Email>' address
    And User clicks SignUp button
    And User fills details of account information '<Title>' '<Name>' '<Password>' '<day of birth>' '<month of birth>' '<year of birth>'
    And User selects checkbox 'Sign up for our newsletter!'
    And User selects checkbox 'Receive special offers from our partners!'
    And User fills in the details of information '<First name>' '<Last name>' '<Company>' '<Address>' '<Address2>' '<Country>' '<State>' '<City>' '<Zipcode>' '<Mobile Number>'
    And User clicks Create Account button
    Then ACCOUNT CREATED! should be visible
    And User clicks Continue button
    And Logged in as 'try' should be visible at the top
    Examples:
      | Title | Name |     Email          | Password | day of birth | month of birth | year of birth | First name     |  Last name    |  Company         |  Address          | Address2          | Country | State   | City           | Zipcode   | Mobile Number |
      |  Ms.  | try  | tryOther@thing.com |  a       | 12           | 10             |    2000       |FirstName Test  | LastName Test | NameCompany Test | Street #1 address | Street #2 address | Canada  | State 1 | Capital Canada | #22024#22 | 1002334531    |