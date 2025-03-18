Feature: User Registration

	@Registeration
  Scenario: User successfully registers
  	Given User is on the practice page
    When user is on the registration page
    And user enters registration details and submits
    Then registration should be successful