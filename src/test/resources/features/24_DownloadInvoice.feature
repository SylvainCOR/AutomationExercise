Feature: Download invoice
  As a customer
  I want to download invoice
  So that I see order summary

  @TestCase24
  Scenario: Download Invoice after purchase order
    Given Customer launched browser and go to Automation Exercise home page
    When he adds products to cart "Fancy Green Top" "Frozen Tops For Kids" "Rust Red Linen Saree"
    And he clicks on Cart button
    Then he can see the view_cart page
    When he clicks on Proceed To Checkout button
    And he clicks on Register Login link
    And he fills details to SignUp: "captainFlint" "johnflint@protonmail.ch"
    And he fills details to Create Account: "Mr." "captainFlint" "johnflint@protonmail.ch" "walrus" "07/07/1924" "John" "Flint" "New Providence" "6 Lewes Blvd" "" "Canada" "Yukon" "Whitehorse" "Y1A3J4" "+18675555555"
    Then he can see: ACCOUNT CREATED!
    When he clicks on account_created page Continue button
    Then he can see Logged in as "captainFlint" on home page
    When he clicks on Cart button
    And he clicks on Proceed To Checkout button
    Then he can see Address Details and Review Your Order titles
    When he enters "Thank you" in comment text area
    And he clicks on Place Order button
    Then he can see Payment title
    When he enters payment details: Name on Card "Flint", Card Number "4444444444444111", CVC "520", Expiration date "07/30"
    And he clicks on Pay and Confirm Order button
    Then he can see success message: Congratulations! Your order has been confirmed!
    When he clicks Download Invoice button
    Then he can see invoice is downloaded successfully
    When he clicks on payment_done page Continue button
    And he clicks on Delete Account button
    Then he can see: ACCOUNT DELETED!
    When he clicks on delete_account page Continue button
    Then he can see the home page