Feature: Login options
  As a user
  I want to log in and log out
  So that I can visit website or place order

  @TestCase2 # Login User with correct email and password
  Scenario Outline: Login with existing account
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Signup Login button
    Then <actor> can see login title: Login to your account
    When <actor> enters email <email> and password <password>
    And <actor> clicks on Login button
    Then <actor> can see Logged in as <username> on home page
    Examples:
      | actor     | email                          | password     | username         |
      | Long John | "longjohnsilver@protonmail.ch" | "hispaniola" | "LongJohnSilver" |

  @TestCase3 # Login User with incorrect email and password
  Scenario Outline: Trying to login with incorrect password
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Signup Login button
    Then <actor> can see login title: Login to your account
    When <actor> enters email <email> and password <password>
    And <actor> clicks on Login button
    Then <actor> can see login error message: Your email or password is incorrect!
    Examples:
      | actor     | email                          | password |
      | Long John | "longjohnsilver@protonmail.ch" | "walrus" |

  @TestCase4 # Logout User
  Scenario Outline: Log in and then log out
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Signup Login button
    Then <actor> can see login title: Login to your account
    When <actor> enters email <email> and password <password>
    And <actor> clicks on Login button
    Then <actor> can see Logged in as <username> on home page
    When <actor> clicks on Logout button
    Then <actor> can see the login page
    Examples:
      | actor     | email                          | password     | username         |
      | Long John | "longjohnsilver@protonmail.ch" | "hispaniola" | "LongJohnSilver" |

  @TestCase16 # Place Order: Login before Checkout
  Scenario Outline: Login before checkout, confirm order and logout
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Signup Login button
    And <actor> fills details to Login: <email> <password>
    Then <actor> can see Logged in as <userName> on home page
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
    When <actor> clicks on Logout button
    Then <actor> can see the login page
    Examples:
      | actor     | numberOfProducts | userName         | email                          | password     | lastName | description | cardNumber         | cvc   | expiration |
      | Long John | 2                | "LongJohnSilver" | "longjohnsilver@protonmail.ch" | "hispaniola" | "Silver" | "Thank you" | "4444444444444111" | "520" | "07/30"    |
