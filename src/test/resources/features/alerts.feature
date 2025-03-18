Feature: Alert Handling

  @Alerts
  Scenario: Verify alert handling
    Given User is on the practice page
    When User triggers an alert
    Then User should be able to accept or dismiss the alert
