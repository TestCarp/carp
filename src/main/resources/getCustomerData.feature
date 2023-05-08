Feature: Customer Information

  Scenario: Display all customer information
    Given a list of customers exists
    When the worker requests to see all customer information
    Then the system displays the customer ID, name, phone, address, and email for each customer in the list