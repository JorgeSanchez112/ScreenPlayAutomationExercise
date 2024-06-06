Feature: Cart

  Scenario: Successful redirect from home to cart page
    When I click the "Cart" button
    Then I should be on the cart page

  Scenario: Successful scroll down until watch the text SUBSCRIPTION
    And I scroll down to the footer
    Then the text "SUBSCRIPTION" should be visible

  Scenario: Successful subscription to newsletter from the cart page
    When I enter an email address in the input field
    And I click the arrow button
    Then the success message "You have been successfully subscribed!" should be visible

  Scenario: Add products to the cart and the cart button redirect to the cart page
    When I add products to the cart
    And I click the "Cart" button
    Then the cart page should be displayed

  Scenario: Create an account from cart page to proceed to checkout
    And I click "Proceed To Checkout"
    And I click the "Register / Login" button
    And I fill all details in Signup and create an account
    Then "ACCOUNT CREATED!" should be visible
    And I click the "Continue" button
    And "Logged in as username" should be visible at the top

  Scenario: All the products should be visible with the new account created
    When I click the "Cart" button
    And I click the "Proceed To Checkout" button
    Then Address Details and Review Your Order should be visible

  Scenario: Adding products to the cart and address details are visible
    When I add products to the cart
    And I click the "Cart" button
    Then the cart page should be displayed
    And I click "Proceed To Checkout"
    Then Address Details and Review Your Order should be visible

  Scenario: Adding products to the cart and address details are visible
    When I add products to the cart
    And I click the "Cart" button
    Then the cart page should be displayed
    And I click "Proceed To Checkout"
    Then Address Details and Review Your Order should be visible

  Scenario: Add product and show cart page
    When I add products to the cart
    And I click the "Cart" button
    Then the cart page should be displayed

  Scenario: Remove product from cart
    When I click the "X" button corresponding to a particular product
    Then the product should be removed from the cart

  Scenario: Successful redirect from home to cart page
    When I click on the "Products" button
    Then the user should be navigated to the ALL PRODUCTS page successfully

  Scenario: Add recommended item to cart
    When I click on the "Add To Cart" button on a recommended product
    And I click on the "View Cart" button
    Then the product should be displayed in the cart page

#Test Case 24
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