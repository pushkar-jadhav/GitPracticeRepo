Feature: Place order for products

@regression
Scenario Outline: Search for product and add to cart
Given User is on GreenCart landing page
When User searched with <Name> and extracted actual name of the product
And User added '3' items of the selected product to cart
Then User proceeds to checkout and validate the <Name> items in checkout page
And verify user hass ability  to ener promo code and place the order
Examples:
|Name|
|Tom|
|beet|