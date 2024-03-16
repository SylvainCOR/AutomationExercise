Feature: Subscription
  As a customer
  I want to subscribe to the most recent updates
  So that I can stay updated

  @TestCase10 # Verify Subscription in home page
  Scenario: Verify subscription in home page
    Given Customer launched browser and go to Automation Exercise home page
    When Customer scrolls down to footer
    Then Customer can see title: SUBSCRIPTION
    When Customer enters email "johnflint@protonmail.ch" in input
    And Customer clicks on arrow button
    Then Customer can see success message: You have been successfully subscribed!

  @TestCase11 # Verify Subscription in Cart page
  Scenario: Verify subscription in Cart page
    Given Customer launched browser and go to Automation Exercise home page
    When Customer clicks on Cart button
    And Customer scrolls down to footer
    Then Customer can see title: SUBSCRIPTION
    When Customer enters email "johnflint@protonmail.ch" in input
    And Customer clicks on arrow button
    Then Customer can see success message: You have been successfully subscribed!
