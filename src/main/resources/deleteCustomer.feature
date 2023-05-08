Feature: Delete Customer

  Scenario: Delete an existing customer
    Given a list of customers
    When the customer with ID is deleted
    Then the customer with ID should be removed from the list

  Scenario: Delete a non-existent customer
    Given a list of customers
    When the customer with ID is attempted to be deleted
    Then no customer with ID should be found