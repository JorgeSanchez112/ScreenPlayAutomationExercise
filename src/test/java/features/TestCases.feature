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
    Examples:
      |     Title       |     Name     |     Email           |       Password       | day of birth | month of birth | year of birth | First name     |  Last name    |  Company         |  Address          | Address2          | Country | State   | City           | Zipcode   | Mobile Number |
      |   testTitle     |  testName    |  testloco4@test.com |   testPassword       | 2            | 12             |    2000       |FirstName Test | LastName Test | NameCompany Test  | Street #1 address | Street #2 address | Canada  | State 1 | Capital Canada | #22024#22 | 1002334531    |


  Scenario Outline: Login user with correct parameters
      When User clicks on Signup Login button
      And User enters email '<Email>' and password '<Password>'
      And User clicks login button
      And User clicks Delete Account button
      Then User verifies that account has been deleted

      Examples: data of user registered
        | Email          | Password |
        | loco1@test.com | a        |

  Scenario Outline: Login user with incorrect parameters
    When User clicks on Signup Login button
    And User enters email '<Email>' and password '<Password>'
    And User clicks login button
    Then Message of wrong email or password should be visible

    Examples: incorrect data
      | Email               | Password      |
      | wrongEma1l@test.com | wrongPassword |

  Scenario Outline: Logout user
    When User clicks on Signup Login button
    And User enters email '<Email>' and password '<Password>'
    And User clicks login button
    And User clicks logout button
    Then User should be navigated to login page

    Examples: data of user registered
      | Email                    | Password |
      | noDelete@thisAccount.com | a        |

  Scenario: Register user with existing email
    When User clicks on Signup Login button
    And User enters name 'noDeleteMe' and email 'noDelete@thisAccount.com' address
    And User clicks SignUp button
    Then User verifies Email Address already exist! message is visible

  Scenario Outline: Contact us form
    When User clicks on Contact Us button
    And User enters '<Name>' '<Email>' '<Subject>' '<Message>'
    And User uploads file '<FilePath>'
    And User clicks on Submit button
    And User clicks on OK button
    And User clicks on Home button
    Then User should be navigated to the home page successfully

    Examples:
      | Name               | Email                 | Subject        | Message                       | FilePath                                     |
      | nameUnacknowledged | emailUn@Knowledge.com | functionalTest | Message 00 T0 kn0w 1f 1t w0rk5| C:\Users\Jorge\Downloads\sampleFile(22).jpeg |