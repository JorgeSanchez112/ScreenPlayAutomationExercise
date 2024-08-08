Feature: All products

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Successful navigation to all products
    When User clicks on Products button
    Then the user should be navigated to the ALL PRODUCTS page successfully

  Scenario: Products are visible
    When User clicks on Products button
    Then the products list should be visible

  Scenario: Successful search for products by name
    When User clicks on Products button
    And User enters the product name 'Frozen Tops For Kids' in the search input
    And User clicks the search button
    Then all the products related to the search 'Frozen Tops For Kids' should be visible

  Scenario: Is SEARCHED PRODUCTS text visible then of do a search in products page
    When User clicks on Products button
    And User enters the product name 'Frozen Tops For Kids' in the search input
    And User clicks the search button
    Then "Frozen Tops For Kids" should be visible

  Scenario: Add products to cart and verify cart details
    When User clicks on Products button
    And User hovers over first product
    And User clicks on Add to cart button
    And User clicks Continue shopping button
    When User hovers over second product
    And User clicks on Add to cart button of second product
    And User clicks on View cart button
    Then User watches both products in cart
    And User watches their prices 'Rs. 500' 'Rs. 400'
    And User watches their quantity '1' '1'
    And User watches their total price 'Rs. 500' 'Rs. 400'