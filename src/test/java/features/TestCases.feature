Feature: TestCases

  Background:
    Given The user has launched the browser
    And The user navigates to 'https://automationexercise.com/'

#  Scenario Outline: Register user
#    When User clicks on Signup Login button
#    And User enters name '<Name>' and email '<Email>' address
#    And User clicks SignUp button
#    And User fills details of account information '<Title>' '<Name>' '<Password>' '<day of birth>' '<month of birth>' '<year of birth>'
#    And User selects checkbox 'Sign up for our newsletter!'
#    And User selects checkbox 'Receive special offers from our partners!'
#    And User fills in the details of information '<First name>' '<Last name>' '<Company>' '<Address>' '<Address2>' '<Country>' '<State>' '<City>' '<Zipcode>' '<Mobile Number>'
#    And User clicks Create Account button
#    And User clicks Continue button
#    And User clicks Delete Account button
#    Then User verifies that account has been deleted
#    And User clicks Continue button
#    Examples:
#      |     Title       |     Name     |     Email           |       Password       | day of birth | month of birth | year of birth | First name     |  Last name    |  Company         |  Address          | Address2          | Country | State   | City           | Zipcode   | Mobile Number |
#      |   testTitle     |  testName    |  testloco4@test.com |   testPassword       | 2            | 12             |    2000       |FirstName Test | LastName Test | NameCompany Test  | Street #1 address | Street #2 address | Canada  | State 1 | Capital Canada | #22024#22 | 1002334531    |
#
#
#  Scenario Outline: Login user with correct parameters
#      When User clicks on Signup Login button
#      And User enters email '<Email>' and password '<Password>'
#      And User clicks login button
#      And User clicks Delete Account button
#      Then User verifies that account has been deleted
#      Examples: data of user registered
#        | Email          | Password |
#        | loco1@test.com | a        |
#
#  Scenario Outline: Login user with incorrect parameters
#    When User clicks on Signup Login button
#    And User enters email '<Email>' and password '<Password>'
#    And User clicks login button
#    Then Message of wrong email or password should be visible
#    Examples: incorrect data
#      | Email               | Password      |
#      | wrongEma1l@test.com | wrongPassword |
#
#  Scenario Outline: Logout user
#    When User clicks on Signup Login button
#    And User enters email '<Email>' and password '<Password>'
#    And User clicks login button
#    And User clicks logout button
#    Then User should be navigated to login page
#    Examples: data of user registered
#      | Email                    | Password |
#      | noDelete@thisAccount.com | a        |
#
#  Scenario: Register user with existing email
#    When User clicks on Signup Login button
#    And User enters name 'noDeleteMe' and email 'noDelete@thisAccount.com' address
#    And User clicks SignUp button
#    Then User verifies Email Address already exist! message is visible
#
#  Scenario Outline: Contact us form
#    When User clicks on Contact Us button
#    And User enters '<Name>' '<Email>' '<Subject>' '<Message>'
#    And User uploads file '<FilePath>'
#    And User clicks on Submit button
#    And User clicks on OK button
#    And User clicks on Home button
#    Then User should be navigated to the home page successfully
#    Examples:
#      | Name               | Email                 | Subject        | Message                       | FilePath                                     |
#      | nameUnacknowledged | emailUn@Knowledge.com | functionalTest | Message 00 T0 kn0w 1f 1t w0rk5| C:\Users\Jorge\Downloads\sampleFile(22).jpeg |
#
#    Scenario: Verify Test cases page
#      When User clicks on Test Cases button
#      Then User should be navigated to the test cases page successfully
#
#    Scenario: Verify products detail page
#      When User clicks on Products button
#      And User clicks on View Product of first product
#      Then User is landed to product detail page
#      And User verifies product name is visible
#      And User verifies category is visible
#      And User verifies price is visible
#      And User verifies availability is visible
#      And User verifies condition is visible
#      And User verifies brand is visible
#
#  Scenario Outline: Search Product
#    When User clicks on Products button
#    And User enters the product name '<Name of product to search>' in the search input
#    And User clicks the search button
#    Then '<Name of product to search>' should be visible
#    And all the products related to the search '<Name of product to search>' should be visible
#    Examples:
#      | Name of product to search   |
#      | Sleeves Printed Top - White |
#
#  Scenario Outline: Verify subscription in home page
#    When User scrolls down to footer
#    And User enters email '<Email address>' address in the input
#    And User clicks arrow button
#    Then User sees a successful subscription message
#    Examples:
#      | Email address     |
#      | email@address.com |
#
#  Scenario Outline: Verify subscription in cart page
#    When User clicks on Cart button
#    And User scrolls down to footer
#    And User enters email '<Email address>' address in the input
#    And User clicks arrow button
#    Then User sees a successful subscription message
#    Examples:
#      | Email address     |
#      | email@address.com |
#
#  Scenario Outline: Add products in cart
#    When User clicks on Products button
#    And User hovers over first product
#    And User clicks on Add to cart button
#    And User clicks Continue shopping button
#    And User hovers over second product
#    And User clicks on Add to cart button of second product
#    And User clicks on View cart button
#    Then User watch both products in cart
#    And User watches their prices '<First product price>' '<Second product price>'
#    And User watches their quantity '<First product quantity>' '<Second product quantity>'
#    And User watches their total price '<First product total price>' '<Second product total price>'
#    Examples:
#      | First product price | Second product price | First product quantity | Second product quantity | First product total price | Second product total price |
#      |  Rs. 500            | Rs. 400              | 1                      | 1                      | Rs. 500                   | Rs. 400                    |

  Scenario Outline: Verify product quantity in cart
    When User clicks View product for any product
    And User increases quantity to '<Quantity>'
    And User clicks Add to cart button
    And User clicks View Cart button
    Then User watches the product in cart page with the same quantity '<Quantity>'
    Examples:
      | Quantity |
      | 4        |


  Scenario Outline: Place Order: Register while Checkout
    When User adds products to cart
    And User clicks on Cart button
    And User clicks Proceed to checkout
    And User clicks on Register Login button
    And User enters name 'checkoutTest' and email 'Checkout@Test.com' address
    And User clicks SignUp button
    And User fills details of account information 'Ms.' '' 'a' '10' '12' '2000'
    And User selects checkbox 'Sign up for our newsletter!'
    And User selects checkbox 'Receive special offers from our partners!'
    And User fills in the details of information 'Check' '0ut' 'danger' 'st. 124' 'N broodWay' 'US' 'michigan' 'california' '123412423' '1000222342'
    And User clicks Create Account button
    And User clicks Continue button
    And User clicks on Cart button
    And User clicks Proceed to checkout
    And User enters description '<Description>' in comment text area
    And User clicks Place holder
    And User enters payment details '<Name on Card>' '<Card Number>' '<CVC>' '<Month expiration>' '<Year expiration>'
    And User clicks on Pay and confirm order button
    And User clicks Delete Account button
    Then User verifies that account has been deleted
    And User clicks Continue button
    Examples:
      | Description           | Name on Card | Card Number | CVC | Month expiration | Year expiration |
      | This is a description | Master       | 092124124   | 12  | 12               |   2100          |


