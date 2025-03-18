Feature: Multiple Selection

  @MultiSelect
  Scenario: Verify multiple selections
    Given User is on the practice page
    When User selects multiple options from the list
    Then The selected options should be verified
