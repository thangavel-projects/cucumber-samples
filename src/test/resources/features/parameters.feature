Feature: Display Parameters in Glue Code
  Scenario: Given inputs and Display Numbers
    When Customer salary is 5000 and name is "Muthu"
    Then Check if they are greater than 18

  Scenario Outline: Send multiple test data
    When pass <username> and <password>
    Then verify names
  Examples:
    | username  |   password  |
    | gold      |   admin     |
