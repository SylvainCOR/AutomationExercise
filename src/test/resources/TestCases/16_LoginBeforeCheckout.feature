Feature: Login Before Checkout
  As a registered user
  I want to sign in before checkout
  So that I place order

  @TestCase16
  Scenario: Place Order: Login before Checkout
    Given Registered user launched browser and go to Automation Exercise home page
    When he clicks on Signup Login button
    And he fills details to Login: "longjohnsilver@protonmail.ch" "hispaniola"
    Then he can see Logged in as "LongJohnSilver" on home page
    When he adds to cart the first 2 products
    And he clicks on Cart button
    Then he can see the view_cart page
    When he clicks on Proceed To Checkout button
    Then he can see Address Details and Review Your Order titles
    When he enters "Thank you" in comment text area
    And he clicks on Place Order button
    Then he can see Payment title
    When he enters payment details: Name on Card "Silver", Card Number "4444444444444111", CVC "520", Expiration date "07/30"
    And he clicks on Pay and Confirm Order button
    Then he can see success message: Congratulations! Your order has been confirmed!
    When he clicks on Logout button
    Then he can see the login page