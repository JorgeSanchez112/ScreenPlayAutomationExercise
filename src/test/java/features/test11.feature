Feature: Subscribe to Newsletter from Cart Page

  Scenario: Successful subscription to newsletter from the cart page
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    When I click the "Cart" button
    Then I should be on the cart page
    And I scroll down to the footer
    Then the text "SUBSCRIPTION" should be visible
    When I enter an email address in the input field
    And I click the arrow button
    Then the success message "You have been successfully subscribed!" should be visible