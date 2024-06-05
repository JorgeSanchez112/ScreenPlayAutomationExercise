Feature: Search for Products and Verify Cart After Login

  Scenario: Search for products, add to cart, and verify cart after login
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

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