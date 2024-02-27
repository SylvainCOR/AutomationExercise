Feature: Contact form
  As a visitor
  I want to contact the website team
  So that I can report something or send a file

  @TestCase6 # Contact Us Form
  Scenario: Send file and message with contact form
    Given user launched browser and go to Automation Exercise home page
    When user clicks on Contact Us button
    Then user can see contact form title: GET IN TOUCH
    When user enters name "name" email "email" subject "subject" and message "message"
    And user uploads file "C:/Users/sylva/Downloads/pirate-flag.jpg"
    And user clicks on Submit button
    And user clicks on OK button
    Then user can see: Success! Your details have been submitted successfully.
    When user clicks on green Home button
    Then user can see the home page
