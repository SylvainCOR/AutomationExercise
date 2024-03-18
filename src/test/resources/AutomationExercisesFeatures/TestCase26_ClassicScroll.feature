Feature: Classic scroll down and up
  As a Customer
  I want to be able to scroll up and down
  So that I can move on the page by scrolling

  @TestCase26
  Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given Customer launched browser and go to Automation Exercise home page
    When he scrolls down to the bottom of page
    Then he can see title: SUBSCRIPTION
    When he scrolls up to the top of page
    Then page is scrolled up and he can see visible text: "Full-Fledged practice website for Automation Engineers"