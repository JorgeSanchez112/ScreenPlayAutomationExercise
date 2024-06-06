Feature: Home scenarios

  Background:
    Given the user has launched the browser
    And the user navigates to 'https://automationexercise.com/'
    Then the home page should be visible successfully

  Scenario: Home page is loaded successfully
    Then the home page should be visible successfully

#Otherssssssssssssssssssssssssssss-------------------------------------------------------------------------------------------------

  Scenario: Successful account deletion
    When I click the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible

  Scenario: Successful logout
    When I click the "Logout" button
    Then the user should be navigated to the login page

  Scenario: Successful navigation to test cases page
    When I click on the "Test Cases" button
    Then the user should be navigated to the test cases page successfully

  Scenario: Successful scroll down until watch the text SUBSCRIPTION
    When I scroll down to the footer
    Then the text "SUBSCRIPTION" should be visible

  Scenario: Successful subscription to newsletter
    When I enter an email address in the input field
    And I click the arrow button
    Then the success message "You have been successfully subscribed!" should be visible


#Test case 18
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

  Scenario: Scroll down to Recommended items
    When I scroll to the bottom of the page
    Then "RECOMMENDED ITEMS" should be visible

  Scenario: Scroll down to Subscription
    When I scroll down to the bottom of the page
    Then "SUBSCRIPTION" should be visible

  Scenario: Scroll up to Full-Fledged
    When I click on the arrow at the bottom right side to move upward
    Then the page should be scrolled up
    And "Full-Fledged practice website for Automation Engineers" should be visible on the screen

  Scenario: Scroll down until Subscription
    When I scroll down to the bottom of the page
    Then "SUBSCRIPTION" should be visible

  Scenario: Scroll up to top
    When I scroll up to the top of the page
    Then "Full-Fledged practice website for Automation Engineers" should be visible on the screen