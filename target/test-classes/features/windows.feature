Feature: Switching Windows 

  @Windows
  Scenario: Verify switching between windows
    Given User is on the practice page
    When User opens a new window 
    Then User should be able to switch back to the main window
