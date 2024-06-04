Feature: View Product Details

  Scenario: Successful navigation to product detail page and verification of product details
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    When I click on the "Products" button
    Then the user should be navigated to the ALL PRODUCTS page successfully
    And the products list should be visible
    When I click on the "View Product" button of the first product
    Then the user should be landed on the product detail page
    And the product details should be visible:
      | product name  |
      | category      |
      | price         |
      | availability  |
      | condition     |
      | brand         |
