@HomePage
Feature: Verify Home Page Sections

  Scenario: Verify title and sections on Home Page
    Given User is on the practice page
    Then I verify the page title
    And I verify all the following sections:
     	| Home        |
      | All courses |
      | Interview   |
      | Support     |
      | Blog        |