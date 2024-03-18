Feature: Search Product
  As a customer
  I want to search specific products
  So that I make my purchases easier

  @TestCase9
  Scenario: Search Product
    Given Customer launched browser and go to Automation Exercise home page
    When he clicks on Products button
    Then he can see products list title: ALL PRODUCTS
    When he enters product name "jeans" in search input
    And he clicks on search button
    Then he can see research title: SEARCHED PRODUCTS
    And he can see all products related to the search "jeans"