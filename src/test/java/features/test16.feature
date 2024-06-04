Feature: Login, Purchase, and Account Deletion

  Scenario: Login, purchase, and account deletion
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    When I click the "Signup / Login" button
    And I fill email and password and click the "Login" button
    Then "Logged in as username" should be visible at the top
    When I add products to the cart
    And I click the "Cart" button
    Then the cart page should be displayed
    And I click "Proceed To Checkout"
    Then Address Details and Review Your Order should be visible
    When I enter a description in the comment text area
    And I click the "Place Order" button
    Then I enter payment details: Name on Card, Card Number, CVC, Expiration date
    And I click the "Pay and Confirm Order" button
    Then the success message "Your order has been placed successfully!" should be visible
    When I click the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible
    And I click the "Continue" button
