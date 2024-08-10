Feature: Home scenarios

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Home page is loaded successfully
    Then The home page should be visible successfully

#Otherssssssssssssssssssssssssssss-------------------------------------------------------------------------------------------------


  Scenario: Successful navigation to test cases page
    When User clicks on Test Cases button
    Then User should be navigated to the test cases page successfully

  Scenario: Successful scroll down until watch the text SUBSCRIPTION
    When User scrolls down to footer
    Then The text SUBSCRIPTION should be visible

  Scenario: Successful subscription to newsletter
    When User scrolls down to footer
    And User enters email 'email.email.com' address in the input
    And User clicks arrow button
    Then The text SUBSCRIPTION should be visible

  Scenario: categories are visible
    Then Categories should be visible on the left sidebar

  Scenario: Successful sub Women category links showed
    When User clicks on Women category
    Then User should see the Women categories

  Scenario Outline: Click on a sub category women link, user should be redirect to category selected
    When User clicks on '<subCategory>' subcategory link under Women category
    Then The category page should be displayed '<url>'
    Examples:
      | subCategory |                           url                         |
      | DRESS       | https://automationexercise.com/category_products/1    |
      | TOPS        | https://automationexercise.com/category_products/2    |
      | SAREE       | https://automationexercise.com/category_products/7    |

  Scenario Outline: Click on a sub category women link, user should be the title of category selected
    When User clicks on '<subCategory>' sub-category link of Men category on the left sidebar
    Then The user should confirm the '<title>' text of '<subcategory>' page
    Examples:
      | subCategory |            title            |
      |  DRESS      |   WOMEN - DRESS PRODUCTS    |
      |  TOPS       |   WOMEN - TOPS PRODUCTS     |
      |  SAREE      |   WOMEN - SAREE PRODUCTS    |

  Scenario: Navigate through categories
    When The user clicks on any sub-category link of Men category on the left sidebar
    Then The user should be navigated to that category page

  Scenario: Scroll down to Recommended items
    When User scrolls down page to bottom
    Then RECOMMENDED ITEMS should be visible

  Scenario: Scroll down to Subscription
    When User scrolls down page to bottom
    Then SUBSCRIPTION should be visible

  Scenario: Scroll up to Full-Fledged
    When User scrolls down page to bottom
    And User clicks on the arrow at the bottom right side to move upward
    Then User can see Full-Fledged practice website for Automation Engineers on the screen

  Scenario: Scroll up to top
    When User scrolls down page to bottom
    And User scrolls up to the top of the page
    Then User can see Full-Fledged practice website for Automation Engineers on the screen