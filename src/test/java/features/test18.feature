Feature: Navigate through Categories

  Scenario: Navigate through categories
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    And categories should be visible on the left sidebar
    When I click on the "Women" category
    Then I should be on the Women category page
    When I click on any category link under "Women" category, for example: "Dress"
    Then the category page should be displayed
    And I should confirm the text "WOMEN - TOPS PRODUCTS"
    When I click on any sub-category link of "Men" category on the left sidebar
    Then I should be navigated to that category page
