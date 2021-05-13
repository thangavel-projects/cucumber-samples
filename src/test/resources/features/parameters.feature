Feature: Display Parameters in Glue Code
  Scenario: Given inputs and Display Numbers
  """
  This is sample comments
  """
  # also the same single comment
    When Customer salary is 5000 and name is "Muthu"
    Then Check if they are greater than 18

  Scenario Outline: Send multiple test data
    When pass <username> and <password>
    Then verify names <expectedU> and <expectedP>
    Examples:
      | username | password | expectedU | expectedP |
      | gold     | admin    | gold      | admin     |
      | gold1    | admin1   | gold1     | admin1    |
