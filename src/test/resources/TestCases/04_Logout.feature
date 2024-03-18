Feature: Logout
  As a logged in user
  I want to be able to logout
  So that my account is disconnected

  @TestCase4
  Scenario: Logout User
    Given Registered user launched browser and go to Automation Exercise home page
    When he clicks on Signup Login button
    Then he can see login title: Login to your account
    When he enters email "longjohnsilver@protonmail.ch" and password "hispaniola"
    And he clicks on Login button
    Then he can see Logged in as "LongJohnSilver" on home page
    When he clicks on Logout button
    Then he can see the login page