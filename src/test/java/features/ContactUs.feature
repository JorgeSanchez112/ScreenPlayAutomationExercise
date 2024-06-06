Feature: Contact

  Scenario: Text on Contact us page is visible
    When I click on "Contact Us" button
    Then "GET IN TOUCH" should be visible

  Scenario: Successful submission of contact us form
    When I enter name, email, subject, and message
    And  I upload a file
    And  I click the "Submit" button
    And  I click the "OK" button
    Then the success message "Success! Your details have been submitted successfully." should be visible

  Scenario: Use is redirect successfully from contact us to home
    When I click the "Home" button
    Then I should be navigated to the home page successfully