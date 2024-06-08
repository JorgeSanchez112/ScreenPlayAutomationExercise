Feature: All products

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Successful navigation to all products
    When The user click on the "Products" button
    Then the user should be navigated to the ALL PRODUCTS page successfully

  Scenario: Products are visible
    When The user click on the "Products" button
    Then the products list should be visible

  Scenario: Successful search for products by name
    When The user click on the "Products" button
    And The user enter the product name in the search input
    And The user click the search button
    Then all the products related to the search should be visible

  Scenario: Is SEARCHED PRODUCTS text visible then of do a search in products page
    When The user click on the "Products" button
    And The user enter the product name in the search input
    And The user click the search button
    Then "SEARCHED PRODUCTS" should be visible

  Scenario: Add products to cart and verify cart details
    When The user click on the "Products" button
    And The user hover over the first product
    And The user click the "Add to cart" button
    And The user click the "Continue Shopping" button
    When The user hover over the second product
    And The user click the "Add to cart" button
    And The user click the "View Cart" button
    Then both products should be added to the cart
    And The details of both products including their prices, quantities, and total price should be correct

  Scenario: Successful redirect from home to products page
    When The user click on the "Products" button
    Then The user should be navigated to the ALL PRODUCTS page successfully