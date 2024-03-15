Feature: Access to exercise page
  As a tester
  I want to go to test cases page
  So that I can practise with automation

  @TestCase7 # Verify Test Cases Page
  Scenario: Navigation to test cases page
    Given Tester launched browser and go to Automation Exercise home page
    When Tester clicks on Test Cases button
    Then Tester can see the test_cases page