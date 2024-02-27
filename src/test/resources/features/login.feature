Feature: Login options
  As a user
  I want to log in and log out
  So that I can visit website and quit

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