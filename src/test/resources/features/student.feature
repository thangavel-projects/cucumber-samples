Feature: Student Registration Module
  Scenario: Student Joins to University
    When Student Submit all details in University
    And University Accepts Documents and Admits to Join
    Then return 200 status code

