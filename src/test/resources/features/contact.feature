Feature: Contact form
  As a visitor
  I want to contact the website team
  So that I can report something or send a file

  @TestCase6 # Contact Us Form
  Scenario: Send file and message with contact form
    Given Visitor launched browser and go to Automation Exercise home page
    When Visitor clicks on Contact Us button
    Then Visitor can see contact form title: GET IN TOUCH
    When Visitor enters name "JackRakham" email "jackrakham@protonmail.ch" subject "Testing" and message "Hello! I'm still practising!"
    And Visitor uploads file "C:/Users/sylva/Downloads/pirate-flag.jpg"
    And Visitor clicks on Submit button
    Then Visitor confirm dialog box
    And Visitor can see: Success! Your details have been submitted successfully.
    When Visitor clicks on green Home button
    Then Visitor can see the home page
