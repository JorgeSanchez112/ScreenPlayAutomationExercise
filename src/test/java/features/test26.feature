Feature: Scroll Page Up and Down

  Scenario: Scroll page down to bottom and then up to top
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Scroll down until Subscription
    When I scroll down to the bottom of the page
    Then "SUBSCRIPTION" should be visible

  Scenario: Scroll up to top
    When I scroll up to the top of the page
    Then "Full-Fledged practice website for Automation Engineers" should be visible on the screen
