Feature: Brand products
  As a customer
  I want a side bar on the left with products sorted by brand
  So that I make my purchases easier

  @TestCase19
  Scenario: View & Cart Brand Products
    Given Customer launched browser and go to Automation Exercise home page
    When he clicks on Products button
    Then he can see brands on left side bar
    When he clicks on H&M brand
    Then he can see "BRAND - H&M PRODUCTS" brand title
    When he clicks on BIBA brand
    Then he can see "BRAND - BIBA PRODUCTS" brand title