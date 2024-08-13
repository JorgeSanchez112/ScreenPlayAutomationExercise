Feature: Purchase

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'
    And User clicks on Signup Login button
    And User enters email 'noDelete@thisAccount.com' and password 'a'
    And User clicks login button

  Scenario Outline: Complete purchase
    When User adds products to cart
    And User clicks on Cart button
    And User clicks Proceed to checkout
    And User enters description 'Trying to type something' in comment text area
    And User clicks Place holder
    And User enters payment details '<Name on Card>' '<Card Number>' '<CVC>' '<Month of expiration date>' '<Year of expiration date>'
    And User clicks on Pay and confirm order button
    Then User can see a success message about the order
    Examples:
    | Name on Card          | Card Number | CVC  | Month of expiration date | Year of expiration date |
    | is this a valida name | 12345645    | 1234 | 12                       | 2999                    |


  Scenario: Purchase a product and verify address
    When User adds products to cart
    And User clicks on Cart button
    And User clicks Proceed to checkout
    Then User can see delivery address
    And User can see billing address

  Scenario Outline: Download invoice
    When User adds products to cart
    And User clicks on Cart button
    And User clicks Proceed to checkout
    And User enters description 'Trying to type something' in comment text area
    And User clicks Place holder
    And User enters payment details '<Name on Card>' '<Card Number>' '<CVC>' '<Month of expiration date>' '<Year of expiration date>'
    And User clicks on Pay and confirm order button
    And User clicks the Download Invoice button
    Then User can see the invoice downloaded in their respective path
    Examples:
      | Name on Card          | Card Number | CVC  | Month of expiration date | Year of expiration date |
      | is this a valida name | 12345645    | 1234 | 12                       | 2999                    |

