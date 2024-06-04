Feature: Write Product Review

  Scenario: Write a product review
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    When I click on the "Products" button
    Then the user should be navigated to the ALL PRODUCTS page successfully
    When I click on the "View Product" button
    Then "Write Your Review" should be visible
    When I enter name, email, and review
    And I click the "Submit" button
    Then the success message "Thank you for your review." should be visible
