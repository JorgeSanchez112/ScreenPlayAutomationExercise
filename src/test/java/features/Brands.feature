Feature: Brands
  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'


  #Test case 19
  Scenario: Redirect to products page and brand are visible on the left sidebar
    When The user click on the Products button
    Then brands should be visible on the left sidebar

  Scenario: Redirect to a brand page and the user should be in that page
    When The user scroll down to Brands
    And The user clicks on any brand name
    Then The user should be navigated to the brand page 'https://automationexercise.com/'

  Scenario: Redirect to a brand page and the user should watch the brand's products
    When The user scroll down to Brands
    And The user clicks on any brand name
    Then brand products should be displayed

  Scenario: Navigate through brands from a brand and the user should be on the brand page
    When The user scroll down to Brands
    And The user clicks on any brand name
    And The user clicks on any other brand link on the left sidebar
    Then The user should be navigated to the brand page 'https://automationexercise.com/'

  Scenario:  Navigate through brands from a brand and the user should watch the brand's products
    When The user scroll down to Brands
    And The user clicks on any brand name
    And The user clicks on any other brand link on the left sidebar
    Then brand products should be displayed
    #Then The user can watch products for that brand. Actually this is the real step of this scenario but it is really similar to on before so I decided put the before step