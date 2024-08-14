Feature: View Product

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Successful navigation to view product showing the product's details
    When User clicks on View Product of first product
    Then User can see the product details

  Scenario: The view product of any product show details about it
    When User clicks View product for any product
    Then User is landed to product detail page

  Scenario Outline: Add product to cart with specific quantity
    When User clicks View product for any product
    And User increases quantity to '<quantity>'
    And User clicks Add to cart button
    And User clicks View Cart button
    Then User watches the product in cart page with the same quantity '<quantity>'
    Examples:
      | quantity  |
      | 4         |

  Scenario: Successful perform of product's detail
    When User clicks View product for any product
    Then Write Your Review should be visible

  Scenario: Write a product review
    When User clicks View product for any product
    And User enters 'test 1' 'test1@email.com' 'this is a review for testing'
    And User clicks on Submit button of review form
    Then User can see a successful message about the review