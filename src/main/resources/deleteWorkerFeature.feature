Feature: Deleting a worker from the list

  Scenario: Deleting a worker that exists in the list
    When a worker with id is deleted
    Then Deleted Done


  Scenario: Deleting a worker that does not exist in the list
    When a worker with id is deleted
    Then an error message should be displayed

