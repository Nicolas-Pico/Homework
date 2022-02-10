Feature: I as a user of SWAGLABS
  I want to make to purchase
  to get the products and check the total
  Scenario: Make purchases and check total
    Given Sara is on the home page
    When  Sara wants to buy products
    Then Sara sees its a message Total: $86.38