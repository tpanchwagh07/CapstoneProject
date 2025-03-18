Feature: Checkbox Selection

  @CheckBox
  Scenario: Verify checkbox selection
    Given User is on the practice page
    When User selects a checkbox
    Then The selected checkbox should be verified