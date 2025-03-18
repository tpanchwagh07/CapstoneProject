Feature: All Courses Page

  Background:
    Given User is on the practice page
    When user is on the All Courses page

  @Category
  Scenario: Filter courses by category
    When user selects a category and clicks search
    Then relevant courses should be displayed

  @Search
  Scenario: Search for a course
    #When user searches for a course and clicks search
    Then the relevant course should be displayed
