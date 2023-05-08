Feature: Add Worker

  Scenario: Adding a new worker
    Given an empty list of workers
    When a new worker with ID is added
    Then the worker should be added to the list


  Scenario: Adding an existing worker
    Given a list of workers with an existing worker
    When a new worker with the same ID is added
    Then the worker should not be added to the list
