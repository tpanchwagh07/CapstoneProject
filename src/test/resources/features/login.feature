Feature: User Login

	@Login
  Scenario: User successfully logs in
  	Given User is on the practice page
  	When user is on the login page
    And user enters valid login credentials
    Then user should be logged in successfully