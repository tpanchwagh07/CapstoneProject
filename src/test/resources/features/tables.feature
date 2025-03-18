Feature: Table Data Verification

  @Table
  Scenario: Verify table data
    Given User is on the practice page
    When User retrieves data from the table
    Then The table data should be verified
