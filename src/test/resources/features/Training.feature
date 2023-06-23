Feature: As a user I want to see video content for trainings

@3.3
  Scenario: As a user i can see video content for traning
    Given user on Gofit Homepage
    When user click Traning in homepage
    And user click Best Home Workout in "On Tranding"
    And user click Fat Burning
    And user click Start
    And user click next
    And user click skip
    And user click next
    And user click skip
    And user click finish
    And user click rated training
    Then User click Done