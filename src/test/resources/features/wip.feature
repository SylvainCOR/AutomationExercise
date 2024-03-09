Feature: User Registration

  @TestCase14
  Scenario: Register while checkout, confirm order and delete account
    Given John launched browser and go to Automation Exercise home page
    When John adds to cart the first three 3 products
    And John clicks on Cart button
    Then John can see the view_cart page
    When John clicks on Proceed To Checkout button
    And John clicks on Register Login link
    And John fills details to SignUp: "captainFlint" "johnflint@protonmail.ch"
    And John fills details to Create Account: "Mr" "captainFlint" "johnflint@protonmail.ch" "walrus" "07/07/1924" "John" "Flint" "New Providence" "6 Lewes Blvd" "" "Canada" "Yukon" "Whitehorse" "Y1A3J4" "+18675555555"
    Then John can see: ACCOUNT CREATED!
    When John clicks on account_created page Continue button
    Then John can see Logged in as "captainFlint" on home page
    When John clicks on Cart button
    And John clicks on Proceed To Checkout button
    Then John can see Address Details and Review Your Order titles
    When John enters "Thank you" in comment text area
    And John clicks on Place Order button
    Then John can see Payment title
    When John enters payment details: Name on Card "", Card Number "", CVC "", Expiration date ""
    And John clicks on Pay and Confirm Order button
    Then John can see success message: Your order has been placed successfully!
    When John clicks on Delete Account button
    Then John can see: ACCOUNT DELETED!
    When John clicks on delete_account page Continue button
    Then John can see the home page