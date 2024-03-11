Feature: User Registration
  As a new user
  I want to be able to get registered
  So that I can sign in to the website or place order

  @TestCase1 # Register user
  Scenario Outline: Register User to create an account and then delete the account
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Signup Login button
    Then <actor> can see: New User Signup!
    When <actor> enters name <username> and email <email>
    And <actor> clicks on Signup button
    Then <actor> can see: ENTER ACCOUNT INFORMATION
    When <actor> fills account information details: Title <title>, Name <username>, Email <email>, Password <password>, Date of birth <dateOfBirth>
    And <actor> selects newsletter and special offers checkboxes
    And <actor> fills address information details: First name <firstName>, Last name <lastName>, Company <company>, Address <address>, Address2 <address2>, Country <country>, State <state>, City <city>, Zipcode <zipcode>, Mobile Number <number>
    And <actor> clicks on Create Account button
    Then <actor> can see: ACCOUNT CREATED!
    When <actor> clicks on account_created page Continue button
    Then <actor> can see Logged in as <username> on home page
    When <actor> clicks on Delete Account button
    Then <actor> can see: ACCOUNT DELETED!
    When <actor> clicks on delete_account page Continue button
    Then <actor> can see the home page
    Examples:
      | actor | username       | email                     | title | password | dateOfBirth  | firstName | lastName | company          | address        | address2 | country  | state   | city         | zipcode  | number         |
      | John  | "captainFlint" | "johnflint@protonmail.ch" | "Mr"  | "walrus" | "07/07/1924" | "John"    | "Flint"  | "New Providence" | "6 Lewes Blvd" | ""       | "Canada" | "Yukon" | "Whitehorse" | "Y1A3J4" | "+18675555555" |

  @TestCase5 # Register User with existing email
  Scenario Outline: Trying to register a user with existing account
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Signup Login button
    Then <actor> can see: New User Signup!
    When <actor> enters name <name> and email <email>
    And <actor> clicks on Signup button
    Then <actor> can see signup error message <expectedMessage>
    Examples:
      | actor    | name             | email                          | expectedMessage                |
      | LongJohn | "LongJohnSilver" | "longjohnsilver@protonmail.ch" | "Email Address already exist!" |

  @TestCase14 # Place Order: Register while Checkout
  Scenario Outline: Register while checkout, confirm order and delete account
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> adds to cart the first <numberOfProducts> products
    And <actor> clicks on Cart button
    Then <actor> can see the view_cart page
    When <actor> clicks on Proceed To Checkout button
    And <actor> clicks on Register Login link
    And <actor> fills details to SignUp: <userName> <email>
    And <actor> fills details to Create Account: <title> <userName> <email> <password> <dateOfBirth> <firstName> <lastName> <company> <address> <address2> <country> <state> <city> <zipcode> <number1>
    Then <actor> can see: ACCOUNT CREATED!
    When <actor> clicks on account_created page Continue button
    Then <actor> can see Logged in as <username> on home page
    When <actor> clicks on Cart button
    And <actor> clicks on Proceed To Checkout button
    Then <actor> can see Address Details and Review Your Order titles
    When <actor> enters <description> in comment text area
    And <actor> clicks on Place Order button
    Then <actor> can see Payment title
    When <actor> enters payment details: Name on Card <lastName>, Card Number <cardNumber>, CVC <cvc>, Expiration date <expiration>
    And <actor> clicks on Pay and Confirm Order button
    Then <actor> can see success message: Congratulations! Your order has been confirmed!
    When <actor> clicks on Delete Account button
    Then <actor> can see: ACCOUNT DELETED!
    When <actor> clicks on delete_account page Continue button
    Then <actor> can see the home page
    Examples:
      | actor | numberOfProducts | userName       | email                     | title | password | dateOfBirth  | firstName | lastName | company          | address        | address2 | country  | state   | city         | zipcode  | number1        | username       | description | cardNumber         | cvc   | expiration |
      | John  | 3                | "captainFlint" | "johnflint@protonmail.ch" | "Mr"  | "walrus" | "07/07/1924" | "John"    | "Flint"  | "New Providence" | "6 Lewes Blvd" | ""       | "Canada" | "Yukon" | "Whitehorse" | "Y1A3J4" | "+18675555555" | "captainFlint" | "Thank you" | "4444444444444111" | "520" | "07/30"    |

  @TestCase15 # Place Order: Register before Checkout
  Scenario Outline: Register before checkout, confirm order and delete account
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Signup Login button
    And <actor> fills details to SignUp: <userName> <email>
    And <actor> fills details to Create Account: <title> <userName> <email> <password> <dateOfBirth> <firstName> <lastName> <company> <address> <address2> <country> <state> <city> <zipcode> <number1>
    Then <actor> can see: ACCOUNT CREATED!
    When <actor> clicks on account_created page Continue button
    Then <actor> can see Logged in as <username> on home page
    When <actor> adds to cart the first <numberOfProducts> products
    And <actor> clicks on Cart button
    Then <actor> can see the view_cart page
    When <actor> clicks on Proceed To Checkout button
    Then <actor> can see Address Details and Review Your Order titles
    When <actor> enters <description> in comment text area
    And <actor> clicks on Place Order button
    Then <actor> can see Payment title
    When <actor> enters payment details: Name on Card <lastName>, Card Number <cardNumber>, CVC <cvc>, Expiration date <expiration>
    And <actor> clicks on Pay and Confirm Order button
    Then <actor> can see success message: Congratulations! Your order has been confirmed!
    When <actor> clicks on Delete Account button
    Then <actor> can see: ACCOUNT DELETED!
    When <actor> clicks on delete_account page Continue button
    Then <actor> can see the home page
    Examples:
      | actor | numberOfProducts | userName       | email                     | title | password | dateOfBirth  | firstName | lastName | company          | address        | address2 | country  | state   | city         | zipcode  | number1        | username       | description | cardNumber         | cvc   | expiration |
      | John  | 3                | "captainFlint" | "johnflint@protonmail.ch" | "Mr"  | "walrus" | "07/07/1924" | "John"    | "Flint"  | "New Providence" | "6 Lewes Blvd" | ""       | "Canada" | "Yukon" | "Whitehorse" | "Y1A3J4" | "+18675555555" | "captainFlint" | "Thank you" | "4444444444444111" | "520" | "07/30"    |
