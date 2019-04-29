Feature: Test Me App Admin
Scenario: Admin Add Product
    Given open testme and login as admin
    When admin select product and add to cart
    Then view products added 