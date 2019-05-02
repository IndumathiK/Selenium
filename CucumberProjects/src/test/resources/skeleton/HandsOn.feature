@ProductScenario
Feature: EndtoEnd Scenario
login with Rick account and purchase product and complete the payment 

Background: login with valid credentials
Given user is in Home Page
When user Enters username and password and clicks on login button
Then user should be logged in and verifed

@AddtoCartPaymentProcedure
Scenario: Succesful Checkout
Given Navigate through All Categories-electronics and headphones
And Add product to shopping cart
When proceed to pay
And select brand and add credentials
Then redirects to the thank you page
  
