Feature: Purchase

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Complete purchase
    When The user enter a description in the comment text area
    And The user click the "Place Order" button
    Then The user enter payment details: Name on Card, Card Number, CVC, Expiration date
    And The user click the "Pay and Confirm Order" button
    Then The success message "Your order has been placed successfully!" should be visible

  Scenario: Complete account deletion then a successful purchase
    When The user click the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible
    And The user click the "Continue" button

##Test case 23
  Scenario: Purchase a product and verify address
    When The user add products to the cart
    And The user click the "Cart" button
    Then the cart page should be displayed
    And The user click "Proceed To Checkout"
    Then The delivery address should be the same as the address filled at the time of registration
    And The billing address should be the same as the address filled at the time of registration
