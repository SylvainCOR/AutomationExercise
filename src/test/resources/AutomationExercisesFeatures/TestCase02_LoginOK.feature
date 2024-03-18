Feature: Login with existing account
  As a registered user
  I want to sign in
  So that I am logged in

  @TestCase2
  Scenario: Login User with correct email and password
    Given Registered user launched browser and go to Automation Exercise home page
    When he clicks on Signup Login button
    Then he can see login title: Login to your account
    When he enters email "longjohnsilver@protonmail.ch" and password "hispaniola"
    And he clicks on Login button
    Then he can see Logged in as "LongJohnSilver" on home page