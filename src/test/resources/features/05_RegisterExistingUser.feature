Feature: Existing user registration
  As a registered user
  I don't want to create an account with same identifiers
  So that I ensure my username is unique

  @TestCase5
  Scenario: Register User with existing email
    Given Registered user launched browser and go to Automation Exercise home page
    When he clicks on Signup Login button
    Then he can see: New User Signup!
    When he enters name "LongJohnSilver" and email "longjohnsilver@protonmail.ch"
    And he clicks on Signup button
    Then he can see signup error message "Email Address already exist!"