Feature: As a user i want to book online class so that i can take an online class

  Background:
    Given user was login
    And user on homeScreen
    And user click menu explore
    And user click permission location
    And user on exploreScreen

  @BookingOnline-6
  Scenario: As a user i want to book online class
    When user input online class
    And user click online class book button
    And user select online class package
    And user click button booking now
    And user click payment method button
    And user select payments method
    And user click button select
    And user click button continue to payment
    And user click Pay Now button
    And user input card number field
    And user input validity period field
    And user input cvv field
    And user click "Pay Now" again button
    Then user see successful to payment pop up