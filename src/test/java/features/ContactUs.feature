Feature: Contact

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'
    When User clicks on Contact Us button

  Scenario: Text on Contact us page is visible
    Then GET IN TOUCH should be visible

  Scenario: Successful submission of contact us form
    When User enters 'name' 'email@email.com' 'Subject whatever' 'message of complain'
    And User clicks on Submit button
    And User clicks on OK button
    Then User can see success message

  Scenario: Use is redirect successfully from contact us to home
    When User enters 'name1' 'email1@email.com' 'Subject whatever 1' 'message of complains'
    And User clicks on Submit button
    And User clicks on OK button
    And User clicks on Home button
    Then User should be navigated to the home page successfully