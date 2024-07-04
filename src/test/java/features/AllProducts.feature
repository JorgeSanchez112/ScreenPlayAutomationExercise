Feature: All products

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Successful navigation to all products
    When The user clicks on the Products button
    Then the user should be navigated to the ALL PRODUCTS page successfully

  Scenario: Products are visible
    When The user clicks on the Products button
    Then the products list should be visible

  Scenario: Successful search for products by name
    When The user clicks on the Products button
    And The user enter the product name 'Frozen Tops For Kids' in the search input
    And The user clicks the search button
    Then all the products related to the search should be visible

  Scenario: Is SEARCHED PRODUCTS text visible then of do a search in products page
    When The user clicks on the Products button
    And The user enter the product name 'Frozen Tops For Kids' in the search input
    And The user clicks the search button
    Then "Frozen Tops For Kids" should be visible

  Scenario: Add products to cart and verify cart details
    When The user clicks on the Products button
    And The user hover over the first product
    And The user clicks the Add to cart button overlay
    And The user clicks the Continue Shopping button
    When The user hover over the second product
    And The user clicks the Add to cart button 2
    And The user clicks the View Cart link
    Then both products should be added to the cart
    And The details of both products including their prices, quantities, and total price should be correct