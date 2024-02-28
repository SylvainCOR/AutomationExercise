Feature: Contact form
  As a visitor
  I want to contact the website team
  So that I can report something or send a file

  @TestCase6
  Scenario Outline: Send file and message with contact form
    Given <actor> launched browser and go to Automation Exercise home page
    When <actor> clicks on Contact Us button
    Then <actor> can see contact form title: GET IN TOUCH
    When <actor> enters name <name> email <email> subject <subject> and message <message>
    And <actor> uploads file <filepath>
    And <actor> clicks on Submit button
    And <actor> clicks on dialog box OK button
    Then <actor> can see: Success! Your details have been submitted successfully.
    When <actor> clicks on green Home button
    Then <actor> can see the home page
    Examples:
      | actor | name         | email                      | subject   | message             | filepath                                   |
      | user  | "JackRakham" | "jackrakham@protonmail.ch" | "Testing" | "Still practising!" | "C:/Users/sylva/Downloads/pirate-flag.jpg" |
