Feature: Update Worker

  Scenario: Update an existing worker
    When the worker with ID is updated
    Then the worker with ID should have the updated information

  Scenario: Update a non-existent worker
    When the worker with ID is attempted to be updated
    Then the worker with ID should not be found