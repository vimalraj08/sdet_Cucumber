#Author: Vimal Raj Viswaraj
#Feature: Add a product to wish list
@AllTag
Feature: Add a product to OpenCart

  @tag1
  Scenario Outline: Add a product to Cart
    Given Navigate to the Homepage URL
    When User enters the credentials and login to the application"<userEmail>" "<password>"
    And User enters the string to "<searchStr>"
    And User opens the product and add the same to cart
    Then User Logout

    Examples: 
      | userEmail             | password | searchStr |
      | vimalrajv08@gmail.com | Admin123 | Phone     |
      | vimalrajv08@gmail.com | Admin123 | Mac Book  |

      