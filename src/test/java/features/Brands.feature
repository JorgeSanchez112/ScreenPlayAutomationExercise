Feature: Brands
  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'


  #Test case 19
  Scenario: Redirect to products page and brand are visible on the left sidebar
    When The user click on the "Products" button
    Then brands should be visible on the left sidebar

  Scenario: Redirect to a brand page and the user should be in that page
    When The user scroll down to Brands
    And The user click on any brand name
    Then The user should be navigated to the brand page

  Scenario: Redirect to a brand page and the user should watch the brand's products
    When The user scroll down to Brands
    And The user click on any brand name
    Then brand products should be displayed

  Scenario: Navigate through brands from a brand and the user should be on the brand page
    When The user scroll down to Brands
    And The user click on any brand name
    And The user click on any other brand link on the left sidebar
    Then The user should be navigated to that brand page

  Scenario:  Navigate through brands from a brand and the user should watch the brand's products
    When The user scroll down to Brands
    And The user click on any brand name
    And The user click on any other brand link on the left sidebar
    Then The user can watch products for that brand