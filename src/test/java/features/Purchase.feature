Feature: Purchase

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'
    And The user clicks on SignupLogin button
    And The user enter the correct email address and password
    And The user clicks the login button

  Scenario Outline: Complete purchase
    When The user add products to the cart
    And The user clicks the Cart button
    And The user clicks Proceed To Checkout
    And The user enter a description 'Trying to type something' in the comment text area
    And The user clicks the Place Order button
    And The user enter payment details: '<Name on Card>', '<Card Number>', '<CVC>', '<Month of expiration date>', '<Year of expiration date>'
    And The user clicks the Pay and Confirm Order button
    Then The success message Your order has been placed successfully! should be visible
    Examples:
    | Name on Card          | Card Number | CVC  | Month of expiration date | Year of expiration date |
    | is this a valida name | 12345645    | 1234 | 12                       | 2999                    |

##Test case 23
  Scenario: Purchase a product and verify address
    When The user add products to the cart
    And The user clicks the Cart button
    And The user clicks Proceed To Checkout
    Then The delivery address should be visible
    And The billing address should be visible
