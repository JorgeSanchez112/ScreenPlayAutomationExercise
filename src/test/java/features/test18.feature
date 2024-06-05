Feature: Navigate through Categories

  Scenario: Navigate through categories
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully
    And categories should be visible on the left sidebar

  Scenario: Successful sub Women category links showed
    When I click on the "Women" category
    Then I should be on the Women category page

  Scenario: Click on a link to show products according it
    When I click on any category link under "Women" category, for example: "Dress"
    Then the category page should be displayed
    And I should confirm the text "WOMEN - TOPS PRODUCTS"

  Scenario: Navigate through categories
    When I click on any sub-category link of "Men" category on the left sidebar
    Then I should be navigated to that category page
