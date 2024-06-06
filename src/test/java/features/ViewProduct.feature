Feature: View Product

  Scenario: Successful navigation to view product showing the product's details
    When I click on the "View Product" button of the first product
    Then the user should be landed on the product detail page successful navigation to product detail page and verification of product details
    And the product details should be visible:
      | product name  |
      | category      |
      | price         |
      | availability  |
      | condition     |
      | brand         |

  Scenario: The view product of any product show details about it
    When I click the "View Product" button for any product
    Then the product detail page should be opened

  Scenario: Add product to cart with specific quantity
    When I increase the quantity to 4
    And I click the "Add to cart" button
    And I click the "View Cart" button
    Then the product should be displayed in the cart page with the exact quantity

  Scenario: Successful perform of product's detail
    When I click on the "View Product" button
    Then "Write Your Review" should be visible

  Scenario: Write a product review
    When I enter name, email, and review
    And I click the "Submit" button
    Then the success message "Thank you for your review." should be visible