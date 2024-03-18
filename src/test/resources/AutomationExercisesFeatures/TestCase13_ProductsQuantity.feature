Feature: Products quantity in cart
  As a customer
  I want to change product quantity in the cart
  So that I modify my purchases

  @TestCase13
  Scenario: Verify Product quantity in Cart
    Given Customer launched browser and go to Automation Exercise home page
    When he clicks on last View Product
    Then he can see product_details page
    When he increase quantity to "4"
    And he clicks on Add to cart button
    And he clicks on View Cart button
    Then he can see product in the cart
    And he can see the quantity is exactly "4"