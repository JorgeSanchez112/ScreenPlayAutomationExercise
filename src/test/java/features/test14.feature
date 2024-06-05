Feature: Complete Purchase and Account Deletion

  Scenario: Complete purchase and account deletion
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully


  Scenario: Add products to the cart and the cart button redirect to the cart page
    When I add products to the cart
    And I click the "Cart" button
    Then the cart page should be displayed

    #The scenario below could be have a separate scenario
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

  Scenario: Complete purchase
    When I enter a description in the comment text area
    And I click the "Place Order" button
    Then I enter payment details: Name on Card, Card Number, CVC, Expiration date
    And I click the "Pay and Confirm Order" button
    Then the success message "Your order has been placed successfully!" should be visible

  Scenario: Complete account deletion
    When I click the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible
    And I click the "Continue" button

