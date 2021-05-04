Feature: Student Registration Module
  Rule: Many Students can apply for a course
    Scenario: Student Joins to University
      Given Student Submit all details in University
      When University Accepts Documents and Admits to Join
      Then return 1 as Id

