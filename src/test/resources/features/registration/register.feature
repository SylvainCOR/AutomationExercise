Feature: User Registration

  As a new user
  I want to be able to get registered
  So that I can sign in

  Background:
    Given NewUser launched browser to navigate to Automation Exercise home page

  @TestCase
  Scenario: Test Case 1: Register User
    When he clicks on Signup Login button
    Then he can see "New User Signup!" on login page

  @TestCase
  Scenario: Test Case 5: Register User with existing email
    When he clicks on Signup Login button
    Then he can see "New User Signup!" on login page

