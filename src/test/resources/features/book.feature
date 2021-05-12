Feature: Mapping Book Features to Object Type
  Scenario: Parsing title and author names
    Given Book details are provided
    | Harry Potter    |  J K Rowling  |
    | Vanakkam Tamil  |  Thangavel    |
    When I search for "Thangavel" Book
    Then I get 1 result sets

  Scenario: Convert Books into Mapping Examples
    Given Books and Author names are provided
      | title           |  author       |
      | Vanakkam Tamil  |  Thangavel    |
      | Harry Potter    |  J K Rowling  |
      | Harry Potter New|  J K Rowling  |
    When I search book name for "J K Rowling" book
    Then I get 2 result books