Feature: All products

  Scenario: Successful navigation to all products
    When I click on the "Products" button
    Then the user should be navigated to the ALL PRODUCTS page successfully
    And the products list should be visible

  Scenario: Successful navigation to all products
    When I click on the "Products" button
    Then the user should be navigated to the ALL PRODUCTS page successfully

  Scenario: Successful search for products by name
    When I enter the product name in the search input
    And I click the search button
    Then "SEARCHED PRODUCTS" should be visible
    And all the products related to the search should be visible

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

#Test case 19
  Scenario: Redirect to products page
    When I click on the "Products" button
    Then brands should be visible on the left sidebar

  Scenario: Navigate through brands
    When I click on any brand name
    Then I should be navigated to the brand page
    And brand products should be displayed

  Scenario: Navigate through brands from a brand
    When I click on any other brand link on the left sidebar
    Then I should be navigated to that brand page
    And I can see products for that brand

## Test case 20 -----------------------------------------------------------------------------

  Scenario: Successful redirect to products page
    When I click on the "Products" button
    Then the user should be navigated to the ALL PRODUCTS page successfully

  Scenario: Search for products
    When I enter the product name in the search input
    And I click the search button
    Then "SEARCHED PRODUCTS" should be visible
    And all the products related to the search should be visible

  Scenario: Add to cart
    When I add those products to the cart
    And I click the "Cart" button
    Then the products should be visible in the cart

  Scenario: Verify cart after login
    When I click the "Signup / Login" button
    And I submit login details
    And I go to the Cart page again
    Then the products should still be visible in the cart after login

