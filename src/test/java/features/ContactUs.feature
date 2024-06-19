Feature: Contact

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'
    When The user click on Contact Us button

  Scenario: Text on Contact us page is visible
    Then GET IN TOUCH should be visible

  Scenario: Successful submission of contact us form
    When The user fill out GET IN TOUCH form
    And The user clicks on Submit button
    And The user accept the alert
    Then The success message Success! Your details have been submitted successfully. should be visible

  Scenario: Use is redirect successfully from contact us to home
    When The user fill out GET IN TOUCH form
    And The user clicks on Submit button
    And The user accept the alert
    And The user clicks the Home button
    Then The user should be navigated to the home page successfully "https://automationexercise.com/"