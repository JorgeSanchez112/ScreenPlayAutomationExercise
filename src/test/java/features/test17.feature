Feature: Remove Product from Cart

  Scenario: Remove product from cart
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    When I add products to the cart
    And I click the "Cart" button
    Then the cart page should be displayed
    When I click the "X" button corresponding to a particular product
    Then the product should be removed from the cart
