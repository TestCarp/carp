Feature: Product Inventory

  Scenario: Get number of products
    Given There is a number of product in inventory
    When the worker request to see number of products
    Then display the total number of products
