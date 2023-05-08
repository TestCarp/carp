Feature: Customer Search

  Scenario: Search customer by email
    Given There are customers in the database
    When the worker searches for a customer by email
    Then the system should return true if the customer exists and false if they do not exist