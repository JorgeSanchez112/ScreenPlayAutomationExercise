Feature: Scroll Page and Verify Content

  Scenario: Scroll page to bottom and then scroll up
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Scroll down to Subscription
    When I scroll down to the bottom of the page
    Then "SUBSCRIPTION" should be visible

  Scenario: Scroll up to Full-Fledged
    When I click on the arrow at the bottom right side to move upward
    Then the page should be scrolled up
    And "Full-Fledged practice website for Automation Engineers" should be visible on the screen