Feature: New user registration
  As a new user
  I want to create an account
  So that I get registered

  @TestCase1
  Scenario: Register user
    Given New User launched browser and go to Automation Exercise home page
    When he clicks on Signup Login button
    Then he can see: New User Signup!
    When he enters name "captainFlint" and email "johnflint@protonmail.ch"
    And he clicks on Signup button
    Then he can see: ENTER ACCOUNT INFORMATION
    When he fills account information details: Title "Mr.", Name "captainFlint", Email "johnflint@protonmail.ch", Password "walrus", Date of birth "07/07/1924"
    And he selects newsletter and special offers checkboxes
    And he fills address information details: First name "John", Last name "Flint", Company "New Providence", Address "6 Lewes Blvd", Address2 "", Country "Canada", State "Yukon", City "Whitehorse", Zipcode "Y1A3J4", Mobile Number "+18675555555"
    And he clicks on Create Account button
    Then he can see: ACCOUNT CREATED!
    When he clicks on account_created page Continue button
    Then he can see Logged in as "captainFlint" on home page
    When he clicks on Delete Account button
    Then he can see: ACCOUNT DELETED!
    When he clicks on delete_account page Continue button
    Then he can see the home page