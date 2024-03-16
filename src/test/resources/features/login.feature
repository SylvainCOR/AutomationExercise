Feature: Login options
  As a user
  I want to log in and log out
  So that I can visit website or place order

  @TestCase2 # Login User with correct email and password
  Scenario: Login with existing account
    Given Long John launched browser and go to Automation Exercise home page
    When Long John clicks on Signup Login button
    Then Long John can see login title: Login to your account
    When Long John enters email "longjohnsilver@protonmail.ch" and password "hispaniola"
    And Long John clicks on Login button
    Then Long John can see Logged in as "LongJohnSilver" on home page

  @TestCase3 # Login User with incorrect email and password
  Scenario: Trying to login with incorrect password
    Given Long John launched browser and go to Automation Exercise home page
    When Long John clicks on Signup Login button
    Then Long John can see login title: Login to your account
    When Long John enters email "longjohnsilver@protonmail.ch" and password "walrus"
    And Long John clicks on Login button
    Then Long John can see login error message: Your email or password is incorrect!

  @TestCase4 # Logout User
  Scenario: Log in and then log out
    Given Long John launched browser and go to Automation Exercise home page
    When Long John clicks on Signup Login button
    Then Long John can see login title: Login to your account
    When Long John enters email "longjohnsilver@protonmail.ch" and password "hispaniola"
    And Long John clicks on Login button
    Then Long John can see Logged in as "LongJohnSilver" on home page
    When Long John clicks on Logout button
    Then Long John can see the login page

  @TestCase16 # Place Order: Login before Checkout
  Scenario: Login before checkout, confirm order and logout
    Given Long John launched browser and go to Automation Exercise home page
    When Long John clicks on Signup Login button
    And Long John fills details to Login: "longjohnsilver@protonmail.ch" "hispaniola"
    Then Long John can see Logged in as "LongJohnSilver" on home page
    When Long John adds to cart the first 2 products
    And Long John clicks on Cart button
    Then Long John can see the view_cart page
    When Long John clicks on Proceed To Checkout button
    Then Long John can see Address Details and Review Your Order titles
    When Long John enters "Thank you" in comment text area
    And Long John clicks on Place Order button
    Then Long John can see Payment title
    When Long John enters payment details: Name on Card "Silver", Card Number "4444444444444111", CVC "520", Expiration date "07/30"
    And Long John clicks on Pay and Confirm Order button
    Then Long John can see success message: Congratulations! Your order has been confirmed!
    When Long John clicks on Logout button
    Then Long John can see the login page
