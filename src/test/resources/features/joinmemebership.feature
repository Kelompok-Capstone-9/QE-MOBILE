Feature: As a user i have be able to Join memberhip so that i can see login screen
@Test
  Scenario: As a user i want to Join Memberhip with Input Height, Height, Goals Weight,Choose Level Traning and PaymentMethod.
    Given user on Choose Gender Page
    And user Choose Gender Male
    And User click continue
    When user input your Height
    And User click continue
    And user input your weight
    And User click continue
    And user input Goal Weight
    And User click continue
    And user choose Traning Level Beginner
    And User click continue Traning Level Beginner
    And User choose unlimited access
    And User click continue
    And User Choose Payment Methode Gopay
    And User click select payment
    And User click select pay
    Then user view "Payment Successfull" done
