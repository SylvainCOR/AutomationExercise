Feature: Subscription from cart page
  As a user
  I want a subscription button at the bottom of the page
  So that I can subscribe

  @TestCase11
  Scenario: Verify subscription in Cart page
    Given User launched browser and go to Automation Exercise home page
    When he clicks on Cart button
    And he scrolls down to the bottom of page
    Then he can see title: SUBSCRIPTION
    When he enters email "johnflint@protonmail.ch" in input
    And he clicks on arrow button
    Then he can see success message: You have been successfully subscribed!