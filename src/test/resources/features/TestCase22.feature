Feature: Recommended products
  As a Customer
  I want to write a product review
  So that I submit my impression

  @TestCase22
  Scenario: Add to cart from Recommended items
    Given Customer launched browser and go to Automation Exercise home page
    When Customer scrolls to the footer
    Then Customer can see recommended products title: RECOMMENDED ITEMS
    When Customer clicks on Add To Cart button of "Blue Top"
    And Customer clicks on View Cart button
    Then Customer should see the product name in the cart
