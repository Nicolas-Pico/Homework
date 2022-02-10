Feature: I as a user of SWAGLABS
  I want to make to purchase
  to get the products and check the tax
  Scenario: Make purchases
    Given William is on the home page
    When  William wants to buy products
    Then William sees its a message Tax: $1.92