Feature: Memorized cart
  As a Customer
  I want to login during my shopping
  So that I can place order

  @TestCase20
  Scenario: Search Products and Verify Cart After Login
    Given John launched browser and go to Automation Exercise home page
    When John clicks on Products button
    Then John can see products list title: ALL PRODUCTS
    When John enters product name "jeans" in search input
    And John clicks on search button
    Then John can see research title: SEARCHED PRODUCTS
    And John can see all products related to the search "jeans"
    When John adds those products to cart
    And John clicks on Cart button
    Then John can see added products in the cart
    When John clicks on Signup Login button
    And John fills details to Login: "longjohnsilver@protonmail.ch" "hispaniola"
    And John clicks on Cart button
    Then John can see added products in the cart
    And John can see Then Long John can see Logged in as "LongJohnSilver" on view_cart page

