Feature: products

  @TestCase17 # Remove Products From Cart
  Scenario Outline:
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> adds to cart the first <numberOfProducts> products
    And <actor> clicks on Cart button
    Then <actor> can see the view_cart page
    When <actor> clicks on X button of second product
    Then <actor> cannot see second product in the cart
    Examples:
      | actor    | numberOfProducts |
      | Customer | 5                |
