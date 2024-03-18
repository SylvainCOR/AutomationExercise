Feature: Add products in cart
  As a customer
  I want to add products in my cart
  So that I can prepare my purchases

  @TestCase12
  Scenario: Add Products in Cart
    Given Customer launched browser and go to Automation Exercise home page
    When he clicks on Products button
    Then he can see products list title: ALL PRODUCTS
    When he mouse over first product
    And he clicks on first overlay Add to cart button
    And he clicks on Continue Shopping button
    And he mouse over second product
    And he clicks on second overlay Add to cart button
    And he clicks on View Cart button
    Then he can see both products are in the cart
    And he can see details: price, quantity and total price