Feature: Add Products to Cart and Verify Cart Details

  Scenario: Add products to cart and verify cart details
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Successful redirect to products page
    When I click the "Products" button
    Then I should be on the products page

  Scenario: Add products to cart and verify cart details
    When I hover over the first product
    And I click the "Add to cart" button
    And I click the "Continue Shopping" button
    When I hover over the second product
    And I click the "Add to cart" button
    And I click the "View Cart" button
    Then both products should be added to the cart
    And the details of both products including their prices, quantities, and total price should be correct