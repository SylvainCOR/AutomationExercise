Feature: User Registration
  As a new user
  I want to be able to get registered
  So that I can sign in

  Background:
    Given User launched browser and go to Automation Exercise home page

  @TestCase1
  Scenario: Test Case 1: Register User
    When he clicks on Signup Login button
    Then he can see "New User Signup!" on login page
    When he enters name "captainFlint" and email "johnflint@protonmail.ch"
    And he clicks on Signup button
    Then he can see "ENTER ACCOUNT INFORMATION" on signup page
    When he fills account information details: Title "Mr", Name "captainFlint", Email "johnflint@protonmail.ch", Password "walrus", Date of birth "07/07/1924"
    And he selects "newsletter" checkbox
    And he selects "special offer" checkbox
    And he fills address information details: First name "John", Last name "Flint", Company "New Providence", Address "6 Lewes Blvd", Address2 "", Country "Canada", State "Yukon", City "Whitehorse", Zipcode "Y1A3J4", Mobile Number "+18675555555"
    And he clicks on Create Account button
    Then he can see "ACCOUNT CREATED!" on account_created page
    When he clicks on Continue button from account_created page
    Then he can see "Logged in as " "captainFlint" on home page
    When he clicks on Delete Account button
    Then he can see "ACCOUNT DELETED!" on delete_account page
    When he clicks on Continue button from delete_account page
    Then he can see the home page