Feature: Switching Tabs

  @Tabs
  Scenario: Verify switching between browser tabs
    Given User is on the practice page
    When User opens a new tab
    Then User should be able to switch back to the main tab
