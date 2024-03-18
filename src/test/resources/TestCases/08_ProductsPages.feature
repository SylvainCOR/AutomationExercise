Feature: Access to products pages
  As a customer
  I want to go to product and product details pages
  So that I can prepare my purchases

  @TestCase8
  Scenario: Verify All Products and product detail page
    Given Customer launched browser and go to Automation Exercise home page
    When he clicks on Products button
    Then he can see products list title: ALL PRODUCTS
    And he can see the product list
    When he clicks on View Product of first product
    Then he can see product_details page
    And he can see details: product name, category, price, availability, condition, brand