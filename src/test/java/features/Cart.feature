Feature: Cart

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Successful redirect from home to cart page
    When User clicks on Cart button
    Then The user should be on the cart page

  Scenario: Add products to the cart and the cart button redirect to the cart page
    When User adds products to cart
    And User clicks on Cart button
    Then The cart page should be displayed

  Scenario: Successful scroll down until watch the text SUBSCRIPTION
    When User clicks on Cart button
    And User scrolls down to footer
    Then The text SUBSCRIPTION should be visible

  Scenario: Successful subscription to newsletter from the cart page
    When User clicks on Cart button
    And User scrolls down to SUBSCRIPTION
    And User enters email 'fake@email.fk' address in the input
    And User clicks arrow button
    Then User sees a successful subscription message


  Scenario: Create an account from cart
    When User clicks on Cart button
    And User clicks on Signup Login button
    And User enters name 'fakeEmail' and email 'fake@email.fk' address
    And User clicks SignUp button
    And User fills details of account information 'Ms.' '' 'a' '10' '12' '2000'
    And User selects checkbox 'Sign up for our newsletter!'
    And User selects checkbox 'Receive special offers from our partners!'
    And User fills in the details of information 'Check' '0ut' 'danger' 'st. 124' 'N broodWay' 'United States' 'michigan' 'california' '123412423' '1000222342'
    And User clicks Create Account button
    Then ACCOUNT CREATED! should be visible
    And User clicks Continue button
    And Logged in as 'fakeEmail' should be visible at the top

  Scenario: All the products should be visible with the new account created
    When User clicks on Signup Login button
    And User enters email 'tryOther1@thing.com' and password 'a'
    And User clicks login button
    And User adds products to cart
    And User clicks on Cart button
    And User clicks Proceed to checkout
    Then Address Details and Review Your Order should be visible

  Scenario: Adding products to the cart and address details are visible
    When User clicks on Signup Login button
    And User enters email 'noDelete@thisAccount.com' and password 'a'
    And User clicks login button
    And User adds products to cart
    And User clicks on Cart button
    And User clicks Proceed to checkout
    Then Address Details and Review Your Order should be visible

  Scenario: Remove product from cart
    When User adds product to cart
    And User clicks on the View Cart button
    And User clicks the X button corresponding to a particular product
    Then The product should be removed from the cart

  Scenario: Add recommended item to cart
    When User clicks on Add To Cart button of a recommended product
    And User clicks on the View Cart button
    Then The product should be displayed in the cart page

  Scenario: Add products to the cart
    When User adds products to cart
    And User clicks on Cart button
    Then The cart page should be displayed

  Scenario: Verify cart after login
    When User clicks on Signup Login button
    And User enters email 'noDelete@thisAccount.com' and password 'a'
    And User clicks login button
    And User adds products to cart
    And User clicks logout button
    When User clicks on Signup Login button
    And User enters email 'noDelete@thisAccount.com' and password 'a'
    And User clicks login button
    And User clicks on Cart button
    Then The products should still be visible in the cart after login