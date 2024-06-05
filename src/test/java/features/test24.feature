Feature: Complete Purchase, Download Invoice, and Account Deletion

  Scenario: Complete purchase, download invoice, and account deletion
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Add products to the cart
    When I add products to the cart
    And I click the "Cart" button
    Then the cart page should be displayed
    And I click "Proceed To Checkout"

  Scenario: Create an account
    When I click the "Register / Login" button
    And I fill all details in Signup and create an account
    Then "ACCOUNT CREATED!" should be visible
    And I click the "Continue" button
    And "Logged in as username" should be visible at the top

  Scenario: Review address
    When I click the "Cart" button
    And I click the "Proceed To Checkout" button
    Then Address Details and Review Your Order should be visible

  Scenario: Purchase product
    When I enter a description in the comment text area
    And I click the "Place Order" button
    Then I enter payment details: Name on Card, Card Number, CVC, Expiration date
    And I click the "Pay and Confirm Order" button
    Then the success message "Your order has been placed successfully!" should be visible

  Scenario: Download invoice
    When I click the "Download Invoice" button
    Then the invoice should be downloaded successfully
    And I click the "Continue" button

  Scenario: Delete account
    When I click the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible
    And I click the "Continue" button
