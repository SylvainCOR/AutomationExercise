Feature: Search and add products
  As a customer
  I want to search and add products to the cart
  So that I can prepare my purchase

  @TestCase8
  Scenario Outline: Verify navigation to test cases page
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Products button
    Then <actor> can see products list title: ALL PRODUCTS
    And the product list is visible
    When <actor> clicks on View Product of first product
    Then <actor> is landed to product_details page
    And <actor> can see details: product name, category, price, availability, condition, brand
    Examples:
      | actor    |
      | Customer |
