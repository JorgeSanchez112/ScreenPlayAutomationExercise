Feature: View Product

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Successful navigation to view product showing the product's details
    When The user click on the "View Product" button of the first product
    Then The user should be landed on the product detail page successful navigation to product detail page and verification of product details
    And The product details should be visible:
      | product name  |
      | category      |
      | price         |
      | availability  |
      | condition     |
      | brand         |

  Scenario: The view product of any product show details about it
    When The user click the "View Product" button for any product
    Then The product detail page should be opened

  Scenario: Add product to cart with specific quantity
    When The user increase the quantity to 4
    And The user click the "Add to cart" button
    And The user click the "View Cart" button
    Then The product should be displayed in the cart page with the exact quantity

  Scenario: Successful perform of product's detail
    When The user click on the "View Product" button
    Then "Write Your Review" should be visible

  Scenario: Write a product review
    When The user enter name, email, and review
    And The user click the "Submit" button
    Then The success message "Thank you for your review." should be visible