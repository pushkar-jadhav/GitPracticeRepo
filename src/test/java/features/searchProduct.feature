Feature: Search and Place order for products

@smoke
Scenario: Search for product on both home and offers page
Given User is on GreenCart landing page
When User searched shortname "beet" and extracted actual name of the product
And User searched shortname "beet" in offers page 
Then check if product matches with landing page


#Scenario Outline: Search for product on both home and offers page
#Given User is on GreenCart landing page
#When User searched with <Name> and extracted actual name of the product
#And User searched for <Name> in offers page 
#Then check if product matches with landing page
#Examples:
#|Name|
#|Tom|
#|Beet|