Feature: CaseStudy2 description
Scenario: the user added atleast 1 product to cart and performing to successfully order.
Given Type URL and login with valid Username
When Larry added a headphone to the cart
And checkout for the payment
And fills transaction details
Then the product is succesfully ordered
