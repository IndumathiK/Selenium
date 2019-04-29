$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/CaseStudy2.feature");
formatter.feature({
  "name": "CaseStudy2 description",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "the user added atleast 1 product to cart and performing to successfully order.",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Type URL and login with valid Username",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderPayment.type_URL_and_login_with_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Larry added a headphone to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "OrderPayment.larry_added_a_headphone_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "checkout for the payment",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPayment.checkout_for_the_payment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fills transaction details",
  "keyword": "And "
});
formatter.match({
  "location": "OrderPayment.fills_transaction_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product is succesfully ordered",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderPayment.the_product_is_succesfully_ordered()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});