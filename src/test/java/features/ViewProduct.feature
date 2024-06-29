Feature: View Product

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Successful navigation to view product showing the product's details
    When The user clicks on the View Product button of the first product
    Then The product details should be visible

  Scenario: The view product of any product show details about it
    When The user clicks the View Product button for any product
    Then The product detail page should be opened

  Scenario Outline: Add product to cart with specific quantity
    When The user clicks the View Product button for any product
    And The user increase the quantity to 'quantity'
    And The user clicks the Add to cart button
    And The user clicks the View Cart button
    Then The product should be displayed in the cart page with the exact quantity '<quantity>'
    Examples:
      | quantity  |
      | 4         |

  Scenario: Successful perform of product's detail
    When The user clicks the View Product button for any product
    Then Write Your Review should be visible

  Scenario: Write a product review
    When The user clicks the View Product button for any product
    And The user enter name, email, and review
    And The user clicks the Submit button
    Then The success message Thank you for your review. should be visible