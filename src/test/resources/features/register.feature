Feature: As a user i have be able to register so that i can see login screen
@Regist
  Scenario: As a user i want to register with input valid name, email, password, and confirm password
    Given user on the login screen
    And user click "Dont Have account? Sign Up"
    When user input username
    And user input email for register
    And user input password for register
    And user input confirm password
    And user click Sign Up Button
    Then user view "Registration Successful"
@1.1
  Scenario: As a user i want to register with input valid name, empty email, valid password, and valid confirm password
    Given user on the login screen
    And user click "No account yet? Create one"
    When user input valid name
    And user input empty email for register
    And user input valid password for_register
    And user input valid confirm_password
    And user click register button
    Then user see "Enter Valid Email" error message
@1.2
  Scenario: As a user i want to register with input empty name, valid email, valid password, and valid confirm password
    Given user on the login screen
    And user click "No account yet? Create one"
    When user input empty name
    And user input valid email for register
    And user input valid password for register
    And user input valid confirm password
    And user click register button
    Then user view Enter Full Name error message
@1.3
  Scenario: As a user i want to register with input valid name, valid email, empty password, and valid confirm password
    Given user on the login screen
    And user click "No account yet? Create one"
    When user input valid name
    And user input valid email for register
    And user input empty password for register
    And user input valid confirm password
    And user click register button
    Then user can see "Enter Password" error message
@1.4
  Scenario: As a user i want to register with input valid name, valid email, valid password, and empty confirm password
    Given user on the login screen
    And user click "No account yet? Create one"
    When user input valid name
    And user input valid email for register
    And user input valid password for register
    And user input empty confirm password
    And user click register button
    Then user can see "Enter Password" error message
@1.5
  Scenario: As a user i want to register with input valid name, valid email, valid password, and invalid confirm password
    Given user on the login screen
    And user click "No account yet? Create one"
    When user input valid name
    And user input valid email for register
    And user input valid password for register
    And user input invalid confirm password
    And user click register button
    Then user can view "Password Does Not Matches" error message
@1.6
  Scenario: As a user i want to register with input Name less than 3 characters, valid email, valid password, and valid confirm password
    Given user on the login screen
    And user click "No account yet? Create one"
    When user input name 2 characters
    And user input valid email for register
    And user input valid password for register
    And user input valid confirm password
    And user click register button
    Then user view "Username must be between 3-25 characters" error message
@1.7
  Scenario: As a user i want to register with input Name numberic, valid email, valid password, and valid confirm password
    Given user on the login screen
    And user click "No account yet? Create one"
    When user input name numberic
    And user input valid email for register
    And user input valid password for register
    And user input valid confirm password
    And user click register button
    Then user view Username must be alphabetical only error message