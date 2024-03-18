Feature: Scroll up using arrow button
  As a Customer
  I want a arrow button in the downright corner
  So that I can go easily to the top of page

  @TestCase25
  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given Customer launched browser and go to Automation Exercise home page
    When Customer scrolls down to footer
    Then Customer can see title: SUBSCRIPTION
    When Customer clicks on Arrow button at bottom right side
    Then Page is scrolled up and Customer can see visible text: "Full-Fledged practice website for Automation Engineers"