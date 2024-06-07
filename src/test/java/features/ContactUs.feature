Feature: Contact

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'
    When The user click on "Contact Us" button

  Scenario: Text on Contact us page is visible
    When The user click on "Contact Us" button
    Then "GET IN TOUCH" should be visible

  Scenario: Successful submission of contact us form
    When The user enter name, email, subject, and message
    And  The user upload a file
    And  The user click the "Submit" button
    And  The user click the "OK" button
    Then the success message "Success! Your details have been submitted successfully." should be visible

  Scenario: Use is redirect successfully from contact us to home
    When The user click the "Home" button
    Then The user should be navigated to the home page successfully