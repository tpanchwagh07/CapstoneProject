Feature: Mouse Hover Actions

  @MouseHover
  Scenario: Verify mouse hover functionality
    Given User is on the practice page
    When User hovers over an element
    Then The hover action should display additional options