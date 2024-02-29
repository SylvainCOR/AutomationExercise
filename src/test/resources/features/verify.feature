Feature: Access to exercise page
  As a new tester
  I want to go to test cases page
  So that I can practise with automation

  @TestCase7
  Scenario Outline: Verify navigation to test cases page
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Test Cases button
    Then <actor> can see the test_cases page
    Examples:
      | actor  |
      | Tester |