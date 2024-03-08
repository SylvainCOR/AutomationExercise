Feature: Search and add products
  As a customer
  I want to search and add products to the cart
  So that I can prepare my purchase

  @TestCase8 # Verify All Products and product detail page
  Scenario Outline: Verify navigation to all products page then product details page
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Products button
    Then <actor> can see products list title: ALL PRODUCTS
    And the product list is visible
    When <actor> clicks on View Product of first product
    Then <actor> can see product_details page
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

  @TestCase12 # Add Products in Cart
  Scenario Outline: Add first product to the cart, then the second one and verify
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Products button
    Then <actor> can see products list title: ALL PRODUCTS
    When <actor> mouse over first product
    And <actor> clicks on first overlay Add to cart button
    And <actor> clicks on Continue Shopping button
    And <actor> mouse over second product
    And <actor> clicks on second overlay Add to cart button
    And <actor> clicks on View Cart button
    Then <actor> can see both products are in the cart
    And <actor> can see details: price, quantity and total price
    Examples:
      | actor    |
      | Customer |

  @TestCase13 # Verify Product quantity in Cart
  Scenario Outline: Change quantity in product_details page
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on last View Product
    Then <actor> can see product_details page
    When <actor> increase quantity to <quantity>
    And <actor> clicks on Add to cart button
    And <actor> clicks on View Cart button
    Then <actor> can see product in the cart
    And the quantity is exactly <quantity>
    Examples:
      | actor    | quantity |
      | Customer | "4"      |
