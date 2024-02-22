Feature: User Registration

  As a new user
  I want to be able to get registered
  So that I can sign in

  Background:
    Given User launched browser and go to Automation Exercise home page

  @TestCase
  Scenario: Test Case 1: Register User
    When he clicks on Signup Login button
    Then he can see "New User Signup!" on login page
    When he enters name "johnwick" and email "johnwick117@gmail.com"
    And he clicks on Signup button
    Then he can see "ENTER ACCOUNT INFORMATION" on signup page
    When he fills account information details: Title "Mr", Name "johnwick", Email "johnwick117@gmail.com", Password "secret", Date of birth "16/06/1980"
    And he selects newsletter and special offers checkboxes
    And he fills details: name "John", last name "Wick", company "Continental", address "6 Lewes Blvd", address2 "", country "Canada", state "Yukon", city "Whitehorse", zipcode "Y1A3J4" and number "+18675555555"


  @TestCase
  Scenario: Test Case 5: Register User with existing email
    When he clicks on Signup Login button
    Then he can see "New User Signup!" on login page
    When When he enters name "" and email "@gmail.com"
