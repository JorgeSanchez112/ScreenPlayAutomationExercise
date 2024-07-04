Feature: Cart

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Successful redirect from home to cart page
    When The user clicks the Cart button
    Then The user should be on the cart page

  Scenario: Add products to the cart and the cart button redirect to the cart page
    When The user add products to the cart
    And The user clicks the Cart button
    Then The cart page should be displayed

  Scenario: Successful scroll down until watch the text SUBSCRIPTION
    When The user clicks the Cart button
    And The user scroll down to the footer
    Then The text SUBSCRIPTION should be visible

  Scenario: Successful subscription to newsletter from the cart page
    When The user clicks the Cart button
    And The user scroll down to the SUBSCRIPTION
    And The user enter an email address in the input field
    And The user clicks the arrow button
    Then The success message You have been successfully subscribed! should be visible


  Scenario: Create an account from cart
    When The user clicks the Cart button
    And The user clicks on SignupLogin button
    And The user enters the name 'try1' and email 'tryOther1@thing.com' address
    And The user clicks the Signup button
    And The user fill all details in Signup and create an account
    Then ACCOUNT CREATED! should be visible
    And The user clicks the Continue button
    And Logged in as 'try1a' should be visible at the top

  Scenario: All the products should be visible with the new account created
    When The user clicks on SignupLogin button
    And The user enter the correct email address and password
    And The user clicks the login button
    And The user add products to the cart
    And The user clicks the Cart button
    And The user clicks Proceed To Checkout button
    Then Address Details and Review Your Order should be visible

  Scenario: Adding products to the cart and address details are visible
    When The user clicks on SignupLogin button
    And The user enter the correct email address and password
    And The user clicks the login button
    And The user add products to the cart
    And The user clicks the Cart button
    And The user clicks Proceed To Checkout button
    Then Address Details and Review Your Order should be visible

  Scenario: Remove product from cart
    When The user add a product to the cart
    And The user clicks on the View Cart button
    And The user clicks the X button corresponding to a particular product
    Then The product should be removed from the cart

  Scenario: Add recommended item to cart
    When The user clicks on the Add To Cart button on a recommended product
    And The user clicks on the View Cart button
    Then the product should be displayed in the cart page


  Scenario: Add products to the cart
    When The user add products to the cart
    And The user clicks the Cart button
    Then The cart page should be displayed

#  Scenario: Delete account
#    When The user clicks the Delete Account button
#    Then ACCOUNT DELETED! should be visible
#    And The user clicks the Continue button


  Scenario: Verify cart after login
    When The user clicks on SignupLogin button
    And The user enter the correct email address and password
    And The user clicks the login button
    And The user add products to the cart
    And The user clicks the Logout button
    When The user clicks on SignupLogin button
    And The user enter the correct email address and password
    And The user clicks the login button
    And The user clicks the Cart button
    Then The products should still be visible in the cart after login