Feature: As a user i have be able to login so that i can see home screen

  @login
  Scenario: As a user i can login with valid credential
    Given user on dashboard for login
    When user input email
    And user input password
    And user click login
    Then user can see hompege
@1
  Scenario: As a user i want to login with input valid email and invalid password
    Given user on login screen
    When user input valid email
    And user input invalid password
    And user click login button
    Then user see error message password "Email or Password is incorrect"

@2
  Scenario: As a user i want to login with input invalid email and valid password
    Given user on login screen
    When user input invalid email
    And user input valid password
    And user click login button
    Then user see error message password "Email or Password is incorrect"
@3
  Scenario: As a user i want to login with input invalid email and invalid password
    Given user on login screen
    When user input invalid email
    And user input invalid password
    And user click login button
    Then user see error message password "Email or Password is incorrect"
@4
  Scenario: As a user i want to login with input empty email and valid password
    Given user on login screen
    When user input empty email
    And user input valid password
    And user click login button
    Then Then user could see error message "This field is required"
@5
  Scenario: As a user i want to login with input valid email and empty password
    Given user on login screen
    When user input valid email
    And user input empty password
    And user click login button
    Then Then user could see error message "This field is required"
