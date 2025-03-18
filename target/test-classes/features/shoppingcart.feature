Feature: Shopping Cart Functionality

	@ShoppingCart
	Scenario: User buys the product
		Given User is on the practice page
		When User is on the shopping page
		Then User clicks on the cart
		And User checksout