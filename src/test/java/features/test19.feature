Feature: Navigate through Brands

  Scenario: Navigate through brands
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

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