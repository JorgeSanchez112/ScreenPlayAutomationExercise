Feature: Login scenarios

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'
    When User clicks on Signup Login button

#Otherssssssssssssssssssssssssssss-------------------------------------------------------------------------------------------------

  Scenario: A text on Signup / Login page is visible
    Then Login to your account should be visible

  Scenario: Successful logout
    When User enters email 'noDelete@thisAccount.com' and password 'a'
    And User clicks login button
    And User clicks logout button
    Then User should be navigated to login page

  Scenario: Successful login
    When User enters email 'noDelete@thisAccount.com' and password 'a'
    And User clicks login button
    Then Logged in as username 'noDelete' should be visible

  Scenario: Unsuccessful login with incorrect credentials
    When User enters email 'incorrect@email.com' and password 'incorrect'
    And User clicks login button
    Then Message of wrong email or password should be visible