Feature: Add Product to Cart with Specific Quantity

  Scenario: Add product to cart with specific quantity
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully


  Scenario: The view product of any product show details about it
    When I click the "View Product" button for any product
    Then the product detail page should be opened

  Scenario: Add product to cart with specific quantity
    When I increase the quantity to 4
    And I click the "Add to cart" button
    And I click the "View Cart" button
    Then the product should be displayed in the cart page with the exact quantity