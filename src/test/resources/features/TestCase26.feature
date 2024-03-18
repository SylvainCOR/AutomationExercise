Feature: Classic scroll down and up
  As a Customer
  I want to be able to scroll up and down
  So that I can move on the page by scrolling

  @TestCase26
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given Customer launched browser and go to Automation Exercise home page
    When Customer scrolls down to the bottom of page
    Then Customer can see title: SUBSCRIPTION
    When Customer scrolls up to the top of page
    Then Page is scrolled up and Customer can see visible text: "Full-Fledged practice website for Automation Engineers"