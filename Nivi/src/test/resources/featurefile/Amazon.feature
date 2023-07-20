Feature: To validate the functionality of Amazon Application

  @TS001
  Scenario: To validate the signin functionality
    Given User clicks the sign in button in homepage
    When User enter the login credit
    Then Validate the success of login

   @TS002
  Scenario: To validate the search nivi
    Given user enter the keyword for the product search
    When sort the product by low to high
    Then Verify the suggested product

  @TS003
  Scenario: To validate the add to cart functionality
    Given user enter the keyword for the product search
    When user add the product
    Then verify the kart message

