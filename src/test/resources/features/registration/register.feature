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
    When he enters name "johnwick" and email "johnwick117@gmail.com"
    And he clicks on Signup button
    Then he can see "ENTER ACCOUNT INFORMATION" on signup page
    When he fills account information details: Title "Mr", Name "johnwick", Email "johnwick117@gmail.com", Password "secret", Date of birth "31/12/1980"
    And he selects "newsletter" checkbox
    And he selects "special offer" checkbox
    And he fills address information details: First name "John", Last name "Wick", Company "", Address "", Address2 "", Country "", State "", City "", Zipcode "", Mobile Number ""
    And he clicks on Create Account button