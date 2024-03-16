Feature: User Registration
  As a new user
  I want to be able to get registered
  So that I can sign in to the website or place order

  @TestCase1 # Register user
  Scenario: Register User to create an account and then delete the account
    Given John launched browser and go to Automation Exercise home page
    When John clicks on Signup Login button
    Then John can see: New User Signup!
    When John enters name "captainFlint" and email "johnflint@protonmail.ch"
    And John clicks on Signup button
    Then John can see: ENTER ACCOUNT INFORMATION
    When John fills account information details: Title "Mr", Name "captainFlint", Email "johnflint@protonmail.ch", Password "walrus", Date of birth "07/07/1924"
    And John selects newsletter and special offers checkboxes
    And John fills address information details: First name "John", Last name "Flint", Company "New Providence", Address "6 Lewes Blvd", Address2 "", Country "Canada", State "Yukon", City "Whitehorse", Zipcode "Y1A3J4", Mobile Number "+18675555555"
    And John clicks on Create Account button
    Then John can see: ACCOUNT CREATED!
    When John clicks on account_created page Continue button
    Then John can see Logged in as "captainFlint" on home page
    When John clicks on Delete Account button
    Then John can see: ACCOUNT DELETED!
    When John clicks on delete_account page Continue button
    Then John can see the home page

  @TestCase5 # Register User with existing email
  Scenario: Trying to register a user with existing account
    Given Long John launched browser and go to Automation Exercise home page
    When Long John clicks on Signup Login button
    Then Long John can see: New User Signup!
    When Long John enters name "LongJohnSilver" and email "longjohnsilver@protonmail.ch"
    And Long John clicks on Signup button
    Then Long John can see signup error message "Email Address already exist!"

  @TestCase14 # Place Order: Register while Checkout
  Scenario: Register while checkout, confirm order and delete account
    Given John launched browser and go to Automation Exercise home page
    When John adds to cart the first 3 products
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
    When John enters payment details: Name on Card "Flint", Card Number "4444444444444111", CVC "520", Expiration date "07/30"
    And John clicks on Pay and Confirm Order button
    Then John can see success message: Congratulations! Your order has been confirmed!
    When John clicks on Delete Account button
    Then John can see: ACCOUNT DELETED!
    When John clicks on delete_account page Continue button
    Then John can see the home page

  @TestCase15 # Place Order: Register before Checkout
  Scenario: Register before checkout, confirm order and delete account
    Given John launched browser and go to Automation Exercise home page
    When John clicks on Signup Login button
    And John fills details to SignUp: "captainFlint" "johnflint@protonmail.ch"
    And John fills details to Create Account: "Mr" "captainFlint" "johnflint@protonmail.ch" "walrus" "07/07/1924" "John" "Flint" "New Providence" "6 Lewes Blvd" "" "Canada" "Yukon" "Whitehorse" "Y1A3J4" "+18675555555"
    Then John can see: ACCOUNT CREATED!
    When John clicks on account_created page Continue button
    Then John can see Logged in as "captainFlint" on home page
    When John adds to cart the first 3 products
    And John clicks on Cart button
    Then John can see the view_cart page
    When John clicks on Proceed To Checkout button
    Then John can see Address Details and Review Your Order titles
    When John enters "Thank you" in comment text area
    And John clicks on Place Order button
    Then John can see Payment title
    When John enters payment details: Name on Card "Flint", Card Number "4444444444444111", CVC "520", Expiration date "07/30"
    And John clicks on Pay and Confirm Order button
    Then John can see success message: Congratulations! Your order has been confirmed!
    When John clicks on Delete Account button
    Then John can see: ACCOUNT DELETED!
    When John clicks on delete_account page Continue button
    Then John can see the home page
