Feature: As a user i have be able to login so that i can see all articles

@2.2
  Scenario: As a user i can see all articles
    Given user on "Gofit Homepage"
    When user click "view all" in homepage
    Then user can see all articles
@2.2
  Scenario: As a user i can see detail articles
    Given user on "Gofit Homepage"
    When user click "view all" in homepage
    And user click "Android Central" articles
    Then user can detail articles