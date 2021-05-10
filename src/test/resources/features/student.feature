Feature: Student Registration Module
  Rule: Many Students can apply for a course

    Scenario: Student Joins to University
      Given Student Submit all details in University
      When University Accepts Documents and Admits to Join
      Then return 1 as Id

    Scenario: Authenticate Login Details
      Given User name and password
      When Invoke authenticate end point
      Then Validate username and password

