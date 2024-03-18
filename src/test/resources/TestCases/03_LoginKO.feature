Feature: Login with wrong account
  As a user trying to login
  I want to be aware if email or password is wrong
  So that I cannot sign in with wrong identifiers

  @TestCase3
  Scenario: Login User with incorrect email and password
    Given User launched browser and go to Automation Exercise home page
    When he clicks on Signup Login button
    Then he can see login title: Login to your account
    When he enters email "longjohnsilver@protonmail.ch" and password "walrus"
    And he clicks on Login button
    Then he can see login error message: Your email or password is incorrect!