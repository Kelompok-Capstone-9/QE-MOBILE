Feature: As a user i want to book offline class so that i can take an offline class

  Background:
    Given user is login
    And user on home screen
    And user click explore menu
    And user click location permission
    And user on explore screen

    @BookingOffline-8
    Scenario: As a user i want to book offline class
      When user input location
      And user input offline class
      And user select session
      And user click offline class book button
      And user select package
      And user click booking now button
      And user click select payment method button
      And user select payment method
      And user click select button
      And user click continue to payment button
      And user click pay now button
      And user input card number
      And user input validity period
      And user input cvv
      And user click "Pay Now" button
      Then user see successfully payment pop up
