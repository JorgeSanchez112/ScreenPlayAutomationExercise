Feature: Home scenarios

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

  Scenario: Home page is loaded successfully
    Then The home page should be visible successfully

#Otherssssssssssssssssssssssssssss-------------------------------------------------------------------------------------------------

#  Scenario: Successful account deletion
#    When The user click on SignupLogin button
#    And The user enter the correct email address 'loco@test.com' and password 'a'
#    And The user click the "login" button
#    And The user click the "Delete Account" button
#    Then "ACCOUNT DELETED!" should be visible

  Scenario: Successful navigation to test cases page
    When The user clicks on the Test Cases button
    Then The user should be navigated to the test cases page successfully

  Scenario: Successful scroll down until watch the text SUBSCRIPTION
    When The user scroll down to the footer
    Then The text SUBSCRIPTION should be visible

  Scenario: Successful subscription to newsletter
    When The user scroll down to the footer
    And The user enter an email address in the input field
    And The user clicks the arrow button
    Then The success message You have been successfully subscribed! should be visible

#Test case 18
  Scenario: categories are visible
    Then Categories should be visible on the left sidebar

  Scenario: Successful sub Women category links showed
    When The user clicks on the Women category
    Then The user should see the Women categories

  Scenario Outline: Click on a sub category women link, user should be redirect to category selected
    When The user clicks on '<subCategory>' category link under Women category
    Then The category page should be displayed 'https://automationexercise.com/'
    Examples:
      | subCategory |
      | DRESS       |
      | TOPS        |
      | SAREE       |

  Scenario Outline: Click on a sub category women link, user should be the title of category selected
    When The user clicks on '<subCategory>' category link under Women category
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
    When The user scroll down to the bottom of the page
    Then RECOMMENDED ITEMS should be visible

  Scenario: Scroll down to Subscription
    When The user scroll down to the bottom of the page
    Then SUBSCRIPTION should be visible

  Scenario: Scroll up to Full-Fledged
    When The user scroll down to the bottom of the page
    And The user clicks on the arrow at the bottom right side to move upward
    Then The page should be scrolled up
    And Full-Fledged practice website for Automation Engineers should be visible on the screen

  Scenario: Scroll up to top
    When The user scroll down to the bottom of the page
    And The user scroll up to the top of the page
    Then Full-Fledged practice website for Automation Engineers should be visible on the screen