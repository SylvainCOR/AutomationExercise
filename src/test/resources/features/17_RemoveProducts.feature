Feature: Remove products
  As a customer
  I want to remove product from the cart
  So that I modify my purchases

  @TestCase17
  Scenario: Remove Products From Cart
    Given Customer launched browser and go to Automation Exercise home page
    When he adds to cart the first 5 products
    And he clicks on Cart button
    Then he can see the view_cart page
    When he clicks on X button of second product
    Then he cannot see second product in the cart