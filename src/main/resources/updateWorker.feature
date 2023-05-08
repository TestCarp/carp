Feature: Update Worker

  Scenario: Update an existing worker
    Given a list of workers
    And the worker with ID exists in the list
    When the worker with ID is updated
    Then the worker with ID should have the updated information

  Scenario: Update a non-existent worker
    Given a list of workers
    And a non-existent worker with ID
    When the worker with ID is attempted to be updated
    Then the worker with ID should not be found