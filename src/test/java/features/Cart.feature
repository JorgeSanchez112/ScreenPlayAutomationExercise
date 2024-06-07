Feature: Cart

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Successful redirect from home to cart page
    When The user click the "Cart" button
    Then The user should be on the cart page

  Scenario: Add products to the cart and the cart button redirect to the cart page
    When The user add products to the cart
    And The user click the "Cart" button
    Then The cart page should be displayed

  Scenario: Successful scroll down until watch the text SUBSCRIPTION
    And The user scroll down to the footer
    Then The text "SUBSCRIPTION" should be visible

  Scenario: Successful subscription to newsletter from the cart page
    When The user enter an email address in the input field
    And The user click the arrow button
    Then The success message "You have been successfully subscribed!" should be visible

  Scenario: Create an account from cart page to proceed to checkout
    And The user click "Proceed To Checkout"
    And The user click the "Register / Login" button
    And The user fill all details in Signup and create an account
    Then "ACCOUNT CREATED!" should be visible
    And The user click the "Continue" button
    And "Logged in as username" should be visible at the top

  Scenario: All the products should be visible with the new account created
    When The user click the "Cart" button
    And The user click the "Proceed To Checkout" button
    Then Address Details and Review Your Order should be visible

  Scenario: Adding products to the cart and address details are visible
    When The user add products to the cart
    And The user click the "Cart" button
    Then The cart page should be displayed
    And The user click "Proceed To Checkout"
    Then Address Details and Review Your Order should be visible

  Scenario: Remove product from cart
    When The user click the "X" button corresponding to a particular product
    Then The product should be removed from the cart

  Scenario: Successful redirect from home to cart page
    When The user click on the "Products" button
    Then The user should be navigated to the ALL PRODUCTS page successfully

  Scenario: Add recommended item to cart
    When The user click on the "Add To Cart" button on a recommended product
    And The user click on the "View Cart" button
    Then the product should be displayed in the cart page

#Test Case 24
  Scenario: Add products to the cart
    When The user add products to the cart
    And The user click the "Cart" button
    Then The cart page should be displayed
    And The user click "Proceed To Checkout"

  Scenario: Create an account
    When The user click the "Register / Login" button
    And The user fill all details in Signup and create an account
    Then "ACCOUNT CREATED!" should be visible
    And The user click the "Continue" button
    And "Logged in as username" should be visible at the top

  Scenario: Purchase product
    When The user enter a description in the comment text area
    And The user click the "Place Order" button
    Then The user enter payment details: Name on Card, Card Number, CVC, Expiration date
    And The user click the "Pay and Confirm Order" button
    Then The success message "Your order has been placed successfully!" should be visible

  Scenario: Download invoice
    When The user click the "Download Invoice" button
    Then The invoice should be downloaded successfully
    And The user click the "Continue" button

  Scenario: Delete account
    When The user click the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible
    And The user click the "Continue" button

  Scenario: Add to cart
    When The user add those products to the cart
    And The user click the "Cart" button
    Then The products should be visible in the cart

  Scenario: Verify cart after login
    When The user click the "Signup / Login" button
    And The user submit login details
    And The user go to the Cart page again
    Then The products should still be visible in the cart after login