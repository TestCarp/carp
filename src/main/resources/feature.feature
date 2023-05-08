Feature: Full information for the product
  Scenario: special treatment
    Given typeOfProduct and result
    When typeOfProduct is required special treatment
    Then result , typeOfProduct need special treatment

