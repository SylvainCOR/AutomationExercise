Feature: Recommended products
  As a customer
  I want to see a recommended product selection
  So that I can order product from suggestion

  @TestCase22
  Scenario: Add to cart from Recommended items
    Given Customer launched browser and go to Automation Exercise home page
    When he scrolls down to the bottom of page
    Then he can see recommended products title: RECOMMENDED ITEMS
    When he clicks on Add To Cart button of "Blue Top"
    And he clicks on View Cart button
    Then he should see the product name in the cart