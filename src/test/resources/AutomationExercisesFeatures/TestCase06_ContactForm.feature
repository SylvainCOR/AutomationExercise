Feature: Contact form
  As a visitor
  I want to contact the website team
  So that I can report something or send a file

  @TestCase6
  Scenario: Contact Us Form
    Given Visitor launched browser and go to Automation Exercise home page
    When he clicks on Contact Us button
    Then he can see contact form title: GET IN TOUCH
    When he enters name "JackRakham" email "jackrakham@protonmail.ch" subject "Testing" and message "Hello! I'm still practising!"
    And he uploads file "files/pirate-flag.jpg"
    And he clicks on Submit button
    Then he confirm dialog box
    And he can see: Success! Your details have been submitted successfully.
    When he clicks on green Home button
    Then he can see the home page
