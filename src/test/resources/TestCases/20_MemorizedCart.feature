Feature: Memorized cart
  As a customer
  I want to login during my shopping
  So that I can place order

  @TestCase20
  Scenario: Search Products and Verify Cart After Login
    Given Customer launched browser and go to Automation Exercise home page
    When he clicks on Products button
    Then he can see products list title: ALL PRODUCTS
    When he enters product name "jeans" in search input
    And he clicks on search button
    Then he can see research title: SEARCHED PRODUCTS
    And he can see all products related to the search "jeans"
    When he adds those products to cart
    And he clicks on Cart button
    Then he can see added products in the cart
    When he clicks on Signup Login button
    And he fills details to Login: "longjohnsilver@protonmail.ch" "hispaniola"
    And he clicks on Cart button
    Then he can see added products in the cart
    Then he can see Logged in as "LongJohnSilver" on view_cart page