Feature: Add Recommended Item to Cart

  Scenario: Add recommended item to cart
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Scroll down to Recommended items
    When I scroll to the bottom of the page
    Then "RECOMMENDED ITEMS" should be visible

  Scenario: Add recommended item to cart
    When I click on the "Add To Cart" button on a recommended product
    And I click on the "View Cart" button
    Then the product should be displayed in the cart page