Feature: Search for Products

  Scenario: Successful search for products by name
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Successful navigation to all products
    When I click on the "Products" button
    Then the user should be navigated to the ALL PRODUCTS page successfully

  Scenario: Successful search for products by name
    When I enter the product name in the search input
    And I click the search button
    Then "SEARCHED PRODUCTS" should be visible
    And all the products related to the search should be visible