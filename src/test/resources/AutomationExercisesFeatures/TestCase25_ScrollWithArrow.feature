Feature: Scroll up using arrow button
  As a customer
  I want an arrow button in the downright corner
  So that I can go easily to the top of page

  @TestCase25
  Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given Customer launched browser and go to Automation Exercise home page
    When he scrolls down to the bottom of page
    Then he can see title: SUBSCRIPTION
    When he clicks on Arrow button at bottom right side
    Then page is scrolled up and he can see visible text: "Full-Fledged practice website for Automation Engineers"