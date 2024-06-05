Feature: View Product Details

  Scenario: Successful navigation to product detail page and verification of product details
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Successful navigation to all products
    When I click on the "Products" button
    Then the user should be navigated to the ALL PRODUCTS page successfully
    And the products list should be visible

  Scenario: Successful navigation to view product showing the product's details
    When I click on the "View Product" button of the first product
    Then the user should be landed on the product detail page successful navigation to product detail page and verification of product details
    And the product details should be visible:
      | product name  |
      | category      |
      | price         |
      | availability  |
      | condition     |
      | brand         |