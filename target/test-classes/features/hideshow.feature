Feature: Hide and Show Elements

  @HideShow
  Scenario: Verify hiding and showing elements
    Given User is on the practice page
    When User hides or shows an element
    Then The element visibility should be verified
