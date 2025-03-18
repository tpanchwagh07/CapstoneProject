Feature: Radio Button Selection

  @RadioButton
  Scenario: Verify radio button selection
    Given User is on the practice page
    When User selects a radio button
    Then The selected radio button should be verified