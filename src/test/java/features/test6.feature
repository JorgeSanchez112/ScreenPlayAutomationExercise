Feature: Contact Us Form Submission

  Scenario: Successful submission of contact us form
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    When I click on "Contact Us" button
    Then "GET IN TOUCH" should be visible
    When I enter name, email, subject, and message
    And I upload a file
    And I click the "Submit" button
    And I click the "OK" button
    Then the success message "Success! Your details have been submitted successfully." should be visible
    When I click the "Home" button
    Then I should be navigated to the home page successfully