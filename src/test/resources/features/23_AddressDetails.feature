Feature: Address details in checkout page
  As a customer
  I want to verify delivery and billing addresses
  So that I place order with correct information

  @TestCase23
  Scenario: Verify address details in checkout page
    Given Customer launched browser and go to Automation Exercise home page
    When he clicks on Signup Login button
    And he fills details to SignUp: "captainFlint" "johnflint@protonmail.ch"
    And he fills details to Create Account: "Mr." "captainFlint" "johnflint@protonmail.ch" "walrus" "07/07/1924" "John" "Flint" "New Providence" "6 Lewes Blvd" "" "Canada" "Yukon" "Whitehorse" "Y1A3J4" "+18675555555"
    Then he can see: ACCOUNT CREATED!
    When he clicks on account_created page Continue button
    Then he can see Logged in as "captainFlint" on home page
    When he adds products to cart "Sleeveless Dress" "Regular Fit Straight Jeans" "Sleeves Printed Top - White"
    And he clicks on Cart button
    Then he can see the view_cart page
    When he clicks on Proceed To Checkout button
    Then he can see the delivery address is same address filled at the time registration of account
    And he can see the billing address is same address filled at the time registration of account
    When he clicks on Delete Account button
    Then he can see: ACCOUNT DELETED!
    When he clicks on delete_account page Continue button
    Then he can see the home page