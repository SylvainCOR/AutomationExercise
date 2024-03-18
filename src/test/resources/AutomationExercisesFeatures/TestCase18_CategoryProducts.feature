Feature: Category products
  As a customer
  I want a side bar on the left with products sorted by category
  So that I make my purchases easier

  @TestCase18
  Scenario: View Category Products
    Given Customer launched browser and go to Automation Exercise home page
    And he can see categories on left side bar
    When he clicks on Women category
    And he clicks on Dress sub-category
    Then he can see "WOMEN - DRESS PRODUCTS" category title
    When he clicks on Men category
    And he clicks on Jeans sub-category
    Then he can see "MEN - JEANS PRODUCTS" category title