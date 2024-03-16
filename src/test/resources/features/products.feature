Feature: Search and add products
  As a customer
  I want to search and add products to the cart
  So that I can prepare my purchase

  @TestCase8 # Verify All Products and product detail page
  Scenario: Verify navigation to all products page then product details page
    Given Customer launched browser and go to Automation Exercise home page
    When Customer clicks on Products button
    Then Customer can see products list title: ALL PRODUCTS
    And the product list is visible
    When Customer clicks on View Product of first product
    Then Customer can see product_details page
    And Customer can see details: product name, category, price, availability, condition, brand

  @TestCase9 # Search Product
  Scenario: Search product with search field
    Given Customer launched browser and go to Automation Exercise home page
    When Customer clicks on Products button
    Then Customer can see products list title: ALL PRODUCTS
    When Customer enters product name "jeans" in search input
    And Customer clicks on search button
    Then Customer can see research title: SEARCHED PRODUCTS
    And products related to the search "jeans" are visible

  @TestCase12 # Add Products in Cart
  Scenario: Add first product to the cart, then the second one and verify
    Given Customer launched browser and go to Automation Exercise home page
    When Customer clicks on Products button
    Then Customer can see products list title: ALL PRODUCTS
    When Customer mouse over first product
    And Customer clicks on first overlay Add to cart button
    And Customer clicks on Continue Shopping button
    And Customer mouse over second product
    And Customer clicks on second overlay Add to cart button
    And Customer clicks on View Cart button
    Then Customer can see both products are in the cart
    And Customer can see details: price, quantity and total price

  @TestCase13 # Verify Product quantity in Cart
  Scenario: Change quantity in product_details page
    Given Customer launched browser and go to Automation Exercise home page
    When Customer clicks on last View Product
    Then Customer can see product_details page
    When Customer increase quantity to "4"
    And Customer clicks on Add to cart button
    And Customer clicks on View Cart button
    Then Customer can see product in the cart
    And the quantity is exactly "4"

  @TestCase17 # Remove Products From Cart
  Scenario:
    Given Customer launched browser and go to Automation Exercise home page
    When Customer adds to cart the first 5 products
    And Customer clicks on Cart button
    Then Customer can see the view_cart page
    When Customer clicks on X button of second product
    Then Customer cannot see second product in the cart

  @TestCase18 # View Category Products
  Scenario: Switch between women and men category products
    Given Customer launched browser and go to Automation Exercise home page
    And Customer can see categories on left side bar
    When Customer clicks on Women category
    And Customer clicks on Dress sub-category
    Then Customer can see "WOMEN - DRESS PRODUCTS" category title
    When Customer clicks on Men category
    And Customer clicks on Jeans sub-category
    Then Customer can see "MEN - JEANS PRODUCTS" category title

  @TestCase19 # View & Cart Brand Products
  Scenario: Switch between brand products pages
    Given Customer launched browser and go to Automation Exercise home page
    When Customer clicks on Products button
    Then Customer can see brands on left side bar
    When Customer clicks on H&M brand
    Then Customer can see "BRAND - H&M PRODUCTS" brand title
    When Customer clicks on BIBA brand
    Then Customer can see "BRAND - BIBA PRODUCTS" brand title
