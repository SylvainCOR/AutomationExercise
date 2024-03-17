Feature: Product review
  As a Customer
  I want to write a product review
  So that I submit my impression

  @TestCase21
  Scenario: Add review on product
    Given Customer launched browser and go to Automation Exercise home page
    When Customer clicks on Products button
    Then Customer can see products list title: ALL PRODUCTS
    When Customer clicks on polo t-shirts View Product button
    Then Customer can see the text: WRITE YOUR REVIEW
    When Customer enters name "LongJohnSilver" email "longjohnsilver@protonmail.ch" and review "Good quality and fits perfectly. I recommend it!"
    And Customer clicks on review Submit button
    Then Customer can see success message: Thank you for your review.
