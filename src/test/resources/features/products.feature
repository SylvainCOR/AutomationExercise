Feature: Search and add products
  As a customer
  I want to search and add products to the cart
  So that I can prepare my purchase

  @TestCase8 # Verify All Products and product detail page
  Scenario: Verify navigation to test cases page
    Given Customer launched browser and go to Automation Exercise home page
    When he clicks on Products button
    Then he can see products list title: ALL PRODUCTS
    And the product list is visible
    When he clicks on View Product of first product
    Then he is landed to product_details page
    And he can see details: product name, category, price, availability, condition, brand
