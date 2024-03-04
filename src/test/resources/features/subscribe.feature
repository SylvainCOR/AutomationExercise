Feature: Subscription
  As a customer
  I want to subscribe to the most recent updates
  So that I can stay updated

  @TestCase10 # Verify Subscription in home page
  Scenario Outline: Verify subscription in home page
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> scrolls down to footer
    Then <actor> can see title: SUBSCRIPTION
    When <actor> enters email <email> in input
    And <actor> clicks on arrow button
    Then <actor> can see success message: You have been successfully subscribed!
    Examples:
      | actor    | email                     |
      | Customer | "johnflint@protonmail.ch" |

  @TestCase11 # Verify Subscription in Cart page
  Scenario Outline: Verify subscription in Cart page
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Cart button
    And <actor> scrolls down to footer
    Then <actor> can see title: SUBSCRIPTION
    When <actor> enters email <email> in input
    And <actor> clicks on arrow button
    Then <actor> can see success message: You have been successfully subscribed!
    Examples:
      | actor    | email                     |
      | Customer | "johnflint@protonmail.ch" |
