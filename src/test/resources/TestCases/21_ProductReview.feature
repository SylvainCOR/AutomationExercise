Feature: Product review
  As a customer
  I want to write a product review
  So that I submit my impression

  @TestCase21
  Scenario: Add review on product
    Given Customer launched browser and go to Automation Exercise home page
    When he clicks on Products button
    Then he can see products list title: ALL PRODUCTS
    When he clicks on polo t-shirts View Product button
    Then he can see the text: WRITE YOUR REVIEW
    When he enters name "LongJohnSilver" email "longjohnsilver@protonmail.ch" and review "Good quality and fits perfectly. I recommend it!"
    And he clicks on review Submit button
    Then he can see success message: Thank you for your review.