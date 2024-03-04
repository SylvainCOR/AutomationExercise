Feature: Search and add products
  As a customer
  I want to search and add products to the cart
  So that I can prepare my purchase

  @TestCase8 # Verify All Products and product detail page
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

  @TestCase9 # Search Product
  Scenario Outline: Search product with search field
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Products button
    Then <actor> can see products list title: ALL PRODUCTS
    When <actor> enters product name <productName> in search input
    And <actor> clicks on search button
    Then <actor> can see research title: SEARCHED PRODUCTS
    And products related to the search <productName> are visible
    Examples:
      | actor    | productName |
      | Customer | "jeans"     |
