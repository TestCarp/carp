Feature: Search Worker

  Scenario: Search a worker that exists in the list
    Given a list of workers
    When the worker with ID is searched for
    Then the worker with ID should be found

  Scenario: Search a worker that does not exist in the list
    Given a list of workers
    When a non-existent worker with ID is searched for
    Then no worker with ID should be found
