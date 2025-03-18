Feature: Enable and Disable Fields

  @EnableDisable
  Scenario: Verify enabling and disabling of input fields
    Given User is on the practice page
    When User enables or disables the input field
    Then The input field state should be verified
