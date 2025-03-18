Feature: Dropdown Selection

  @Dropdown
  Scenario: Verify dropdown selection
    Given User is on the practice page
    When User selects an option from the dropdown
    Then The selected option should be verified
