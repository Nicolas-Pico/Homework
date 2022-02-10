Feature: I as a user of SWAGLABS
  I want to validate if the filter option works
  to check validate that the first item that appears is the one with the highest price
  Scenario: Validate Filter Option
    Given Jorge is on the home page
    When Jorge wants validate filter options
    Then Jorge sees the item with the highest price first $49.99