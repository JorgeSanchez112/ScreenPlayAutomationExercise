Feature: Verify Address Details in Checkout Page

  Scenario: Verify address details in checkout page
    Given the browser is launched
    When I navigate to url "http://automationexercise.com"
    Then the home page should be visible successfully

  Scenario: Create am account
    When I click the "Signup / Login" button
    And I fill all details in Signup and create an account
    Then "ACCOUNT CREATED!" should be visible
    And I click the "Continue" button
    And "Logged in as username" should be visible at the top

  Scenario: Purchase a product and verify address
    When I add products to the cart
    And I click the "Cart" button
    Then the cart page should be displayed
    And I click "Proceed To Checkout"
    Then the delivery address should be the same as the address filled at the time of registration
    And the billing address should be the same as the address filled at the time of registration

  Scenario: Delete account
    When I click the "Delete Account" button
    Then "ACCOUNT DELETED!" should be visible
    And I click the "Continue" button



