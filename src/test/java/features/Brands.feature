Feature: Brands

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  #Test case 19
  Scenario: Redirect to products page and brand are visible on the left sidebar
    When User clicks on Products button
    Then brands should be visible on the left sidebar

  Scenario: Redirect to a brand page and the user should be in that page
    When User scrolls down to Brands
    And User clicks on any brand name
    Then User should be navigated to the brand page 'https://automationexercise.com/'

  Scenario: Redirect to a brand page and the user should watch the brand's products
    When User scrolls down to Brands
    And User clicks on any brand name
    Then User can see brand products

  Scenario: Navigate through brands from a brand and the user should be on the brand page
    When User scrolls down to Brands
    And User clicks on any brand name
    And User clicks on any other brand link on the left sidebar
    Then User should be navigated to the brand page 'https://automationexercise.com/'

  Scenario:  Navigate through brands from a brand and the user should watch the brand's products
    When User scrolls down to Brands
    And User clicks on any brand name
    And User clicks on any other brand link on the left sidebar
    Then User can see brand products